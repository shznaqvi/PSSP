package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionBActivity extends Activity {

    private static final String TAG = SectionBActivity.class.getSimpleName();

    @BindView(R.id.mnb1)
    EditText mnb1;
    @BindView(R.id.mnb2)
    EditText mnb2;
    @BindView(R.id.mnb3)
    EditText mnb3;
    @BindView(R.id.mnb4)
    EditText mnb4;
    @BindView(R.id.ageDob)
    Switch ageDob;
    @BindView(R.id.fldGrpmnb4)
    LinearLayout fldGrpmnb4;
    @BindView(R.id.mnb5)
    DatePicker mnb5;
    @BindView(R.id.fldGrpmnb5)
    LinearLayout fldGrpmnb5;
    @BindView(R.id.mnb6m)
    EditText mnb6m;
    @BindView(R.id.mnb6d)
    EditText mnb6d;
    @BindView(R.id.mnb7)
    RadioGroup mnb7;
    @BindView(R.id.mnb7m)
    RadioButton mnb7m;
    @BindView(R.id.mnb7f)
    RadioButton mnb7f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);


        mnb4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 15) {
                    String[] cp = s.toString().split("-");
                    if (cp.length != 3 || cp[0].length() != 5 || cp[1].length() != 7 || cp[2].length() != 1) {
                        Toast.makeText(getApplicationContext(), "Incorrect CNIC!", Toast.LENGTH_SHORT).show();
                    } else {
                        mnb4.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.check_mark), null, null, null);
                        Toast.makeText(getApplicationContext(), "Correct CNIC!", Toast.LENGTH_SHORT).show();

                    }
                } else {
                    mnb4.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ageDob.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmnb4.setVisibility(View.VISIBLE);
                    fldGrpmnb5.setVisibility(View.GONE);
                    mnb6d.setText(null);
                    mnb6m.setText(null);
                } else {
                    fldGrpmnb4.setVisibility(View.GONE);
                    fldGrpmnb5.setVisibility(View.VISIBLE);
                }
            }
        });
        mnb5.setMaxDate(System.currentTimeMillis() - (PSSPApp.MILLISECONDS_IN_DAY * 30 * 6));
        mnb5.setMinDate(System.currentTimeMillis() - (PSSPApp.MILLISECONDS_IN_DAY * 30 * 11) + PSSPApp.MILLISECONDS_IN_DAY * 29);


    }

    public void submitSecB(View v) {
        Toast.makeText(this, "Processing Section B", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section B", Toast.LENGTH_SHORT).show();
                Intent secB = new Intent(this, SectionCActivity.class);
                startActivity(secB);
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
        Toast.makeText(this, "Validating Section B", Toast.LENGTH_SHORT).show();


        if (mnb1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getResources().getResourceTypeName(R.string.mnb1), Toast.LENGTH_LONG).show();
            mnb1.setError("This data is Required!");
            Log.i(TAG, "mnb1: This data is Required!");
            return false;
        } else {
            mnb1.setError(null);
        }

        if (mnb2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getResources().getResourceTypeName(R.string.mnb2), Toast.LENGTH_LONG).show();
            mnb2.setError("This data is Required!");
            Log.i(TAG, "mnb2: This data is Required!");
            return false;
        } else {
            mnb2.setError(null);
        }

        if (mnb3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getResources().getResourceTypeName(R.string.mnb3), Toast.LENGTH_LONG).show();
            mnb3.setError("This data is Required!");
            Log.i(TAG, "mnb3: This data is Required!");
            return false;
        } else {
            mnb3.setError(null);
        }

        if (mnb4.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getResources().getResourceTypeName(R.string.mnb4), Toast.LENGTH_LONG).show();
            mnb4.setError("This data is Required!");
            Log.i(TAG, "mnb4: This data is Required!");
            return false;
        } else {
            if (mnb4.length() == 15) {
                String[] cp = mnb4.toString().split("-");
                if (cp.length != 3 || cp[0].length() != 5 || cp[1].length() != 7 || cp[2].length() != 1) {
                    Toast.makeText(this, "ERROR(incorrect): " + getResources().getResourceTypeName(R.string.mnb4), Toast.LENGTH_LONG).show();
                    mnb4.setError("CNIC is incorrect");
                    Log.i(TAG, "mnb4: CNIC is incorrect");
                    return false;
                } else {
                    mnb4.setError(null);
                }
            } else {
                Toast.makeText(this, "ERROR(incomplete): " + getResources().getResourceTypeName(R.string.mnb4), Toast.LENGTH_LONG).show();
                mnb4.setError("CNIC is incomplete");
                Log.i(TAG, "mnb4: CNIC is incomplete");
                return false;
            }
        }

        if (ageDob.isChecked()) {


        }

        return true;
    }
}
