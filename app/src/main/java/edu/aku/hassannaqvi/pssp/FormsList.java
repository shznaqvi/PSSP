package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormsList extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_list);

        String psu = getIntent().getStringExtra("psu_no");
        TextView cNo = (TextView) findViewById(R.id.psuNoTxt);
        TextView tf = (TextView) findViewById(R.id.totalForms);
        TextView cf = (TextView) findViewById(R.id.completeForms);
        int fTotal = 0;
        int fComplete = 0;
        cNo.setText("Forms for Cluster: " + psu);
        Log.d("TAG:Cluster", psu);
        DatabaseHelper db = new DatabaseHelper(getApplicationContext());
        List<FormsContract> forms = db.getFormsByPSU(psu);

//        Sample Testing
//        List<FormsContract> forms = new ArrayList<>();
//        forms.add(new FormsContract("1","1","Ali"));
//        forms.add(new FormsContract("2","2","Ali"));
//        forms.add(new FormsContract("3","3","Ali"));
//        forms.add(new FormsContract("4","2","Ali"));
//        forms.add(new FormsContract("5","1","Ali"));


        for (FormsContract fc : forms) {
            fTotal++;
            if (fc.getMna7().contains("1")) {
                fComplete++;
            }
        }
        tf.setText("Total Forms: " + fTotal);
        cf.setText("Complete Forms: " + fComplete);

        mRecyclerView = (RecyclerView) findViewById(R.id.FormsList);

//        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);


        mAdapter = new FormsAdapter(forms, getApplication());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(5000);
        itemAnimator.setRemoveDuration(5000);
        mRecyclerView.setItemAnimator(itemAnimator);

    }

    public void toast(View v) {
        v.getId();
        Toast.makeText(FormsList.this, String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();
    }
}




