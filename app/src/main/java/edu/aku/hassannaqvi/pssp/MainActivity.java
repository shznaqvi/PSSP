package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    private String rSumText = "";

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.clusterNo)
    EditText clusterNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        PSSPApp.mnb1 = "Test";
        PSSPApp.chCount = 0;
        PSSPApp.chTotal = 0;

        if (PSSPApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }


        DatabaseHelper db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = new ArrayList<>();

        todaysForms = db.getTodayForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";
        rSumText += "=======================";
        rSumText += "\r\n\r\n";
        rSumText += "Total Forms Today: "+todaysForms.size();
        rSumText += "\r\n";
        rSumText += "    Forms List: \r\n";
        String iStatus = "";
        for(FormsContract fc : todaysForms){

            switch (fc.getMna7()) {
                case "1":
                    iStatus = "Complete";
                    break;
                case "2":
                    iStatus = "House Locked";
                    break;
                case "3":
                    iStatus = "Refused";
                    break;
                case "4":
                    iStatus = "Refused";
                    break;
            }

            rSumText += fc.getMna4() + " " + fc.getMna5() + " " + iStatus;
            rSumText += "\r\n";

        }

        rSumText += "--------------------------------------------------\r\n";
        if (PSSPApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Update: " + syncPref.getString("LastUpdate", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Synced(DB): " + syncPref.getString("LastSyncDB", "Never Synced");
            rSumText += "\r\n";
        }
        recordSummary.setText(rSumText);


    }

    public void openForm(View v) {
        Intent oF = new Intent(this, SectionAActivity.class);
        startActivity(oF);
    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        Intent iD = new Intent(this, SectionEActivity.class);
        startActivity(iD);
    }

    public void openF(View v) {
        Intent iD = new Intent(this, SectionFActivity.class);
        startActivity(iD);
    }

    public void openIM(View v) {
        Intent iIM = new Intent(this, SectionIMActivity.class);
        startActivity(iIM);
    }

    public void openG(View v) {
        Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);
    }

    public void openEnd(View v) {
        Intent iEnd = new Intent(this, EndingActivity.class);
        startActivity(iEnd);
    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }
    /*public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("clusterno", clusterNo.getText().toString());
        startActivity(cluster_list);

    }*/
    public void syncServer(View view) {

        String formsUrl = PSSPApp._HOST_URL + "pssp/api/forms.php";
        String imsUrl = PSSPApp._HOST_URL + "pssp/api/ims.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute(formsUrl);

            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();
            new SyncIMs(this).execute(imsUrl);
            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {
        if (isNetworkAvailable()) {


            GetUsers gu = new GetUsers(this);
            Toast.makeText(getApplicationContext(), "Syncing Users", Toast.LENGTH_SHORT).show();
            gu.execute();

            GetChildren gc = new GetChildren(this);
            Toast.makeText(getApplicationContext(), "Syncing Children", Toast.LENGTH_SHORT).show();
            gc.execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo(DOWN)", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncDevice ", dtToday);

            editor.apply();
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private boolean isHostAvailable() {

        if (isNetworkAvailable()) {
            try {
                SocketAddress sockaddr = new InetSocketAddress(PSSPApp._IP, PSSPApp._PORT);
                // Create an unbound socket
                Socket sock = new Socket();

                // This method will block no more than timeoutMs.
                // If the timeout occurs, SocketTimeoutException is thrown.
                int timeoutMs = 2000;   // 2 seconds
                sock.connect(sockaddr, timeoutMs);
                return true;
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Server Not Available for Update", Toast.LENGTH_SHORT).show();
                return false;
            }

        } else {
            Toast.makeText(getApplicationContext(), "Network not available for Update", Toast.LENGTH_SHORT).show();
            return false;

        }
    }
}
