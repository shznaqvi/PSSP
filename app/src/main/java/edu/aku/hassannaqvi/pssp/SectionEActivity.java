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
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();


    @BindView(R.id.activity_section_E)
    ScrollView activitySectionE;
    @BindView(R.id.mne1)
    RadioGroup mne1;
    @BindView(R.id.mne1a)
    RadioButton mne1a;
    @BindView(R.id.mne1b)
    RadioButton mne1b;
    @BindView(R.id.mne1c)
    RadioButton mne1c;
    @BindView(R.id.mne2a)
    CheckBox mne2a;
    @BindView(R.id.mne2b)
    CheckBox mne2b;
    @BindView(R.id.mne2c)
    CheckBox mne2c;
    @BindView(R.id.mne2d)
    CheckBox mne2d;
    @BindView(R.id.mne2e)
    CheckBox mne2e;
    @BindView(R.id.mne2f)
    CheckBox mne2f;
    @BindView(R.id.mne2g)
    CheckBox mne2g;
    @BindView(R.id.mne2h)
    CheckBox mne2h;
    @BindView(R.id.mne2i)
    CheckBox mne2i;
    @BindView(R.id.mne2j)
    CheckBox mne2j;
    @BindView(R.id.mne2x)
    CheckBox mne2x;
    @BindView(R.id.mne2x96)
    EditText mne2x96;
    @BindView(R.id.mne3)
    RadioGroup mne3;
    @BindView(R.id.mne3a)
    RadioButton mne3a;
    @BindView(R.id.mne3b)
    RadioButton mne3b;
    @BindView(R.id.mne4a)
    CheckBox mne4a;
    @BindView(R.id.mne4b)
    CheckBox mne4b;
    @BindView(R.id.mne4c)
    CheckBox mne4c;
    @BindView(R.id.mne4d)
    CheckBox mne4d;
    @BindView(R.id.mne4e)
    CheckBox mne4e;
    @BindView(R.id.mne4f)
    CheckBox mne4f;
    @BindView(R.id.mne4g)
    CheckBox mne4g;
    @BindView(R.id.mne4h)
    CheckBox mne4h;
    @BindView(R.id.mne4i)
    CheckBox mne4i;
    @BindView(R.id.mne4x99)
    CheckBox mne4x99;
    @BindView(R.id.mne4x)
    CheckBox mne4x;
    @BindView(R.id.mne4x96)
    EditText mne4x96;
    @BindView(R.id.mne5a)
    CheckBox mne5a;
    @BindView(R.id.mne5b)
    CheckBox mne5b;
    @BindView(R.id.mne5c)
    CheckBox mne5c;
    @BindView(R.id.mne5d)
    CheckBox mne5d;
    @BindView(R.id.mne5e)
    CheckBox mne5e;
    @BindView(R.id.mne5x99)
    CheckBox mne5x99;
    @BindView(R.id.mne5x)
    CheckBox mne5x;
    @BindView(R.id.mne5x96)
    EditText mne5x96;
    @BindView(R.id.mne6a)
    CheckBox mne6a;
    @BindView(R.id.mne6b)
    CheckBox mne6b;
    @BindView(R.id.mne6c)
    CheckBox mne6c;
    @BindView(R.id.mne6d)
    CheckBox mne6d;
    @BindView(R.id.mne6x99)
    CheckBox mne6x99;
    @BindView(R.id.mne6x)
    CheckBox mne6x;
    @BindView(R.id.mne6x96)
    EditText mne6x96;
    @BindView(R.id.mne7)
    RadioGroup mne7;
    @BindView(R.id.mne7a)
    RadioButton mne7a;
    @BindView(R.id.mne7b)
    RadioButton mne7b;
    @BindView(R.id.mne7c)
    RadioButton mne7c;
    @BindView(R.id.mne7x96)
    EditText mne7x96;
    @BindView(R.id.mne8a)
    CheckBox mne8a;
    @BindView(R.id.mne8b)
    CheckBox mne8b;
    @BindView(R.id.mne8c)
    CheckBox mne8c;
    @BindView(R.id.mne8d)
    CheckBox mne8d;
    @BindView(R.id.mne8e)
    CheckBox mne8e;
    @BindView(R.id.mne8f)
    CheckBox mne8f;
    @BindView(R.id.mne8x)
    CheckBox mne8x;
    @BindView(R.id.mne8x96)
    EditText mne8x96;
    @BindView(R.id.mne9)
    RadioGroup mne9;
    @BindView(R.id.mne9a)
    RadioButton mne9a;
    @BindView(R.id.mne9b)
    RadioButton mne9b;
    @BindView(R.id.mne9c)
    RadioButton mne9c;
    @BindView(R.id.mne10)
    RadioGroup mne10;
    @BindView(R.id.mne10a)
    RadioButton mne10a;
    @BindView(R.id.mne10b)
    RadioButton mne10b;
    @BindView(R.id.mne10c)
    RadioButton mne10c;
    @BindView(R.id.mne10x99)
    RadioButton mne10x99;
    @BindView(R.id.mne10x)
    RadioButton mne10x;
    @BindView(R.id.mne10x96)
    EditText mne10x96;
    @BindView(R.id.mne11)
    RadioGroup mne11;
    @BindView(R.id.mne11a)
    RadioButton mne11a;
    @BindView(R.id.mne11b)
    RadioButton mne11b;
    @BindView(R.id.mne11c)
    RadioButton mne11c;
    @BindView(R.id.mne11d)
    RadioButton mne11d;
    @BindView(R.id.mne11e)
    RadioButton mne11e;
    @BindView(R.id.mne11x99)
    RadioButton mne11x99;
    @BindView(R.id.mne11x)
    RadioButton mne11x;
    @BindView(R.id.mne11x96)
    EditText mne11x96;
    @BindView(R.id.mne12)
    RadioGroup mne12;
    @BindView(R.id.mne12a)
    RadioButton mne12a;
    @BindView(R.id.mne12b)
    RadioButton mne12b;
    @BindView(R.id.mne12c)
    RadioButton mne12c;
    @BindView(R.id.mne12d)
    RadioButton mne12d;
    @BindView(R.id.mne12e)
    RadioButton mne12e;
    @BindView(R.id.mne12x)
    RadioButton mne12x;
    @BindView(R.id.mne12x96)
    EditText mne12x96;
    @BindView(R.id.mne13)
    RadioGroup mne13;
    @BindView(R.id.mne13a)
    RadioButton mne13a;
    @BindView(R.id.mne13b)
    RadioButton mne13b;
    @BindView(R.id.mne13c)
    RadioButton mne13c;
    @BindView(R.id.mne13d)
    RadioButton mne13d;
    @BindView(R.id.mne13e)
    RadioButton mne13e;
    @BindView(R.id.mne13x99)
    RadioButton mne13x99;
    @BindView(R.id.mne13x)
    RadioButton mne13x;
    @BindView(R.id.mne13x96)
    EditText mne13x96;
    @BindView(R.id.mne14)
    RadioGroup mne14;
    @BindView(R.id.mne14a)
    RadioButton mne14a;
    @BindView(R.id.mne14b)
    RadioButton mne14b;
    @BindView(R.id.mne14c)
    RadioButton mne14c;
    @BindView(R.id.mne15)
    RadioGroup mne15;
    @BindView(R.id.mne15a)
    RadioButton mne15a;
    @BindView(R.id.mne15b)
    RadioButton mne15b;
    @BindView(R.id.mne16a)
    CheckBox mne16a;
    @BindView(R.id.mne16b)
    CheckBox mne16b;
    @BindView(R.id.mne16c)
    CheckBox mne16c;
    @BindView(R.id.mne16d)
    CheckBox mne16d;
    @BindView(R.id.mne16e)
    CheckBox mne16e;
    @BindView(R.id.mne16f)
    CheckBox mne16f;
    @BindView(R.id.mne16g)
    CheckBox mne16g;
    @BindView(R.id.mne16x)
    CheckBox mne16x;
    @BindView(R.id.mne16x96)
    EditText mne16x96;
    @BindView(R.id.mne17)
    RadioGroup mne17;
    @BindView(R.id.mne17a)
    RadioButton mne17a;
    @BindView(R.id.mne17b)
    RadioButton mne17b;
    @BindView(R.id.mne18)
    RadioGroup mne18;
    @BindView(R.id.mne18a)
    RadioButton mne18a;
    @BindView(R.id.mne18b)
    RadioButton mne18b;
    @BindView(R.id.mne18x)
    RadioButton mne18x;
    @BindView(R.id.mne18x96)
    EditText mne18x96;
    @BindView(R.id.fldGrpe2)
    LinearLayout fldGrpe2;
    @BindView(R.id.fldGrpe8)
    LinearLayout fldGrpe8;
    @BindView(R.id.fldGrpe13)
    LinearLayout fldGrpe13;
    @BindView(R.id.fldGrpe16)
    LinearLayout fldGrpe16;
    @BindView(R.id.fldGrpe18)
    LinearLayout fldGrpe18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        // E1 No + Dnk skips E2 + E3
        mne1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mne1a.isChecked()) {
                    fldGrpe2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpe2.setVisibility(View.GONE);
                    // clear E2
                    mne2a.setChecked(false);
                    mne2b.setChecked(false);
                    mne2c.setChecked(false);
                    mne2d.setChecked(false);
                    mne2e.setChecked(false);
                    mne2f.setChecked(false);
                    mne2g.setChecked(false);
                    mne2h.setChecked(false);
                    mne2i.setChecked(false);
                    mne2j.setChecked(false);
                    mne2x.setChecked(false);
                    mne2x96.setText(null);
                    // clear E3
                    // mne3.clearCheck();
                }
            }
        });


        // E2 Others
        mne2x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne2x96.setVisibility(View.VISIBLE);
                } else {
                    mne2x96.setVisibility(View.GONE);
                    mne2x96.setText(null);
                }
            }
        });

        // E4 Others
        mne4x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne4x96.setVisibility(View.VISIBLE);
                } else {
                    mne4x96.setVisibility(View.GONE);
                    mne4x96.setText(null);
                }
            }
        });

        // E5 Others
        mne5x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne5x96.setVisibility(View.VISIBLE);
                } else {
                    mne5x96.setVisibility(View.GONE);
                    mne5x96.setText(null);
                }
            }
        });

        // E6 Others
        mne6x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne6x96.setVisibility(View.VISIBLE);
                } else {
                    mne6x96.setVisibility(View.GONE);
                    mne6x96.setText(null);
                }
            }
        });

        // E7 Others
        mne7c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne7x96.setVisibility(View.VISIBLE);
                } else {
                    mne7x96.setVisibility(View.GONE);
                    mne7x96.setText(null);
                }
            }
        });

        // E7 Yes skip E8
        mne7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mne7a.isChecked()) {
                    fldGrpe8.setVisibility(View.GONE);
                    // clear E8
                    mne8a.setChecked(false);
                    mne8b.setChecked(false);
                    mne8c.setChecked(false);
                    mne8d.setChecked(false);
                    mne8e.setChecked(false);
                    mne8f.setChecked(false);
                    mne8x.setChecked(false);
                    mne8x96.setText(null);
                } else {
                    fldGrpe8.setVisibility(View.VISIBLE);
                }
            }
        });

        // E8 Others
        mne8x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne8x96.setVisibility(View.VISIBLE);
                } else {
                    mne8x96.setVisibility(View.GONE);
                    mne8x96.setText(null);
                }
            }
        });

        // E10 Others
        mne10x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne10x96.setVisibility(View.VISIBLE);
                } else {
                    mne10x96.setVisibility(View.GONE);
                    mne10x96.setText(null);
                }
            }
        });

        // E11 Others
        mne11x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mne11x96.setVisibility(View.VISIBLE);
                } else {
                    mne11x96.setVisibility(View.GONE);
                    mne11x96.setText(null);
                }
            }
        });

        // E12 Option A show E13
        mne12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mne12a.isChecked()) {
                    fldGrpe13.setVisibility(View.GONE);
                    // clear E13
                    mne13a.setChecked(false);
                    mne13b.setChecked(false);
                    mne13c.setChecked(false);
                    mne13d.setChecked(false);
                    mne13e.setChecked(false);
                    mne13x99.setChecked(false);
                    mne13x.setChecked(false);
                    mne13x96.setText(null);

                } else {
                    fldGrpe13.setVisibility(View.VISIBLE);
                }
            }
        });

        // E15 Option A show E16
        mne15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mne15a.isChecked()) {
                    fldGrpe16.setVisibility(View.GONE);
                    // clear E16
                    mne16a.setChecked(false);
                    mne16b.setChecked(false);
                    mne16c.setChecked(false);
                    mne16d.setChecked(false);
                    mne16e.setChecked(false);
                    mne16g.setChecked(false);
                    mne16f.setChecked(false);
                    mne16x.setChecked(false);
                    mne16x96.setText(null);

                } else {
                    fldGrpe16.setVisibility(View.VISIBLE);
                }
            }
        });

        // E17 Yes skip E18
        mne17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mne17a.isChecked()) {
                    fldGrpe18.setVisibility(View.GONE);
                    // clear E18
                    mne18a.setChecked(false);
                    mne18b.setChecked(false);
                    mne18x.setChecked(false);
                    mne18x96.setText(null);

                } else {
                    fldGrpe18.setVisibility(View.VISIBLE);
                }
            }
        });
    }


    public void submitSecE(View v) throws JSONException {
        Toast.makeText(this, "Processing Section E", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section F", Toast.LENGTH_SHORT).show();
                Intent secE = new Intent(this, SectionFActivity.class);
                startActivity(secE);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject se = new JSONObject();

        switch (mne1.getCheckedRadioButtonId()) {
            case R.id.mne1a:
                se.put("mne1", "1");
                break;
            case R.id.mne1b:
                se.put("mne1", "2");
                break;
            case R.id.mne1c:
                se.put("mne1", "99");
                break;
            default:
                se.put("mne1", "default");
                break;
        }
        se.put("mne2a", mne2a.isChecked() ? "1" : "");
        se.put("mne2b", mne2b.isChecked() ? "2" : "");
        se.put("mne2c", mne2c.isChecked() ? "3" : "");
        se.put("mne2d", mne2d.isChecked() ? "4" : "");
        se.put("mne2e", mne2e.isChecked() ? "5" : "");
        se.put("mne2f", mne2f.isChecked() ? "6" : "");
        se.put("mne2g", mne2g.isChecked() ? "7" : "");
        se.put("mne2h", mne2h.isChecked() ? "8" : "");
        se.put("mne2i", mne2i.isChecked() ? "9" : "");
        se.put("mne2j", mne2j.isChecked() ? "10" : "");
        se.put("mne2x", mne2x.isChecked() ? "96" : "");
        se.put("mne2x96", mne2x96.getText().toString());
        switch (mne3.getCheckedRadioButtonId()) {
            case R.id.mne3a:
                se.put("mne3", "1");
                break;
            case R.id.mne3b:
                se.put("mne3", "2");
                break;
            default:
                se.put("mne3", "default");
                break;
        }
        se.put("mne4a", mne4a.isChecked() ? "1" : "");
        se.put("mne4b", mne4b.isChecked() ? "2" : "");
        se.put("mne4c", mne4c.isChecked() ? "3" : "");
        se.put("mne4d", mne4d.isChecked() ? "4" : "");
        se.put("mne4e", mne4e.isChecked() ? "5" : "");
        se.put("mne4f", mne4f.isChecked() ? "6" : "");
        se.put("mne4g", mne4g.isChecked() ? "7" : "");
        se.put("mne4h", mne4h.isChecked() ? "8" : "");
        se.put("mne4i", mne4i.isChecked() ? "9" : "");
        se.put("mne4x99", mne4x99.isChecked() ? "99" : "");
        se.put("mne4x", mne4x.isChecked() ? "96" : "");
        se.put("mne4x96", mne4x96.getText().toString());
        se.put("mne5a", mne5a.isChecked() ? "1" : "");
        se.put("mne5b", mne5b.isChecked() ? "2" : "");
        se.put("mne5c", mne5c.isChecked() ? "3" : "");
        se.put("mne5d", mne5d.isChecked() ? "4" : "");
        se.put("mne5e", mne5e.isChecked() ? "5" : "");
        se.put("mne5x99", mne5x99.isChecked() ? "99" : "");
        se.put("mne5x", mne5x.isChecked() ? "96" : "");
        se.put("mne5x96", mne5x96.getText().toString());
        se.put("mne6a", mne6a.isChecked() ? "1" : "");
        se.put("mne6b", mne6b.isChecked() ? "2" : "");
        se.put("mne6c", mne6c.isChecked() ? "3" : "");
        se.put("mne6d", mne6d.isChecked() ? "4" : "");
        se.put("mne6x99", mne6x99.isChecked() ? "99" : "");
        se.put("mne6x", mne6x.isChecked() ? "96" : "");
        se.put("mne6x96", mne6x96.getText().toString());
        switch (mne7.getCheckedRadioButtonId()) {
            case R.id.mne7a:
                se.put("mne7", "1");
                break;
            case R.id.mne7b:
                se.put("mne7", "2");
                break;
            case R.id.mne7c:
                se.put("mne7", "96");
                break;
            default:
                se.put("mne7", "default");
                break;
        }
        se.put("mne7x96", mne7x96.getText().toString());
        se.put("mne8a", mne8a.isChecked() ? "1" : "");
        se.put("mne8b", mne8b.isChecked() ? "2" : "");
        se.put("mne8c", mne8c.isChecked() ? "3" : "");
        se.put("mne8d", mne8d.isChecked() ? "4" : "");
        se.put("mne8e", mne8e.isChecked() ? "5" : "");
        se.put("mne8f", mne8f.isChecked() ? "6" : "");
        se.put("mne8x", mne8x.isChecked() ? "96" : "");
        se.put("mne8x96", mne8x96.getText().toString());
        switch (mne9.getCheckedRadioButtonId()) {
            case R.id.mne9a:
                se.put("mne9", "1");
                break;
            case R.id.mne9b:
                se.put("mne9", "2");
                break;
            case R.id.mne9c:
                se.put("mne9", "99");
                break;
            default:
                se.put("mne9", "default");
                break;
        }
        switch (mne10.getCheckedRadioButtonId()) {
            case R.id.mne10a:
                se.put("mne10", "1");
                break;
            case R.id.mne10b:
                se.put("mne10", "2");
                break;
            case R.id.mne10c:
                se.put("mne10", "3");
                break;
            case R.id.mne10x99:
                se.put("mne10", "99");
                break;
            case R.id.mne10x:
                se.put("mne10", "96");
                break;
            default:
                se.put("mne10", "default");
                break;
        }
        se.put("mne10x96", mne10x96.getText().toString());
        switch (mne11.getCheckedRadioButtonId()) {
            case R.id.mne11a:
                se.put("mne11", "1");
                break;
            case R.id.mne11b:
                se.put("mne11", "2");
                break;
            case R.id.mne11c:
                se.put("mne11", "3");
                break;
            case R.id.mne11d:
                se.put("mne11", "4");
                break;
            case R.id.mne11e:
                se.put("mne11", "5");
                break;
            case R.id.mne11x99:
                se.put("mne11", "99");
                break;
            case R.id.mne11x:
                se.put("mne11", "96");
                break;
            default:
                se.put("mne11", "default");
                break;
        }
        se.put("mne11x96", mne11x96.getText().toString());
        switch (mne12.getCheckedRadioButtonId()) {
            case R.id.mne12a:
                se.put("mne12", "1");
                break;
            case R.id.mne12b:
                se.put("mne12", "2");
                break;
            case R.id.mne12c:
                se.put("mne12", "3");
                break;
            case R.id.mne12d:
                se.put("mne12", "4");
                break;
            case R.id.mne12e:
                se.put("mne12", "5");
                break;
            case R.id.mne12x:
                se.put("mne12", "96");
                break;
            default:
                se.put("mne12", "default");
                break;
        }
        se.put("mne12x96", mne12x96.getText().toString());
        switch (mne13.getCheckedRadioButtonId()) {
            case R.id.mne13a:
                se.put("mne13", "1");
                break;
            case R.id.mne13b:
                se.put("mne13", "2");
                break;
            case R.id.mne13c:
                se.put("mne13", "3");
                break;
            case R.id.mne13d:
                se.put("mne13", "4");
                break;
            case R.id.mne13e:
                se.put("mne13", "5");
                break;
            case R.id.mne13x99:
                se.put("mne13", "99");
                break;
            case R.id.mne13x:
                se.put("mne13", "96");
                break;
            default:
                se.put("mne13", "default");
                break;
        }
        se.put("mne13x96", mne13x96.getText().toString());
        switch (mne14.getCheckedRadioButtonId()) {
            case R.id.mne14a:
                se.put("mne14", "1");
                break;
            case R.id.mne14b:
                se.put("mne14", "2");
                break;
            case R.id.mne14c:
                se.put("mne14", "99");
                break;
            default:
                se.put("mne14", "default");
                break;
        }
        switch (mne15.getCheckedRadioButtonId()) {
            case R.id.mne15a:
                se.put("mne15", "1");
                break;
            case R.id.mne15b:
                se.put("mne15", "2");
                break;
            default:
                se.put("mne15", "default");
                break;
        }

        se.put("mne16a", mne16a.isChecked() ? "1" : "");
        se.put("mne16b", mne16b.isChecked() ? "2" : "");
        se.put("mne16c", mne16c.isChecked() ? "3" : "");
        se.put("mne16d", mne16d.isChecked() ? "4" : "");
        se.put("mne16e", mne16e.isChecked() ? "5" : "");
        se.put("mne16f", mne16f.isChecked() ? "6" : "");
        se.put("mne16g", mne16g.isChecked() ? "7" : "");
        se.put("mne16x", mne16x.isChecked() ? "96" : "");
        se.put("mne16x96", mne16x96.getText().toString());
        switch (mne17.getCheckedRadioButtonId()) {
            case R.id.mne17a:
                se.put("mne17", "1");
                break;
            case R.id.mne17b:
                se.put("mne17", "2");
                break;
            default:
                se.put("mne17", "default");
                break;
        }
        switch (mne18.getCheckedRadioButtonId()) {
            case R.id.mne18a:
                se.put("mne18", "1");
                break;
            case R.id.mne18b:
                se.put("mne18", "2");
                break;
            case R.id.mne18x:
                se.put("mne18", "96");
                break;
            default:
                se.put("mne18", "default");
                break;
        }
        se.put("mne18x96", mne18x96.getText().toString());

        PSSPApp.fc.setsE(String.valueOf(se));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {
        Toast.makeText(this, "Validating Section E", Toast.LENGTH_SHORT).show();

        // E1
        if (mne1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne1), Toast.LENGTH_LONG).show();
            mne1c.setError("This data is Required!");
            Log.i(TAG, "mne1: This data is Required!");
            return false;
        } else {
            mne1c.setError(null);
        }

        // E1 - Yes
        if (mne1a.isChecked()) {

            // E2
            if (!(mne2a.isChecked() || mne2b.isChecked() || mne2c.isChecked() || mne2d.isChecked() || mne2e.isChecked() || mne2f.isChecked() || mne2g.isChecked() || mne2h.isChecked() || mne2i.isChecked() || mne2j.isChecked() || mne2x.isChecked())) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne2), Toast.LENGTH_LONG).show();
                mne2x.setError("This data is Required!");
                Log.i(TAG, "mne2: This data is Required!");
                return false;
            } else {
                mne2x.setError(null);
            }

            // E2x96
            if (mne2x.isChecked() && mne2x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne2), Toast.LENGTH_LONG).show();
                mne2x96.setError("Others Required!");
                Log.i(TAG, "mne2x96: Others Required!");
                return false;
            } else {
                mne2x96.setError(null);
            }



        } // End of E1 Yes Condition

        if (mne3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne3), Toast.LENGTH_LONG).show();
            mne3b.setError("Answer is required");
            Log.i(TAG, "mne3: Answer Required!");
            return false;
        } else {
            mne3b.setError(null);
        }
        // E4
        if (!(mne4a.isChecked() || mne4b.isChecked() || mne4c.isChecked() || mne4d.isChecked() || mne4e.isChecked() || mne4f.isChecked() || mne4g.isChecked() || mne4h.isChecked() || mne4i.isChecked() || mne4x99.isChecked() || mne4x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne4), Toast.LENGTH_LONG).show();
            mne4x.setError("This data is Required!");
            Log.i(TAG, "mne4: This data is Required!");
            return false;
        } else {
            mne4x.setError(null);
        }

        // E4x96
        if (mne4x.isChecked() && mne4x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne4), Toast.LENGTH_LONG).show();
            mne4x96.setError("Others Required!");
            Log.i(TAG, "mne4x96: Others Required!");
            return false;
        } else {
            mne4x96.setError(null);
        }

        // E5
        if (!(mne5a.isChecked() || mne5b.isChecked() || mne5c.isChecked() || mne5d.isChecked() || mne5e.isChecked() || mne5x99.isChecked() || mne5x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne5), Toast.LENGTH_LONG).show();
            mne5x.setError("This data is Required!");
            Log.i(TAG, "mne5: This data is Required!");
            return false;
        } else {
            mne5x.setError(null);
        }

        // E5x96
        if (mne5x.isChecked() && mne5x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne5), Toast.LENGTH_LONG).show();
            mne5x96.setError("Others Required!");
            Log.i(TAG, "mne5x96: Others Required!");
            return false;
        } else {
            mne5x96.setError(null);
        }

        // E6
        if (!(mne6a.isChecked() || mne6b.isChecked() || mne6c.isChecked() || mne6d.isChecked() || mne6x99.isChecked() || mne6x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne6), Toast.LENGTH_LONG).show();
            mne6x.setError("This data is Required!");
            Log.i(TAG, "mne6: This data is Required!");
            return false;
        } else {
            mne6x.setError(null);
        }

        // E6x96
        if (mne6x.isChecked() && mne6x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne6), Toast.LENGTH_LONG).show();
            mne6x96.setError("Others Required!");
            Log.i(TAG, "mne6x96: Others Required!");
            return false;
        } else {
            mne6x96.setError(null);
        }

        // E7
        if (mne7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne7), Toast.LENGTH_LONG).show();
            mne7c.setError("This data is Required!");
            Log.i(TAG, "mne7: This data is Required!");
            return false;
        } else {
            mne7c.setError(null);
        }

        // E7x96
        if (mne7c.isChecked() && mne7x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne7), Toast.LENGTH_LONG).show();
            mne7x96.setError("Others Required!");
            Log.i(TAG, "mne7x96: Others Required!");
            return false;
        } else {
            mne7x96.setError(null);
        }

        // E7 Not Yes
        if (!mne7a.isChecked()) {

            // E8
            if (!(mne8a.isChecked() || mne8b.isChecked() || mne8c.isChecked() || mne8d.isChecked() || mne8e.isChecked() || mne8f.isChecked() || mne8x.isChecked())) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne8), Toast.LENGTH_LONG).show();
                mne8x.setError("This data is Required!");
                Log.i(TAG, "mne8: This data is Required!");
                return false;
            } else {
                mne8x.setError(null);
            }

            // E8x96
            if (mne8x.isChecked() && mne8x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne8), Toast.LENGTH_LONG).show();
                mne8x96.setError("Others Required!");
                Log.i(TAG, "mne8x96: Others Required!");
                return false;
            } else {
                mne8x96.setError(null);
            }
        }

        // E9
        if (mne9.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne9), Toast.LENGTH_LONG).show();
            mne9c.setError("This data is Required!");
            Log.i(TAG, "mne9: This data is Required!");
            return false;
        } else {
            mne9c.setError(null);
        }

        // E10
        if (!(mne10a.isChecked() || mne10b.isChecked() || mne10c.isChecked() || mne10x99.isChecked() || mne10x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne10), Toast.LENGTH_LONG).show();
            mne10x.setError("This data is Required!");
            Log.i(TAG, "mne10: This data is Required!");
            return false;
        } else {
            mne10x.setError(null);
        }

        // E10x96
        if (mne10x.isChecked() && mne10x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne10), Toast.LENGTH_LONG).show();
            mne10x96.setError("Others Required!");
            Log.i(TAG, "mne10x96: Others Required!");
            return false;
        } else {
            mne10x96.setError(null);
        }

        // E11
        if (!(mne11a.isChecked() || mne11b.isChecked() || mne11c.isChecked() || mne11d.isChecked() || mne11e.isChecked() || mne11x99.isChecked() || mne11x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne11), Toast.LENGTH_LONG).show();
            mne11x.setError("This data is Required!");
            Log.i(TAG, "mne11: This data is Required!");
            return false;
        } else {
            mne11x.setError(null);
        }

        // E11x96
        if (mne11x.isChecked() && mne11x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne11), Toast.LENGTH_LONG).show();
            mne11x96.setError("Others Required!");
            Log.i(TAG, "mne11x96: Others Required!");
            return false;
        } else {
            mne11x96.setError(null);
        }

        // E12
        if (!(mne12a.isChecked() || mne12b.isChecked() || mne12c.isChecked() || mne12d.isChecked() || mne12e.isChecked() || mne12x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne12), Toast.LENGTH_LONG).show();
            mne12x.setError("This data is Required!");
            Log.i(TAG, "mne12: This data is Required!");
            return false;
        } else {
            mne12x.setError(null);
        }

        // E12 Option other than A
        if (!mne12a.isChecked()) {

            // E13
            if (!(mne13a.isChecked() || mne13b.isChecked() || mne13c.isChecked() || mne13d.isChecked() || mne13e.isChecked() || mne13x99.isChecked() || mne13x.isChecked())) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne13), Toast.LENGTH_LONG).show();
                mne13x.setError("This data is Required!");
                Log.i(TAG, "mne13: This data is Required!");
                return false;
            } else {
                mne13x.setError(null);
            }

            // E13x96
            if (mne13x.isChecked() && mne13x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne13), Toast.LENGTH_LONG).show();
                mne13x96.setError("Others Required!");
                Log.i(TAG, "mne13x96: Others Required!");
                return false;
            } else {
                mne13x96.setError(null);
            }
        }


        // E14
        if (mne14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne14), Toast.LENGTH_LONG).show();
            mne14c.setError("This data is Required!");
            Log.i(TAG, "mne14: This data is Required!");
            return false;
        } else {
            mne14c.setError(null);
        }
        // E15
        if (mne15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne15), Toast.LENGTH_LONG).show();
            mne15b.setError("This data is Required!");
            Log.i(TAG, "mne15: This data is Required!");
            return false;
        } else {
            mne15b.setError(null);
        }

        // E15 Option A
        if (mne15b.isChecked()) {

            // E16
            if (!(mne16a.isChecked() || mne16b.isChecked() || mne16c.isChecked() || mne16d.isChecked() || mne16e.isChecked() || mne16f.isChecked() || mne16g.isChecked() || mne16x.isChecked())) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne16), Toast.LENGTH_LONG).show();
                mne16x.setError("This data is Required!");
                Log.i(TAG, "mne16: This data is Required!");
                return false;
            } else {
                mne16x.setError(null);
            }

            // E16x96
            if (mne16x.isChecked() && mne16x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne16), Toast.LENGTH_LONG).show();
                mne16x96.setError("Others Required!");
                Log.i(TAG, "mne16x96: Others Required!");
                return false;
            } else {
                mne16x96.setError(null);
            }
        }

        // E15
        if (mne15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne15), Toast.LENGTH_LONG).show();
            mne15b.setError("This data is Required!");
            Log.i(TAG, "mne15: This data is Required!");
            return false;
        } else {
            mne15b.setError(null);
        }

        // E17 Option A
        if (mne17b.isChecked()) {

            // E18
            if (!(mne18a.isChecked() || mne18b.isChecked() || mne18x.isChecked())) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mne18), Toast.LENGTH_LONG).show();
                mne18x.setError("This data is Required!");
                Log.i(TAG, "mne18: This data is Required!");
                return false;
            } else {
                mne18x.setError(null);
            }

            // E18x96
            if (mne18x.isChecked() && mne18x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Others Req.): " + getString(R.string.mne18), Toast.LENGTH_LONG).show();
                mne18x96.setError("Others Required!");
                Log.i(TAG, "mne18x96: Others Required!");
                return false;
            } else {
                mne18x96.setError(null);
            }
        }

        return true;

    }
}
