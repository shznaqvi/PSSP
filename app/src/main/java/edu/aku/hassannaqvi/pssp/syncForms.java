package edu.aku.hassannaqvi.pssp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class SyncForms extends AsyncTask<Void, Void, String> {

    private static final String TAG = "SyncForms";
    private Context mContext;
    private ProgressDialog pd;


    public SyncForms(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i("TAG: ", str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Forms");
        pd.show();

    }


    @Override
    protected String doInBackground(Void... params) {

        String line = "No Response";

        HttpURLConnection connection = null;
        try {
            String request = "http://192.168.1.10/pssp/api/forms.php";
            //String request = "http://10.1.42.30:3000/forms";

            URL url = new URL(request);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setUseCaches(false);
            connection.connect();


            JSONArray jsonSync = new JSONArray();

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            DatabaseHelper db = new DatabaseHelper(mContext);
            Collection<FormsContract> forms = db.getAllForms();
            Log.d(TAG, String.valueOf(forms.size()));
//            pd.setMessage("Total Forms: " );
            for (FormsContract fc : forms) {

                /*JSONObject jsonParam = new JSONObject();

                jsonParam.put("_id", fc.getID());
                jsonParam.put("_uid", fc.getUID());
                jsonParam.put("projectname", fc.getProjectName());
                jsonParam.put("surveytype", fc.getSurveyType());
                jsonParam.put("mna1", fc.getMna1());
                jsonParam.put("mna2", fc.getMna2());
                jsonParam.put("mna3", fc.getMna3());
                jsonParam.put("mna4", fc.getMna4());
                jsonParam.put("mna5", fc.getMna5());
                jsonParam.put("mna6", fc.getMna6());
                jsonParam.put("mna6a", fc.getMna6a());
                jsonParam.put("mna7", fc.getMna7());
                jsonParam.put("sa", fc.getsA());
                //Log.d(TAG, "doInBackground: sA"+ jsonParam.getJSONObject("sA"));
                jsonParam.put("sb", fc.getsB());
                jsonParam.put("sc", fc.getsC());
                jsonParam.put("sd", fc.getsD());
                jsonParam.put("se", fc.getsE());
                jsonParam.put("sf", fc.getsF());
                jsonParam.put("sg", fc.getsG());
                jsonParam.put("gpslat", fc.getGpsLat());
                jsonParam.put("gpslng", fc.getGpsLng());
                jsonParam.put("gpsacc", fc.getGpsAcc());
                jsonParam.put("gpstime", DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(fc.getGpsTime())));
                jsonParam.put("deviceid", fc.getDeviceID());

                longInfo(jsonParam.toString());*/
                //jsonSync.put(fc.toJSONObject());
                jsonSync.put(fc.toJSONObject());
                //wr.writeBytes(jsonParam.toString().replace("\uFEFF", "") + "\n");

            }
            wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
            longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
            wr.flush();
            int HttpResult = connection.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
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
        return line;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        Toast.makeText(mContext, "Synced Forms " + result, Toast.LENGTH_SHORT).show();

        pd.setMessage("Server Response: " + result);
        pd.setTitle("Please wait... Done Forms");
        pd.show();
    }
}