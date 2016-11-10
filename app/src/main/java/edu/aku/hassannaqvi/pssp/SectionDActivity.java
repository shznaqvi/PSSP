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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_d)
    ScrollView activitySectionD;
    @BindView(R.id.txtmnd1)
    TextView txtmnd1;
    @BindView(R.id.mnd1)
    RadioGroup mnd1;
    @BindView(R.id.mnd1a)
    RadioButton mnd1a;
    @BindView(R.id.mnd1b)
    RadioButton mnd1b;
    @BindView(R.id.mnd1c)
    RadioButton mnd1c;
    @BindView(R.id.txtmnd2)
    TextView txtmnd2;
    @BindView(R.id.mnd2)
    RadioGroup mnd2;
    @BindView(R.id.mnd2a)
    RadioButton mnd2a;
    @BindView(R.id.mnd2b)
    RadioButton mnd2b;
    @BindView(R.id.mnd2c)
    RadioButton mnd2c;
    @BindView(R.id.txtmnd3)
    TextView txtmnd3;
    @BindView(R.id.mnd3)
    RadioGroup mnd3;
    @BindView(R.id.mnd3a)
    RadioButton mnd3a;
    @BindView(R.id.mnd3b)
    RadioButton mnd3b;
    @BindView(R.id.mnd3c)
    RadioButton mnd3c;
    @BindView(R.id.txtmnd4)
    TextView txtmnd4;
    @BindView(R.id.mnd4)
    RadioGroup mnd4;
    @BindView(R.id.mnd4a)
    RadioButton mnd4a;
    @BindView(R.id.mnd4b)
    RadioButton mnd4b;
    @BindView(R.id.mnd4c)
    RadioButton mnd4c;
    @BindView(R.id.mnd5)
    RadioGroup mnd5;
    @BindView(R.id.mnd5a)
    RadioButton mnd5a;
    @BindView(R.id.mnd5b)
    RadioButton mnd5b;
    @BindView(R.id.txtmnd6)
    TextView txtmnd6;
    @BindView(R.id.mnd6a)
    CheckBox mnd6a;
    @BindView(R.id.mnd6b)
    CheckBox mnd6b;
    @BindView(R.id.mnd6c)
    CheckBox mnd6c;
    @BindView(R.id.mnd6d)
    CheckBox mnd6d;
    @BindView(R.id.mnd6e)
    CheckBox mnd6e;
    @BindView(R.id.mnd6f)
    CheckBox mnd6f;
    @BindView(R.id.mnd6g)
    CheckBox mnd6g;
    @BindView(R.id.mnd6h)
    CheckBox mnd6h;
    @BindView(R.id.mnd6i)
    CheckBox mnd6i;
    @BindView(R.id.mnd6x)
    CheckBox mnd6x;
    @BindView(R.id.mnd6x96)
    EditText mnd6x96;
    @BindView(R.id.mnd7)
    RadioGroup mnd7;
    @BindView(R.id.mnd7a)
    RadioButton mnd7a;
    @BindView(R.id.mnd7b)
    RadioButton mnd7b;
    @BindView(R.id.mnd8)
    RadioGroup mnd8;
    @BindView(R.id.mnd8a)
    RadioButton mnd8a;
    @BindView(R.id.mnd8b)
    RadioButton mnd8b;
    @BindView(R.id.txtmnd9)
    TextView txtmnd9;
    @BindView(R.id.mnd9)
    RadioGroup mnd9;
    @BindView(R.id.mnd9a)
    RadioButton mnd9a;
    @BindView(R.id.mnd9b)
    RadioButton mnd9b;
    @BindView(R.id.mnd10a)
    CheckBox mnd10a;
    @BindView(R.id.mnd10b)
    CheckBox mnd10b;
    @BindView(R.id.mnd10c)
    CheckBox mnd10c;
    @BindView(R.id.mnd10d)
    CheckBox mnd10d;
    @BindView(R.id.mnd10e)
    CheckBox mnd10e;
    @BindView(R.id.mnd10f)
    CheckBox mnd10f;
    @BindView(R.id.mnd10g)
    CheckBox mnd10g;
    @BindView(R.id.mnd10h)
    CheckBox mnd10h;
    @BindView(R.id.mnd10i)
    CheckBox mnd10i;
    @BindView(R.id.mnd10x)
    CheckBox mnd10x;
    @BindView(R.id.mnd10x96)
    EditText mnd10x96;

    @BindView(R.id.fldGrpmnd6)
    LinearLayout fldGrpmnd6;
    @BindView(R.id.fldGrpmnd10)
    LinearLayout fldGrpmnd10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);


            txtmnd1.setText(txtmnd1.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnd2.setText(txtmnd2.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnd4.setText(txtmnd4.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnd6.setText(txtmnd6.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));
            txtmnd9.setText(txtmnd9.getText().toString().replace("(بچے کا نام)", PSSPApp.mnb1));


        mnd5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mnd5a.isChecked()) {
                    fldGrpmnd6.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmnd6.setVisibility(View.GONE);
                    mnd6a.setChecked(false);
                    mnd6b.setChecked(false);
                    mnd6c.setChecked(false);
                    mnd6d.setChecked(false);
                    mnd6e.setChecked(false);
                    mnd6f.setChecked(false);
                    mnd6g.setChecked(false);
                    mnd6h.setChecked(false);
                    mnd6i.setChecked(false);
                    mnd6x.setChecked(false);
                }
            }
        });

        mnd6x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnd6x96.setVisibility(View.VISIBLE);
                } else {
                    mnd6x96.setText(null);
                    mnd6x96.setVisibility(View.GONE);
                }
            }
        });

        mnd9a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmnd10.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmnd10.setVisibility(View.GONE);
                    mnd10a.setChecked(false);
                    mnd10b.setChecked(false);
                    mnd10c.setChecked(false);
                    mnd10d.setChecked(false);
                    mnd10e.setChecked(false);
                    mnd10f.setChecked(false);
                    mnd10g.setChecked(false);
                    mnd10h.setChecked(false);
                    mnd10i.setChecked(false);
                    mnd10x.setChecked(false);
                    mnd10x96.setText(null);
                }
            }
        });
        mnd10x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnd10x96.setVisibility(View.VISIBLE);
                } else {
                    mnd10x96.setText(null);
                    mnd10x96.setVisibility(View.GONE);
                }
            }
        });

    }

    public void submitSecD(View v) throws JSONException {
        Toast.makeText(this, "Processing Section D", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent secIM;
                if (PSSPApp.chCount < PSSPApp.chTotal) {
                    Toast.makeText(this, "Starting Section IM", Toast.LENGTH_SHORT).show();
                    secIM = new Intent(this, SectionIMActivity.class);
                } else {
                    Toast.makeText(this, "Starting Section E", Toast.LENGTH_SHORT).show();
                    secIM = new Intent(this, SectionEActivity.class);
                }
                startActivity(secIM);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject sd = new JSONObject();

        switch (mnd1.getCheckedRadioButtonId()) {
            case R.id.mnd1a:
                sd.put("mnd1", "1");
                break;
            case R.id.mnd1b:
                sd.put("mnd1", "2");
                break;
            case R.id.mnd1c:
                sd.put("mnd1", "99");
                break;
            default:
                sd.put("mnd1", "default");
                break;
        }

        switch (mnd2.getCheckedRadioButtonId()) {
            case R.id.mnd2a:
                sd.put("mnd2", "1");
                break;
            case R.id.mnd2b:
                sd.put("mnd2", "2");
                break;
            case R.id.mnd2c:
                sd.put("mnd2", "99");
                break;
            default:
                sd.put("mnd2", "default");
                break;
        }
        switch (mnd3.getCheckedRadioButtonId()) {
            case R.id.mnd3a:
                sd.put("mnd3", "1");
                break;
            case R.id.mnd3b:
                sd.put("mnd3", "2");
                break;
            case R.id.mnd3c:
                sd.put("mnd3", "99");
                break;
            default:
                sd.put("mnd3", "default");
                break;
        }
        switch (mnd4.getCheckedRadioButtonId()) {
            case R.id.mnd4a:
                sd.put("mnd4", "1");
                break;
            case R.id.mnd4b:
                sd.put("mnd4", "2");
                break;
            case R.id.mnd4c:
                sd.put("mnd4", "99");
                break;
            default:
                sd.put("mnd4", "default");
                break;
        }
        switch (mnd5.getCheckedRadioButtonId()) {
            case R.id.mnd5a:
                sd.put("mnd5", "1");
                break;
            case R.id.mnd5b:
                sd.put("mnd5", "2");
                break;
            default:
                sd.put("mnd5", "default");
                break;
        }
        sd.put("mnd6a", mnd6a.isChecked() ? "1" : "");
        sd.put("mnd6b", mnd6b.isChecked() ? "2" : "");
        sd.put("mnd6c", mnd6c.isChecked() ? "3" : "");
        sd.put("mnd6d", mnd6d.isChecked() ? "4" : "");
        sd.put("mnd6e", mnd6e.isChecked() ? "5" : "");
        sd.put("mnd6f", mnd6f.isChecked() ? "6" : "");
        sd.put("mnd6g", mnd6g.isChecked() ? "7" : "");
        sd.put("mnd6h", mnd6h.isChecked() ? "8" : "");
        sd.put("mnd6i", mnd6i.isChecked() ? "9" : "");
        sd.put("mnd6x", mnd6x.isChecked() ? "96" : "");
        sd.put("mnd6x96", mnd6x96.getText().toString());
        switch (mnd7.getCheckedRadioButtonId()) {
            case R.id.mnd7a:
                sd.put("mnd7", "1");
                break;
            case R.id.mnd7b:
                sd.put("mnd7", "2");
                break;
            default:
                sd.put("mnd7", "default");
                break;
        }
        switch (mnd8.getCheckedRadioButtonId()) {
            case R.id.mnd8a:
                sd.put("mnd8", "1");
                break;
            case R.id.mnd8b:
                sd.put("mnd8", "2");
                break;
            default:
                sd.put("mnd8", "default");
                break;
        }
        switch (mnd9.getCheckedRadioButtonId()) {
            case R.id.mnd9a:
                sd.put("mnd9", "1");
                break;
            case R.id.mnd9b:
                sd.put("mnd9", "2");
                break;
            default:
                sd.put("mnd9", "default");
                break;
        }
        sd.put("mnd10a", mnd10a.isChecked() ? "1" : "");
        sd.put("mnd10b", mnd10b.isChecked() ? "2" : "");
        sd.put("mnd10c", mnd10c.isChecked() ? "3" : "");
        sd.put("mnd10d", mnd10d.isChecked() ? "4" : "");
        sd.put("mnd10e", mnd10e.isChecked() ? "5" : "");
        sd.put("mnd10f", mnd10f.isChecked() ? "6" : "");
        sd.put("mnd10g", mnd10g.isChecked() ? "7" : "");
        sd.put("mnd10h", mnd10h.isChecked() ? "8" : "");
        sd.put("mnd10i", mnd10i.isChecked() ? "9" : "");
        sd.put("mnd10x", mnd10x.isChecked() ? "96" : "");
        sd.put("mnd10x96", mnd10x96.getText().toString());

        PSSPApp.fc.setsD(String.valueOf(sd));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating Section D", Toast.LENGTH_SHORT).show();

        // D1
        if (mnd1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd1), Toast.LENGTH_LONG).show();
            mnd1c.setError("This data is Required!");
            Log.i(TAG, "mnd1: This data is Required!");
            return false;
        } else {
            mnd1c.setError(null);
        }
        // D2
        if (mnd2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd2), Toast.LENGTH_LONG).show();
            mnd2c.setError("This data is Required!");
            Log.i(TAG, "mnd2: This data is Required!");
            return false;
        } else {
            mnd2c.setError(null);
        }
        // D3
        if (mnd3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd3), Toast.LENGTH_LONG).show();
            mnd3c.setError("This data is Required!");
            Log.i(TAG, "mnd3: This data is Required!");
            return false;
        } else {
            mnd3c.setError(null);
        }
        // D4
        if (mnd4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd4), Toast.LENGTH_LONG).show();
            mnd4c.setError("This data is Required!");
            Log.i(TAG, "mnd4: This data is Required!");
            return false;
        } else {
            mnd4c.setError(null);
        }

        // D4
        if (mnd4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd4), Toast.LENGTH_LONG).show();
            mnd4c.setError("This data is Required!");
            Log.i(TAG, "mnd4: This data is Required!");
            return false;
        } else {
            mnd4c.setError(null);
        }

        // D5
        if (mnd5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd5), Toast.LENGTH_LONG).show();
            mnd5b.setError("This data is Required!");
            Log.i(TAG, "mnd5: This data is Required!");
            return false;
        } else {
            mnd5b.setError(null);
        }

        // D6
        if (mnd5a.isChecked() && !(mnd6a.isChecked() || mnd6b.isChecked() || mnd6c.isChecked() || mnd6d.isChecked() || mnd6e.isChecked() || mnd6f.isChecked() || mnd6g.isChecked() || mnd6h.isChecked() || mnd6i.isChecked() || mnd6x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd6), Toast.LENGTH_LONG).show();
            mnd6x.setError("This data is Required!");
            Log.i(TAG, "mnd6: This data is Required!");
            return false;
        } else if (mnd6x.isChecked() && mnd6x96.getText().toString().isEmpty()) {
            mnd6x.setError(null);
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnd6), Toast.LENGTH_LONG).show();
            mnd6x96.setError("This data is empty!");
            Log.i(TAG, "mnd6: This data is empty!");
            return false;
        } else {
            mnd6x.setError(null);
            mnd6x96.setError(null);
        }

        // D7
        if (mnd7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd7), Toast.LENGTH_LONG).show();
            mnd7b.setError("This data is Required!");
            Log.i(TAG, "mnd7: This data is Required!");
            return false;
        } else {
            mnd7b.setError(null);
        }

        // D8
        if (mnd8.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd8), Toast.LENGTH_LONG).show();
            mnd8b.setError("This data is Required!");
            Log.i(TAG, "mnd8: This data is Required!");
            return false;
        } else {
            mnd8b.setError(null);
        }

        // D9
        if (mnd9.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd9), Toast.LENGTH_LONG).show();
            mnd9b.setError("This data is Required!");
            Log.i(TAG, "mnd9: This data is Required!");
            return false;
        } else {
            mnd9b.setError(null);
        }

        // D10
        if (mnd5a.isChecked() && !(mnd10a.isChecked() || mnd10b.isChecked() || mnd10c.isChecked() || mnd10d.isChecked() || mnd10e.isChecked() || mnd10f.isChecked() || mnd10g.isChecked() || mnd10h.isChecked() || mnd10i.isChecked() || mnd10x.isChecked())) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnd10), Toast.LENGTH_LONG).show();
            mnd10x.setError("This data is Required!");
            Log.i(TAG, "mnd10: This data is Required!");
            return false;
        } else if (mnd10x.isChecked() && mnd10x96.getText().toString().isEmpty()) {
            mnd10x.setError(null);
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnd10), Toast.LENGTH_LONG).show();
            mnd10x96.setError("This data is empty!");
            Log.i(TAG, "mnd10: This data is empty!");
            return false;
        } else {
            mnd10x.setError(null);
            mnd10x96.setError(null);
        }

        return true;
    }
}
