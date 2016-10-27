package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    // District Spinner (used in LoginActivity)
    public static ArrayList<String> lables;
    public static ArrayList<String> values;

    @BindView(R.id.txtmna3)
    TextView txtmna3;
    @BindView(R.id.mna4)
    EditText mna4;
    @BindView(R.id.mna5)
    EditText mna5;
    @BindView(R.id.mna6)
    CheckBox mna6;
    @BindView(R.id.mna8)
    EditText mna8;
    @BindView(R.id.mna9)
    EditText mna9;
    @BindView(R.id.mna10)
    RadioGroup mna10;
    @BindView(R.id.mna10a)
    RadioButton mna10a;
    @BindView(R.id.mna10b)
    RadioButton mna10b;
    @BindView(R.id.mna10c)
    RadioButton mna10c;
    @BindView(R.id.mna10d)
    RadioButton mna10d;
    @BindView(R.id.mna10e)
    RadioButton mna10e;
    @BindView(R.id.mna10x)
    RadioButton mna10x;
    @BindView(R.id.mna10x96)
    EditText mna10x96;
    @BindView(R.id.mna11)
    EditText mna11;
    @BindView(R.id.mna12)
    RadioGroup mna12;
    @BindView(R.id.mna12a)
    RadioButton mna12a;
    @BindView(R.id.mna12b)
    RadioButton mna12b;
    @BindView(R.id.mna12c)
    RadioButton mna12c;
    @BindView(R.id.mna12d)
    RadioButton mna12d;
    @BindView(R.id.mna12e)
    RadioButton mna12e;
    @BindView(R.id.mna12f)
    RadioButton mna12f;
    @BindView(R.id.mna12g)
    RadioButton mna12g;
    @BindView(R.id.mna12x)
    RadioButton mna12x;
    @BindView(R.id.mna12x96)
    EditText mna12x96;
    @BindView(R.id.mna13)
    EditText mna13;
    @BindView(R.id.fldGrpmna6)
    LinearLayout fldGrpmna6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        lables = new ArrayList<String>();
        lables.add("K. Abdullah");
        lables.add("Quetta");
        lables.add("Pishin");
        lables.add("J & Bara");
        lables.add("Town 1 & 2");
        lables.add("Town 3 & 4");
        lables.add("K Zone 1");
        lables.add("K Zone 2");
        lables.add("K Zone 3");
        lables.add("Sukkur");
        lables.add("Larkhana");
        lables.add("Rawalpindi");
        lables.add("Lahore");
        lables.add("Multan");

        values = new ArrayList<String>();
        values.add("11");
        values.add("12");
        values.add("13");
        values.add("21");
        values.add("22");
        values.add("23");
        values.add("31");
        values.add("32");
        values.add("33");
        values.add("34");
        values.add("35");
        values.add("41");
        values.add("42");
        values.add("43");

        txtmna3.setText(getString(R.string.mna3) + ": " + lables.get(PSSPApp.mna3));

        mna6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmna6.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmna6.setVisibility(View.GONE);
                }
            }
        });
        mna10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mna10x.isChecked()) {
                    mna10x96.setVisibility(View.VISIBLE);
                } else {
                    mna10x96.setVisibility(View.GONE);
                    mna10x96.setText(null);
                }
            }
        });

        mna12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mna12x.isChecked()) {
                    mna12x96.setVisibility(View.VISIBLE);
                } else {
                    mna12x96.setVisibility(View.GONE);
                    mna12x96.setText(null);
                }
            }
        });

    }

    public void submitSecA(View v) {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section B", Toast.LENGTH_SHORT).show();
                Intent secB = new Intent(this, SectionBActivity.class);
                PSSPApp.chTotal = Integer.valueOf(mna13.getText().toString()) - 1; // exclude index child
                startActivity(secB);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void endForm(View v) {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
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
        Toast.makeText(this, "Validation Successfull! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        if (mna4.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna4), Toast.LENGTH_LONG).show();
            mna4.setError("This data is Required!");
            Log.i(TAG, "mna4: This data is Required!");
            return false;
        } else {
            mna4.setError(null);
        }

        if (mna5.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna5), Toast.LENGTH_LONG).show();
            mna5.setError("This data is Required!");
            Log.i(TAG, "mna5: This data is Required!");
            return false;
        } else {
            mna5.setError(null);
        }
        if (mna6.isChecked()) {


            if (mna8.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna8), Toast.LENGTH_LONG).show();
                mna8.setError("This data is Required!");
                Log.i(TAG, "mna8: This data is Required!");
                return false;
            } else {
                mna8.setError(null);
            }

            if (mna9.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna9), Toast.LENGTH_LONG).show();
                mna9.setError("This data is Required!");
                Log.i(TAG, "mna9: This data is Required!");
                return false;
            } else {
                mna9.setError(null);
            }

            if (mna10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna10), Toast.LENGTH_LONG).show();
                mna10x.setError("This data is Required!");
                Log.i(TAG, "mna10: This data is Required!");
                return false;
            } else if (mna10x.isChecked() && mna10x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna10), Toast.LENGTH_LONG).show();
                mna10x96.setError("Other is Required!");
                Log.i(TAG, "mna10: Other is Required!");

                mna10x.setError(null);
                return false;
            } else {
                mna10x96.setError(null);
            }

            if (mna11.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna11), Toast.LENGTH_LONG).show();
                mna11.setError("This data is Required!");
                Log.i(TAG, "mna11: This data is Required!");
                return false;
            } else if (Integer.valueOf(mna11.getText().toString()) < 14) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mna11), Toast.LENGTH_LONG).show();
                mna11.setError("This data is Invalid!");
                Log.i(TAG, "mna11: This data is Invalid!");
                return false;
            } else {
                mna11.setError(null);
            }

            if (mna12.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna12), Toast.LENGTH_LONG).show();
                mna12x.setError("This data is Required!");
                Log.i(TAG, "mna12: This data is Required!");
                return false;
            } else if (mna12x.isChecked() && mna12x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna12), Toast.LENGTH_LONG).show();
                mna12x96.setError("Other is Required!");
                Log.i(TAG, "mna12: Other is Required!");

                mna12x.setError(null);
                return false;
            } else {
                mna12x96.setError(null);
            }
            if (mna13.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mna13), Toast.LENGTH_LONG).show();
                mna13.setError("This data is Required!");
                Log.i(TAG, "mna13: This data is Required!");
                return false;
            } else {
                mna13.setError(null);
            }

        }
        return true;
    }

}
