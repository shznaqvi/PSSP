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
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionCActivity extends Activity {
    private static final String TAG = SectionCActivity.class.getSimpleName();

    @BindView(R.id.activity_section_c)
    ScrollView activitySectionC;
    @BindView(R.id.txtmnc1)
    TextView txtmnc1;
    @BindView(R.id.mnc1)
    RadioGroup mnc1;
    @BindView(R.id.mnc1a)
    RadioButton mnc1a;
    @BindView(R.id.mnc1b)
    RadioButton mnc1b;
    @BindView(R.id.mnc1c)
    RadioButton mnc1c;
    @BindView(R.id.txtmnc2)
    TextView txtmnc2;
    @BindView(R.id.mnc2)
    RadioGroup mnc2;
    @BindView(R.id.mnc2a)
    RadioButton mnc2a;
    @BindView(R.id.mnc2b)
    RadioButton mnc2b;
    @BindView(R.id.mnc2c)
    RadioButton mnc2c;
    @BindView(R.id.fldGrpmnc3)
    LinearLayout fldGrpmnc3;
    @BindView(R.id.mnc3)
    RadioGroup mnc3;
    @BindView(R.id.mnc3a)
    RadioButton mnc3a;
    @BindView(R.id.mnc3b)
    RadioButton mnc3b;
    @BindView(R.id.fldGrpmnc4)
    LinearLayout fldGrpmnc4;
    @BindView(R.id.txtmnc4)
    TextView txtmnc4;
    @BindView(R.id.mnc4)
    RadioGroup mnc4;
    @BindView(R.id.mnc4a)
    RadioButton mnc4a;
    @BindView(R.id.mnc4b)
    RadioButton mnc4b;
    @BindView(R.id.mnc4c)
    RadioButton mnc4c;
    @BindView(R.id.mnc5bcg)
    EditText mnc5bcg;
    @BindView(R.id.mnc5opv0)
    EditText mnc5opv0;
    @BindView(R.id.mnc5p1)
    EditText mnc5p1;
    @BindView(R.id.mnc5pcv1)
    EditText mnc5pcv1;
    @BindView(R.id.mnc5opv1)
    EditText mnc5opv1;
    @BindView(R.id.mnc5p2)
    EditText mnc5p2;
    @BindView(R.id.mnc5pcv2)
    EditText mnc5pcv2;
    @BindView(R.id.mnc5opv2)
    EditText mnc5opv2;
    @BindView(R.id.mnc5p3)
    EditText mnc5p3;
    @BindView(R.id.mnc5pcv3)
    EditText mnc5pcv3;
    @BindView(R.id.mnc5opv3)
    EditText mnc5opv3;
    @BindView(R.id.mnc5ipv1)
    EditText mnc5ipv1;
    @BindView(R.id.mnc5m1)
    EditText mnc5m1;
    @BindView(R.id.mnc5ipv2)
    EditText mnc5ipv2;
    @BindView(R.id.mnc5m2)
    EditText mnc5m2;
    @BindView(R.id.mnc5ipv3)
    EditText mnc5ipv3;
    @BindView(R.id.txtmnc6)
    TextView txtmnc6;
    @BindView(R.id.mnc6)
    RadioGroup mnc6;
    @BindView(R.id.mnc6a)
    RadioButton mnc6a;
    @BindView(R.id.mnc6b)
    RadioButton mnc6b;
    @BindView(R.id.mnc6c)
    RadioButton mnc6c;
    @BindView(R.id.txtmnc7)
    TextView txtmnc7;
    @BindView(R.id.mnc7)
    RadioGroup mnc7;
    @BindView(R.id.mnc7a)
    RadioButton mnc7a;
    @BindView(R.id.mnc7b)
    RadioButton mnc7b;
    @BindView(R.id.mnc7c)
    RadioButton mnc7c;
    @BindView(R.id.txtmnc8)
    TextView txtmnc8;
    @BindView(R.id.mnc8)
    EditText mnc8;
    @BindView(R.id.txtmnc9)
    TextView txtmnc9;
    @BindView(R.id.mnc9)
    RadioGroup mnc9;
    @BindView(R.id.mnc9a)
    RadioButton mnc9a;
    @BindView(R.id.mnc9b)
    RadioButton mnc9b;
    @BindView(R.id.mnc9c)
    RadioButton mnc9c;
    @BindView(R.id.mnc10yy)
    EditText mnc10yy;
    @BindView(R.id.mnc10mm)
    EditText mnc10mm;
    @BindView(R.id.mnc11)
    RadioGroup mnc11;
    @BindView(R.id.mnc11a)
    RadioButton mnc11a;
    @BindView(R.id.mnc11b)
    RadioButton mnc11b;
    @BindView(R.id.mnc11c)
    RadioButton mnc11c;
    @BindView(R.id.mnc11d)
    RadioButton mnc11d;
    @BindView(R.id.mnc11name)
    EditText mnc11name;
    @BindView(R.id.mnc12)
    RadioGroup mnc12;
    @BindView(R.id.mnc12a)
    RadioButton mnc12a;
    @BindView(R.id.mnc12b)
    RadioButton mnc12b;
    @BindView(R.id.txtmnc13)
    TextView txtmnc13;
    @BindView(R.id.mnc13)
    RadioGroup mnc13;
    @BindView(R.id.mnc13a)
    RadioButton mnc13a;
    @BindView(R.id.mnc13b)
    RadioButton mnc13b;
    @BindView(R.id.mnc13c)
    RadioButton mnc13c;
    @BindView(R.id.mnc13d)
    RadioButton mnc13d;

    @BindView(R.id.fldGrpmnc10)
    LinearLayout fldGrpmnc10;
    @BindView(R.id.fldGrpmnc12)
    LinearLayout fldGrpmnc12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);


        txtmnc1.setText(txtmnc1.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc2.setText(txtmnc2.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc4.setText(txtmnc4.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc6.setText(txtmnc6.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc7.setText(txtmnc7.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc8.setText(txtmnc8.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnc9.setText(txtmnc9.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));


        // SKIP PATTERNS
        mnc2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mnc2a.isChecked()) {
                    fldGrpmnc3.setVisibility(View.VISIBLE);
                    fldGrpmnc4.setVisibility(View.GONE);
                    mnc4.clearCheck();
                }
                if (mnc2b.isChecked() || mnc2c.isChecked()) {
                    fldGrpmnc3.setVisibility(View.GONE);
                    fldGrpmnc4.setVisibility(View.VISIBLE);
                    mnc3.clearCheck();
                }
            }
        });

        mnc9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mnc9a.isChecked()) {
                    fldGrpmnc10.setVisibility(View.VISIBLE);
                    fldGrpmnc12.setVisibility(View.GONE);
                    mnc12.clearCheck();
                }
                if (mnc9b.isChecked() || mnc9c.isChecked()) {
                    fldGrpmnc10.setVisibility(View.GONE);
                    fldGrpmnc12.setVisibility(View.VISIBLE);
                    mnc10yy.setText(null);
                    mnc10mm.setText(null);
                    mnc11.clearCheck();
                    mnc11name.setText(null);
                }
            }
        });

        mnc11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mnc11d.isChecked()) {
                    mnc11name.setVisibility(View.VISIBLE);
                } else {
                    mnc11name.setVisibility(View.GONE);
                }
            }
        });

    }

    public void submitSecC(View v) {
        Toast.makeText(this, "Processing Section C", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section C", Toast.LENGTH_SHORT).show();
                Intent secC = new Intent(this, SectionDActivity.class);
                startActivity(secC);
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

        Toast.makeText(this, "Validating Section C", Toast.LENGTH_SHORT).show();

        // C1
        if (mnc1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc1), Toast.LENGTH_LONG).show();
            mnc1c.setError("This data is Required!");
            Log.i(TAG, "mnc1: This data is Required!");
            return false;
        } else {
            mnc1c.setError(null);
        }

        // C2
        if (mnc2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc2), Toast.LENGTH_LONG).show();
            mnc2c.setError("This data is Required!");
            Log.i(TAG, "mnc2: This data is Required!");
            return false;
        } else {
            mnc2c.setError(null);
        }

        // C3 (with C2 = Yes)
        if (mnc2a.isChecked() && mnc3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc3), Toast.LENGTH_LONG).show();
            mnc3b.setError("This data is Required!");
            Log.i(TAG, "mnc3: This data is Required!");
            return false;
        } else {
            mnc3b.setError(null);
        }

        // C4 (with C2 = No OR Don't Know)
        if ((mnc2b.isChecked() || mnc2c.isChecked()) && mnc4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc4), Toast.LENGTH_LONG).show();
            mnc4c.setError("This data is Required!");
            Log.i(TAG, "mnc4: This data is Required!");
            return false;
        } else {
            mnc4c.setError(null);
        }

        // C5 - BCG
        if (mnc5bcg.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5bcg), Toast.LENGTH_LONG).show();
            mnc5bcg.setError("This data is Required!");
            Log.i(TAG, "mnc5bcg: This data is Required!");
            return false;
        } else {
            mnc5bcg.setError(null);
        }

        // C5 - OPV0
        if (mnc5opv0.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5opv0), Toast.LENGTH_LONG).show();
            mnc5opv0.setError("This data is Required!");
            Log.i(TAG, "mnc5opv0: This data is Required!");
            return false;
        } else {
            mnc5opv0.setError(null);
        }

        // C5 - OPV1
        if (mnc5opv1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5opv1), Toast.LENGTH_LONG).show();
            mnc5opv1.setError("This data is Required!");
            Log.i(TAG, "mnc5opv1: This data is Required!");
            return false;
        } else {
            mnc5opv1.setError(null);
        }

        // C5 - OPV2
        if (mnc5opv2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5opv2), Toast.LENGTH_LONG).show();
            mnc5opv2.setError("This data is Required!");
            Log.i(TAG, "mnc5opv2: This data is Required!");
            return false;
        } else {
            mnc5opv2.setError(null);
        }

        // C5 - OPV3
        if (mnc5opv3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5opv3), Toast.LENGTH_LONG).show();
            mnc5opv3.setError("This data is Required!");
            Log.i(TAG, "mnc5opv3: This data is Required!");
            return false;
        } else {
            mnc5opv3.setError(null);
        }

        // C5 - Penta 1
        if (mnc5p1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5p1), Toast.LENGTH_LONG).show();
            mnc5p1.setError("This data is Required!");
            Log.i(TAG, "mnc5p1: This data is Required!");
            return false;
        } else {
            mnc5p1.setError(null);
        }

        // C5 - Penta 2
        if (mnc5p2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5p2), Toast.LENGTH_LONG).show();
            mnc5p2.setError("This data is Required!");
            Log.i(TAG, "mnc5p2: This data is Required!");
            return false;
        } else {
            mnc5p2.setError(null);
        }

        // C5 - Penta 3
        if (mnc5p3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5p3), Toast.LENGTH_LONG).show();
            mnc5p3.setError("This data is Required!");
            Log.i(TAG, "mnc5p3: This data is Required!");
            return false;
        } else {
            mnc5p3.setError(null);
        }

        // C5 - PCV1
        if (mnc5pcv1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5pcv1), Toast.LENGTH_LONG).show();
            mnc5pcv1.setError("This data is Required!");
            Log.i(TAG, "mnc5pcv1: This data is Required!");
            return false;
        } else {
            mnc5pcv1.setError(null);
        }

        // C5 - PCV2
        if (mnc5pcv2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5pcv2), Toast.LENGTH_LONG).show();
            mnc5pcv2.setError("This data is Required!");
            Log.i(TAG, "mnc5pcv2: This data is Required!");
            return false;
        } else {
            mnc5pcv2.setError(null);
        }

        // C5 - PCV3
        if (mnc5pcv3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5pcv3), Toast.LENGTH_LONG).show();
            mnc5pcv3.setError("This data is Required!");
            Log.i(TAG, "mnc5pcv3: This data is Required!");
            return false;
        } else {
            mnc5pcv3.setError(null);
        }

        // C5 - IPV1
        if (mnc5ipv1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5ipv1), Toast.LENGTH_LONG).show();
            mnc5ipv1.setError("This data is Required!");
            Log.i(TAG, "mnc5ipv1: This data is Required!");
            return false;
        } else {
            mnc5ipv1.setError(null);
        }

        // C5 - IPV2
        if (mnc5ipv2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5ipv2), Toast.LENGTH_LONG).show();
            mnc5ipv2.setError("This data is Required!");
            Log.i(TAG, "mnc5ipv2: This data is Required!");
            return false;
        } else {
            mnc5ipv2.setError(null);
        }

        // C5 - IPV3
        if (mnc5ipv3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5ipv3), Toast.LENGTH_LONG).show();
            mnc5ipv3.setError("This data is Required!");
            Log.i(TAG, "mnc5ipv3: This data is Required!");
            return false;
        } else {
            mnc5ipv3.setError(null);
        }

        // C5 - Measles 1
        if (mnc5m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5m1), Toast.LENGTH_LONG).show();
            mnc5m1.setError("This data is Required!");
            Log.i(TAG, "mnc5m1: This data is Required!");
            return false;
        } else {
            mnc5m1.setError(null);
        }

        // C5 - Measles 2
        if (mnc5m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc5m2), Toast.LENGTH_LONG).show();
            mnc5m2.setError("This data is Required!");
            Log.i(TAG, "mnc5m2: This data is Required!");
            return false;
        } else {
            mnc5m2.setError(null);
        }

        // C6
        if (mnc6.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc6), Toast.LENGTH_LONG).show();
            mnc6c.setError("Not selected");
            Log.i(TAG, "mnc6: Not selected");
            return false;
        } else {
            mnc6c.setError(null);
        }

        // C7 
        if (mnc7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc7), Toast.LENGTH_LONG).show();
            mnc7c.setError("Not selected");
            Log.i(TAG, "mnc7: Not selected");
            return false;
        } else {
            mnc7c.setError(null);
        }

        // C8
        if (mnc8.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc8), Toast.LENGTH_LONG).show();
            mnc8.setError("This data is Required!");
            Log.i(TAG, "mnc8: This data is Required!");
            return false;
        } else {
            mnc8.setError(null);
        }

        // C9 (C10 + C11 and C12)
        if (mnc9.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc9), Toast.LENGTH_LONG).show();
            mnc9c.setError("Not selected");
            Log.i(TAG, "mnc9: Not selected");
            return false;
        } else if (mnc9a.isChecked() && mnc10mm.getText().toString().isEmpty() && mnc10yy.getText().toString().isEmpty()) {
            mnc9c.setError(null);
            Toast.makeText(this, "ERROR(empty): " + getResources().getResourceTypeName(R.string.mnc10), Toast.LENGTH_LONG).show();
            mnc10mm.setError("Data not entered");
            Log.i(TAG, "mnc10: Data not entered");
            return false;
        } else if (mnc9a.isChecked() && mnc11.getCheckedRadioButtonId() == -1) {
            mnc9c.setError(null);
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc11), Toast.LENGTH_LONG).show();
            mnc11d.setError("Not Selected");
            Log.i(TAG, "mnc11: Not Selected");
            return false;
        } else if ((mnc9b.isChecked() || mnc9c.isChecked()) && mnc12.getCheckedRadioButtonId() == -1) {
            mnc9c.setError(null);
            mnc10mm.setError(null);
            mnc11d.setError(null);
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc12), Toast.LENGTH_LONG).show();
            mnc12b.setError("Not selected");
            Log.i(TAG, "mnc12: Not selected");
            return false;
        } else {
            mnc9c.setError(null);
            mnc10mm.setError(null);
            mnc11b.setError(null);
            mnc12b.setError(null);
        }

        // C11 NGO Text
        if (mnc11d.isChecked() && mnc11name.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(required): " + getResources().getResourceTypeName(R.string.mnc11d), Toast.LENGTH_LONG).show();
            mnc11name.setError("This data is Required!");
            Log.i(TAG, "mnc11name: This data is Required!");
            return false;
        } else {
            mnc11name.setError(null);
        }

        // C13
        if (mnc13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnc13), Toast.LENGTH_LONG).show();
            mnc13d.setError("Not selected");
            Log.i(TAG, "mnc13: Not selected");
            return false;
        } else {
            mnc13d.setError(null);
        }

        return true;
    }
}
