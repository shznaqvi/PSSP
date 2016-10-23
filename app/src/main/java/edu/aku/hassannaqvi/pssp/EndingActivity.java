package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EndingActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.mna7)
    RadioGroup mna7;
    @BindView(R.id.mna7a)
    RadioButton mna7a;
    @BindView(R.id.mna7b)
    RadioButton mna7b;
    @BindView(R.id.mna7c)
    RadioButton mna7c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        mna7a.setEnabled(getIntent().getBooleanExtra("complete", true));

    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Closing Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Closing Form!", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, MainActivity.class);
                PSSPApp.mnb1 = "TEST";
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        Toast.makeText(this, "Database Updated!", Toast.LENGTH_SHORT).show();
        return true;
    }

    private void SaveDraft() {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Closing Section", Toast.LENGTH_SHORT).show();

        if (mna7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mna7), Toast.LENGTH_LONG).show();
            mna7c.setError("This data is Required!");
            Log.i(TAG, "mnd9: This data is Required!");
            return false;
        } else {
            mna7c.setError(null);
        }
        return true;
    }
}