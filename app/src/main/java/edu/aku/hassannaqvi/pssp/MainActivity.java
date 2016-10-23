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

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);
    }
    public void openG(View v) {
        Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);
    }
}
