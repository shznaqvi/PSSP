package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionGActivity extends Activity {

    private static final String TAG = SectionGActivity.class.getSimpleName();


    @BindView(R.id.activity_section_g)
    ScrollView activitySectionG;
    @BindView(R.id.mng1)
    RadioGroup mng1;
    @BindView(R.id.mng1a)
    RadioButton mng1a;
    @BindView(R.id.mng1b)
    RadioButton mng1b;
    @BindView(R.id.mng2)
    EditText mng2;
    @BindView(R.id.mngsticker)
    EditText mngsticker;
    @BindView(R.id.fldGrpmng1)
    LinearLayout fldGrpmng1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);

        mng1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mng1a.isChecked()) {
                    fldGrpmng1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmng1.setVisibility(View.GONE);
                    mng2.setText(null);
                    mngsticker.setText(null);
                    mngsticker.setEnabled(true);
                }
            }
        });


    }


    public void submitSecG(View v) {
        Toast.makeText(this, "Processing Section G", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDG()) {
                Toast.makeText(this, "Starting Section G", Toast.LENGTH_SHORT).show();
                Intent secG = new Intent(this, EndingActivity.class);
                startActivity(secG);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDG() {
        Toast.makeText(this, "Database Updated!", Toast.LENGTH_SHORT).show();
        return true;
    }

    private void SaveDraft() {
        Toast.makeText(this, "Validation Successfull! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {
        Toast.makeText(this, "Validating Section G", Toast.LENGTH_SHORT).show();

        if (mng1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mng1), Toast.LENGTH_LONG).show();
            mng1b.setError("This data is Required!");
            Log.i(TAG, "mng1: This data is Required!");
            return false;
        } else {
            mng1b.setError(null);
        }

        // G2
        if (mng1a.isChecked() && mng2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mng2), Toast.LENGTH_LONG).show();
            mng2.setError("This data is Required!");
            Log.i(TAG, "mng2: This data is Required!");
            return false;
        } else if (mng1a.isChecked() && Integer.valueOf(mng2.getText().toString()) > 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mng2), Toast.LENGTH_LONG).show();
            mng2.setError("This data is invalid!");
            Log.i(TAG, "mng2: This data is invalid!");
            return false;
        } else {
            mng2.setError(null);
        }
        if (mng1a.isChecked() && mngsticker.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mngsticker), Toast.LENGTH_LONG).show();
            mngsticker.setError("This data is Required!");
            Log.i(TAG, "mngsticker: This data is Required!");
            return false;
        } else if (mng1a.isChecked() && mngsticker.getText().toString().replace("§", "").length() > 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mngsticker), Toast.LENGTH_LONG).show();
            mngsticker.setError("This data is invalid!");
            Log.i(TAG, "mngsticker: This data is invalid!");
            return false;
        } else {
            mngsticker.setError(null);
        }


        return true;
    }


    /*
        ZXing Android Embedded:
        =---------=----------=
        https://github.com/journeyapps/zxing-android-embedded
    */
    public void startScan(View view) {
        mngsticker.setText(null);
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Scan a blood sample sticker");
        integrator.setCameraId(0);  // Use a specific camera of the device
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
        integrator.setOrientationLocked(false);

        integrator.initiateScan();
    }

    // Get the results:
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
                mngsticker.setText("§" + result.getContents());
                mngsticker.setEnabled(false);
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
