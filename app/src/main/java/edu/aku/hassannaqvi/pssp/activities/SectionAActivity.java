package edu.aku.hassannaqvi.pssp.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
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

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.pssp.R;
import edu.aku.hassannaqvi.pssp.contracts.FormsContract;
import edu.aku.hassannaqvi.pssp.core.DatabaseHelper;
import edu.aku.hassannaqvi.pssp.core.PSSPApp;
import edu.aku.hassannaqvi.pssp.others.TypefaceUtil;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    // District Spinner (used in LoginActivity)
    public static ArrayList<String> lables;
    public static ArrayList<String> values;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.txtmna3)
    TextView txtmna3;
    @BindView(R.id.mna4)
    EditText mna4;
    @BindView(R.id.mna5)
    EditText mna5;
    @BindView(R.id.mna6)
    CheckBox mna6;
    @BindView(R.id.child_name)
    TextView child_name;
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
//        lables.add("K. Abdullah");
//        lables.add("Quetta");
//        lables.add("Pishin");
//        lables.add("J & Bara");
//        lables.add("Town 1 & 2");
//        lables.add("Town 3 & 4");
//        lables.add("K Zone 1");
//        lables.add("K Zone 2");
//        lables.add("K Zone 3");
//        lables.add("Sukkur");
//        lables.add("Larkhana");
//        lables.add("Rawalpindi");
//        lables.add("Lahore");
//        lables.add("Multan");
        lables.add("K. Abdullah");
        lables.add("Quetta");
        lables.add("Pishin");
        lables.add("Mardan/Swabi");
        lables.add("Town 1 & 2");
        lables.add("Town 3 & 4");
        lables.add("K Zone 1");
        lables.add("K Zone 2");
        lables.add("K Zone 3");
        lables.add("Sukkur");
        lables.add("Larkhana");
        lables.add("Rahim Yar Khan");
        lables.add("Rawalpindi");
        lables.add("Lahore");
        lables.add("Multan");


        values = new ArrayList<String>();
//        values.add("11");
//        values.add("12");
//        values.add("13");
//        values.add("21");
//        values.add("22");
//        values.add("23");
//        values.add("31");
//        values.add("32");
//        values.add("33");
//        values.add("34");
//        values.add("35");
//        values.add("41");
//        values.add("42");
//        values.add("43");
        values.add("11");
        values.add("12");
        values.add("13");
        values.add("21");
        values.add("22");
        values.add("23");
        values.add("31");
        values.add("32");
        values.add("33");
        values.add("41");
        values.add("42");
        values.add("51");
        values.add("91");
        values.add("92");
        values.add("93");

        txtmna3.setText(getString(R.string.mna3) + ": " + lables.get(values.indexOf(String.valueOf(PSSPApp.mna3))));
        mna6.setEnabled(false);


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

    public void checkChild(View v) {
        DatabaseHelper db = new DatabaseHelper(SectionAActivity.this);
        String chName = db.getChildByHH(mna5.getText().toString(), mna4.getText().toString());

        child_name.setText(chName);
        if (chName.equals("No Child Found")) {
            mna6.setEnabled(false);
        } else {
            mna6.setEnabled(true);
            PSSPApp.mnb1 = chName.split("|")[0];
            PSSPApp.mna06a = chName.split("|")[1];
        }
    }
    public void submitSecA(View v) throws JSONException {
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

    public void endForm(View v) throws JSONException {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();

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

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = null;
        rowId = db.addForm(PSSPApp.fc);

        PSSPApp.fc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            PSSPApp.fc.setUID(
                    (PSSPApp.fc.getDeviceID() + PSSPApp.fc.getID()));
            Toast.makeText(this, "Current Form No: " + PSSPApp.fc.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        PSSPApp.fc = new FormsContract();
        PSSPApp.fc.setTagId(sharedPref.getString("tagName", null));
        PSSPApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        PSSPApp.fc.setFormDate(dtToday);
        PSSPApp.fc.setUser(PSSPApp.username);
        PSSPApp.fc.setAppVer(PSSPApp.versionName + "." + PSSPApp.versionCode);
        PSSPApp.fc.setMna3(String.valueOf(PSSPApp.mna3));
        PSSPApp.fc.setMna4(mna4.getText().toString());
        PSSPApp.fc.setMna5(mna5.getText().toString());
        PSSPApp.fc.setMna6(mna6.isChecked() ? "1" : "2");

        PSSPApp.fc.setMna6a(PSSPApp.mna06a);

        PSSPApp.mna06a = "";

        JSONObject sA = new JSONObject();

        sA.put("mna8", mna8.getText().toString());
        sA.put("mna9", mna9.getText().toString());
        switch (mna10.getCheckedRadioButtonId()) {
            case R.id.mna10a:
                sA.put("mna10", "1");
                break;
            case R.id.mna10b:
                sA.put("mna10", "2");
                break;
            case R.id.mna10c:
                sA.put("mna10", "3");
                break;
            case R.id.mna10d:
                sA.put("mna10", "4");
                break;
            case R.id.mna10e:
                sA.put("mna10", "5");
                break;
            case R.id.mna10x:
                sA.put("mna10", "96");
                break;
            default:
                sA.put("mna10", "default");
        }
        sA.put("mna10x96", mna10x96.getText().toString());
        sA.put("mna11", mna11.getText().toString());
        switch (mna12.getCheckedRadioButtonId()) {
            case R.id.mna12a:
                sA.put("mna12", "1");
                break;
            case R.id.mna12b:
                sA.put("mna12", "2");
                break;
            case R.id.mna12c:
                sA.put("mna12", "3");
                break;
            case R.id.mna12d:
                sA.put("mna12", "4");
                break;
            case R.id.mna12e:
                sA.put("mna12", "5");
                break;
            case R.id.mna12f:
                sA.put("mna12", "6");
                break;
            case R.id.mna12g:
                sA.put("mna12", "7");
                break;
            case R.id.mna12x:
                sA.put("mna12", "96");
                break;
            default:
                sA.put("mna12", "default");
        }
        sA.put("mna12x96", mna12x96.getText().toString());
        sA.put("mna13", mna13.getText().toString());

        PSSPApp.fc.setsA(String.valueOf(sA));
        setGPS();

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

        //Toast.makeText(sA.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

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

        if (mna4.getText().toString().length() < 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mna4), Toast.LENGTH_LONG).show();
            mna4.setError("This data is invalid!");
            Log.i(TAG, "mna4: This data is invalid!");
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

        if (mna5.getText().toString().length() < 5 || !mna5.getText().toString().contains("-")) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mna5), Toast.LENGTH_LONG).show();
            mna5.setError("This data is invalid!");
            Log.i(TAG, "mna5: This data is invalid!");
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
            } else if (Integer.valueOf(mna11.getText().toString()) < 15) {
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
            } else if (Integer.valueOf(mna13.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mna13), Toast.LENGTH_LONG).show();
                mna13.setError("This data is invalid!");
                Log.i(TAG, "mna13: This data is invalid!");
                return false;
            } else {
                mna13.setError(null);
            }
        }
        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        // CONVERTING GPS TIMESTAMP TO DATETIME FORMAT
        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        PSSPApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
        PSSPApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
        PSSPApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
        PSSPApp.fc.setGpsTime(date); // Timestamp is converted to date above

        Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
    }
}
