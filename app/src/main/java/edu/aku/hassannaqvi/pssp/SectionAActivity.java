package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionAActivity extends Activity {

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.ssA2)
    EditText ssA2;
    @BindView(R.id.ssA4)
    EditText ssA4;
    @BindView(R.id.ssA5)
    EditText ssA5;
    @BindView(R.id.ssA6)
    EditText ssA6;
    @BindView(R.id.ssA7)
    EditText ssA7;
    @BindView(R.id.ssA8)
    EditText ssA8;
    @BindView(R.id.ageDob)
    Switch ageDob;
    @BindView(R.id.ssA9)
    DatePicker ssA9;
    @BindView(R.id.ssA10m)
    EditText ssA10m;
    @BindView(R.id.ssA10d)
    EditText ssA10d;
    @BindView(R.id.ssA11)
    RadioGroup ssA11;
    @BindView(R.id.ssA11m)
    RadioButton ssA11m;
    @BindView(R.id.ssA11f)
    RadioButton ssA11f;
    @BindView(R.id.ssA12)
    EditText ssA12;
    @BindView(R.id.ssA13)
    EditText ssA13;
    @BindView(R.id.ssA14)
    RadioGroup ssA14;
    @BindView(R.id.ssA14a)
    RadioButton ssA14a;
    @BindView(R.id.ssA14b)
    RadioButton ssA14b;
    @BindView(R.id.ssA14c)
    RadioButton ssA14c;
    @BindView(R.id.ssA14d)
    RadioButton ssA14d;
    @BindView(R.id.ssA14e)
    RadioButton ssA14e;
    @BindView(R.id.ssA14x)
    RadioButton ssA14x;
    @BindView(R.id.ssA14x96)
    EditText ssA14x96;
    @BindView(R.id.ssA15)
    EditText ssA15;
    @BindView(R.id.ssA16)
    RadioGroup ssA16;
    @BindView(R.id.ssA16a)
    RadioButton ssA16a;
    @BindView(R.id.ssA16b)
    RadioButton ssA16b;
    @BindView(R.id.ssA16c)
    RadioButton ssA16c;
    @BindView(R.id.ssA16d)
    RadioButton ssA16d;
    @BindView(R.id.ssA16e)
    RadioButton ssA16e;
    @BindView(R.id.ssA16f)
    RadioButton ssA16f;
    @BindView(R.id.ssA16g)
    RadioButton ssA16g;
    @BindView(R.id.ssA16x)
    RadioButton ssA16x;
    @BindView(R.id.ssA16x96)
    EditText ssA16x96;

    @BindView(R.id.fldGrpssA9)
    LinearLayout fldGrpssA9;
    @BindView(R.id.fldGrpssA10)
    LinearLayout fldGrpssA10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        ssA8.addTextChangedListener(new TextWatcher() {
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
                        ssA8.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.check_mark), null, null, null);
                        Toast.makeText(getApplicationContext(), "Correct CNIC!", Toast.LENGTH_SHORT).show();

                    }
                } else {
                    ssA8.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);

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
                    fldGrpssA9.setVisibility(View.VISIBLE);
                    fldGrpssA10.setVisibility(View.GONE);
                    ssA10d.setText(null);
                    ssA10m.setText(null);
                } else {
                    fldGrpssA9.setVisibility(View.GONE);
                    fldGrpssA10.setVisibility(View.VISIBLE);
                }
            }
        });

        ssA14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (ssA14x.isChecked()) {
                    ssA14x96.setVisibility(View.VISIBLE);
                } else {
                    ssA14x96.setVisibility(View.GONE);
                    ssA14x96.setText(null);
                }
            }
        });

        ssA16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (ssA16x.isChecked()) {
                    ssA16x96.setVisibility(View.VISIBLE);
                } else {
                    ssA16x96.setVisibility(View.GONE);
                    ssA16x96.setText(null);
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
                startActivity(secB);
            }
        }
    }

    private boolean UpdateDB() {
        Toast.makeText(this, "Starting Database Processing", Toast.LENGTH_SHORT).show();
        return false;
    }

    private void SaveDraft() {
        Toast.makeText(this, "Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();
        return false;
    }

}
