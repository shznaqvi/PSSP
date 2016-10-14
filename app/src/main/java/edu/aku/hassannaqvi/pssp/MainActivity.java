package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }
}
