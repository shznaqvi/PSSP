package edu.aku.hassannaqvi.pssp.sync;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

import edu.aku.hassannaqvi.pssp.contracts.IMsContract;
import edu.aku.hassannaqvi.pssp.core.DatabaseHelper;
import edu.aku.hassannaqvi.pssp.core.PSSPApp;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class SyncIMs extends AsyncTask<Void, Void, String> {

    private static final String TAG = "SyncIms";
    private Context mContext;
    private ProgressDialog pd;


    public SyncIMs(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i(TAG, str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Ims");
        pd.show();
    }


    @Override
    protected String doInBackground(Void... params) {

        return downloadUrl(PSSPApp._HOST_URL + "pssp/api/" + IMsContract.IMsTable._URL);

    }

    private String downloadUrl(String myurl) {
        String line = "No Response";

        DatabaseHelper db = new DatabaseHelper(mContext);
        Collection<IMsContract> Ims;
        //if (flag) {
        Ims = db.getUnsyncedIMs();
        //} else {
        //Ims = db.getImsSg();
        //}
        Log.d(TAG, String.valueOf(Ims.size()));

        if (Ims.size() > 0) {

            HttpURLConnection connection = null;
            try {
                String request = myurl;
                //String request = "http://10.1.42.30:3000/Ims";

                URL url = new URL(request);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                int HttpResult = connection.getResponseCode();
                if (HttpResult == HttpURLConnection.HTTP_OK) {
                    JSONArray jsonSync = new JSONArray();
                    connection = (HttpURLConnection) url.openConnection();

                    connection.setDoOutput(true);
                    connection.setDoInput(true);
                    connection.setInstanceFollowRedirects(false);
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setRequestProperty("charset", "utf-8");
                    connection.setUseCaches(false);
                    connection.connect();


                    DataOutputStream wr = new DataOutputStream(connection.getOutputStream());

//            pd.setMessage("Total Ims: " );

                    for (IMsContract fc : Ims) {
                        //if (fc.getIstatus().equals("1")) {
                        jsonSync.put(fc.toJSONObject());
                        //}
                    }
                    wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
//                    longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
                    wr.flush();


                    BufferedReader br = new BufferedReader(new InputStreamReader(
                            connection.getInputStream(), "utf-8"));
                    StringBuffer sb = new StringBuffer();

                    while ((line = br.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    br.close();

                    System.out.println("" + sb.toString());
                    return sb.toString();
                } else {
                    System.out.println(connection.getResponseMessage());
                    return connection.getResponseMessage();
                }
            } catch (MalformedURLException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (connection != null)
                    connection.disconnect();
            }
        } else {
            return "No new records to sync";
        }
        return line;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        int sSynced = 0;
        int sDuplicate = 0;
        String sSyncedError = "";
        JSONArray json = null;
        try {
            json = new JSONArray(result);

            DatabaseHelper db = new DatabaseHelper(mContext); // Database Helper
            for (int i = 0; i < json.length(); i++) {
                JSONObject jsonObject = new JSONObject(json.getString(i));
                if (jsonObject.getString("status").equals("1") && jsonObject.getString("error").equals("0")) {

                    db.updateSyncedIMs(jsonObject.getString("id"));  // UPDATE SYNCED
                    sSynced++;
                } else if (jsonObject.getString("status").equals("2") && jsonObject.getString("error").equals("0")) {
                    db.updateSyncedIMs(jsonObject.getString("id")); // UPDATE DUPLICATES
                    sDuplicate++;
                } else {
                    sSyncedError += "\nError: " + jsonObject.getString("message");
                }
            }
            Toast.makeText(mContext, " Ims synced: " + sSynced + "\r\n\r\n Errors: " + sSyncedError, Toast.LENGTH_SHORT).show();

            pd.setMessage(" Ims synced: " + sSynced + "\r\n\r\n Duplicates: " + sDuplicate + "\r\n\r\n Errors: " + sSyncedError);
            pd.setTitle("Done uploading Ims data");
            pd.show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();

            pd.setMessage(result);
            pd.setTitle("Ims Sync Failed");
            pd.show();


        }
    }
}