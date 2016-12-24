package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

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
    @BindView(R.id.mnb4x95)
    CheckBox mnb4x95;
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
    @BindView(R.id.fldGrpmnb4x96)
    LinearLayout fldGrpmnb4x96;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

        mnb4x95.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmnb4x96.setVisibility(View.GONE);
                    mnb4.setText(null);
                } else {
                    fldGrpmnb4x96.setVisibility(View.VISIBLE);

                }
            }
        });
        mnb4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Toast.makeText(SectionBActivity.this, s+"|"+start+"|"+before+"|"+count, Toast.LENGTH_SHORT).show();
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
                    if (before == 0 && (s.length() == 5 || s.length() == 13)) {
                        mnb4.append("-");
                    }

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
        mnb5.setMaxDate(System.currentTimeMillis() - ((PSSPApp.MILLISECONDS_IN_DAY * 30) * 6));
        mnb5.setMinDate(System.currentTimeMillis() - ((PSSPApp.MILLISECONDS_IN_DAY * 30) * 11) + PSSPApp.MILLISECONDS_IN_DAY * 29);


    }

    public void submitSecB(View v) throws JSONException {
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

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSB();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {

        JSONObject sb = new JSONObject();

        // Data of Birth conversion from DataPicker
        String DOB = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(mnb5.getCalendarView().getDate());


        sb.put("mnb1", mnb1.getText().toString());
        sb.put("mnb2", mnb2.getText().toString());
        sb.put("mnb3", mnb3.getText().toString());
        sb.put("mnb4", mnb4.getText().toString());
        sb.put("mnb5", ageDob.isChecked() ? DOB : "");
        sb.put("mnb6d", mnb6d.getText().toString());
        sb.put("mnb6m", mnb6m.getText().toString());
        sb.put("mnb7", mnb7m.isChecked() ? "1" : "2");

        PSSPApp.fc.setsB(String.valueOf(sb));


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {
        Toast.makeText(this, "Validating Section B", Toast.LENGTH_SHORT).show();


        if (mnb1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnb1), Toast.LENGTH_LONG).show();
            mnb1.setError("This data is Required!");
            Log.i(TAG, "mnb1: This data is Required!");
            return false;
        } else {
            mnb1.setError(null);
        }

        if (mnb2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnb2), Toast.LENGTH_LONG).show();
            mnb2.setError("This data is Required!");
            Log.i(TAG, "mnb2: This data is Required!");
            return false;
        } else {
            mnb2.setError(null);
        }

        if (mnb3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnb3), Toast.LENGTH_LONG).show();
            mnb3.setError("This data is Required!");
            Log.i(TAG, "mnb3: This data is Required!");
            return false;
        } else {
            mnb3.setError(null);
        }

        if (!mnb4x95.isChecked()) {
        if (mnb4.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnb4), Toast.LENGTH_LONG).show();
            mnb4.setError("This data is Required!");
            Log.i(TAG, "mnb4: This data is Required!");
            return false;
        } else if (mnb4.length() == 15) {
            Toast.makeText(this, mnb4.getText().toString(), Toast.LENGTH_SHORT).show();
            String[] cp = mnb4.getText().toString().split("-");
            mnb4.setError(null);
            if (cp.length != 3 || cp[0].length() != 5 || cp[1].length() != 7 || cp[2].length() != 1) {
                Toast.makeText(this, "ERROR(incorrect): " + getString(R.string.mnb4), Toast.LENGTH_LONG).show();
                mnb4.setError("CNIC is incorrect");
                Log.i(TAG, "mnb4: CNIC is incorrect");
                return false;
            } else {
                mnb4.setError(null);

            }
        } else if (mnb4.length() < 15) {
            mnb4.setError(null);
            Toast.makeText(this, "ERROR(incomplete): " + getString(R.string.mnb4), Toast.LENGTH_LONG).show();
            mnb4.setError("CNIC is incomplete");
            Log.i(TAG, "mnb4: CNIC is incomplete");
            return false;
        } else {
            mnb4.setError(null);
        }
        }


        if (!ageDob.isChecked()) {
            if (mnb6d.getText().toString().isEmpty() || mnb6m.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(incomplete): " + getString(R.string.mnb6), Toast.LENGTH_LONG).show();
                mnb6d.setError("Age not given");
                Log.i(TAG, "mnb6: Age no given");
                return false;
            } else if (Integer.valueOf(mnb6d.getText().toString()) > 29 || Integer.valueOf(mnb6m.getText().toString()) > 11 || Integer.valueOf(mnb6m.getText().toString()) < 6) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mnb6), Toast.LENGTH_LONG).show();
                mnb6m.setError("This is invalid");
                Log.i(TAG, "This is invalid");
                return false;
            } else {
                mnb6d.setError(null);
            }

        }

        if (mnb7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnb7), Toast.LENGTH_LONG).show();
            mnb7m.setError("Data is required!");
            Log.i(TAG, "mnb7: Age no given");
            return false;
        } else {
            mnb7m.setError(null);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Button NOT Allowed!", Toast.LENGTH_SHORT).show();

    }
}
