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
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionIMActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();


    @BindView(R.id.activity_section_im)
    ScrollView activitySectionIm;
    @BindView(R.id.child_count)
    TextView childCount;
    @BindView(R.id.child_name)
    TextView childName;
    @BindView(R.id.ima)
    EditText ima;
    @BindView(R.id.imaf)
    EditText imaf;
    @BindView(R.id.imrwic)
    RadioGroup imrwic;
    @BindView(R.id.imrwica)
    RadioButton imrwica;
    @BindView(R.id.imrwicx)
    RadioButton imrwicx;
    @BindView(R.id.imb)
    RadioGroup imb;
    @BindView(R.id.imba)
    RadioButton imba;
    @BindView(R.id.imbb)
    RadioButton imbb;
    @BindView(R.id.imc)
    RadioGroup imc;
    @BindView(R.id.imca)
    RadioButton imca;
    @BindView(R.id.imcb)
    RadioButton imcb;
    @BindView(R.id.imAgeDob)
    Switch imAgeDob;
    @BindView(R.id.fldGrpimDOB)
    LinearLayout fldGrpimDOB;
    @BindView(R.id.imd)
    DatePicker imd;
    @BindView(R.id.fldGrpimAge)
    LinearLayout fldGrpimAge;
    @BindView(R.id.imey)
    EditText imey;
    @BindView(R.id.imem)
    EditText imem;
    @BindView(R.id.imed)
    EditText imed;
    @BindView(R.id.imf)
    RadioGroup imf;
    @BindView(R.id.imfa)
    RadioButton imfa;
    @BindView(R.id.imfb)
    RadioButton imfb;
    @BindView(R.id.img)
    RadioGroup img;
    @BindView(R.id.imga)
    RadioButton imga;
    @BindView(R.id.imgb)
    RadioButton imgb;
    @BindView(R.id.imh)
    RadioGroup imh;
    @BindView(R.id.imha)
    RadioButton imha;
    @BindView(R.id.imhb)
    RadioButton imhb;
    @BindView(R.id.imi)
    RadioGroup imi;
    @BindView(R.id.imia)
    RadioButton imia;
    @BindView(R.id.imib)
    RadioButton imib;
    @BindView(R.id.imic)
    RadioButton imic;
    @BindView(R.id.imj)
    EditText imj;
    @BindView(R.id.imk)
    RadioGroup imk;
    @BindView(R.id.imka)
    RadioButton imka;
    @BindView(R.id.imkb)
    RadioButton imkb;
    @BindView(R.id.imkc)
    RadioButton imkc;
    @BindView(R.id.iml)
    RadioGroup iml;
    @BindView(R.id.imla)
    RadioButton imla;
    @BindView(R.id.imlb)
    RadioButton imlb;
    @BindView(R.id.fldGrpimm)
    LinearLayout fldGrpimm;
    @BindView(R.id.imm)
    RadioGroup imm;
    @BindView(R.id.imma)
    RadioButton imma;
    @BindView(R.id.immb)
    RadioButton immb;
    @BindView(R.id.immc)
    RadioButton immc;
    @BindView(R.id.immd)
    RadioButton immd;
    @BindView(R.id.bcg)
    RadioGroup bcg;
    @BindView(R.id.bcga)
    RadioButton bcga;
    @BindView(R.id.bcgb)
    RadioButton bcgb;
    @BindView(R.id.bcgsrc)
    RadioGroup bcgsrc;
    @BindView(R.id.bcgsrca)
    RadioButton bcgsrca;
    @BindView(R.id.bcgsrcb)
    RadioButton bcgsrcb;
    @BindView(R.id.bcgscar)
    RadioGroup bcgscar;
    @BindView(R.id.bcgscara)
    RadioButton bcgscara;
    @BindView(R.id.bcgscarb)
    RadioButton bcgscarb;
    @BindView(R.id.bcgscarc)
    RadioButton bcgscarc;
    @BindView(R.id.opv0)
    RadioGroup opv0;
    @BindView(R.id.opv0a)
    RadioButton opv0a;
    @BindView(R.id.opv0b)
    RadioButton opv0b;
    @BindView(R.id.opv0src)
    RadioGroup opv0src;
    @BindView(R.id.opv0srca)
    RadioButton opv0srca;
    @BindView(R.id.opv0srcb)
    RadioButton opv0srcb;
    @BindView(R.id.p1)
    RadioGroup p1;
    @BindView(R.id.p1a)
    RadioButton p1a;
    @BindView(R.id.p1b)
    RadioButton p1b;
    @BindView(R.id.p1src)
    RadioGroup p1src;
    @BindView(R.id.p1srca)
    RadioButton p1srca;
    @BindView(R.id.p1srcb)
    RadioButton p1srcb;
    @BindView(R.id.pcv1)
    RadioGroup pcv1;
    @BindView(R.id.pcv1a)
    RadioButton pcv1a;
    @BindView(R.id.pcv1b)
    RadioButton pcv1b;
    @BindView(R.id.pcv1src)
    RadioGroup pcv1src;
    @BindView(R.id.pcv1srca)
    RadioButton pcv1srca;
    @BindView(R.id.pcv1srcb)
    RadioButton pcv1srcb;
    @BindView(R.id.opv1)
    RadioGroup opv1;
    @BindView(R.id.opv1a)
    RadioButton opv1a;
    @BindView(R.id.opv1b)
    RadioButton opv1b;
    @BindView(R.id.opv1src)
    RadioGroup opv1src;
    @BindView(R.id.opv1srca)
    RadioButton opv1srca;
    @BindView(R.id.opv1srcb)
    RadioButton opv1srcb;
    @BindView(R.id.p2)
    RadioGroup p2;
    @BindView(R.id.p2a)
    RadioButton p2a;
    @BindView(R.id.p2b)
    RadioButton p2b;
    @BindView(R.id.p2src)
    RadioGroup p2src;
    @BindView(R.id.p2srca)
    RadioButton p2srca;
    @BindView(R.id.p2srcb)
    RadioButton p2srcb;
    @BindView(R.id.pcv2)
    RadioGroup pcv2;
    @BindView(R.id.pcv2a)
    RadioButton pcv2a;
    @BindView(R.id.pcv2b)
    RadioButton pcv2b;
    @BindView(R.id.pcv2src)
    RadioGroup pcv2src;
    @BindView(R.id.pcv2srca)
    RadioButton pcv2srca;
    @BindView(R.id.pcv2srcb)
    RadioButton pcv2srcb;
    @BindView(R.id.opv2)
    RadioGroup opv2;
    @BindView(R.id.opv2a)
    RadioButton opv2a;
    @BindView(R.id.opv2b)
    RadioButton opv2b;
    @BindView(R.id.opv2src)
    RadioGroup opv2src;
    @BindView(R.id.opv2srca)
    RadioButton opv2srca;
    @BindView(R.id.opv2srcb)
    RadioButton opv2srcb;
    @BindView(R.id.p3)
    RadioGroup p3;
    @BindView(R.id.p3a)
    RadioButton p3a;
    @BindView(R.id.p3b)
    RadioButton p3b;
    @BindView(R.id.p3src)
    RadioGroup p3src;
    @BindView(R.id.p3srca)
    RadioButton p3srca;
    @BindView(R.id.p3srcb)
    RadioButton p3srcb;
    @BindView(R.id.pcv3)
    RadioGroup pcv3;
    @BindView(R.id.pcv3a)
    RadioButton pcv3a;
    @BindView(R.id.pcv3b)
    RadioButton pcv3b;
    @BindView(R.id.pcv3src)
    RadioGroup pcv3src;
    @BindView(R.id.pcv3srca)
    RadioButton pcv3srca;
    @BindView(R.id.pcv3srcb)
    RadioButton pcv3srcb;
    @BindView(R.id.opv3)
    RadioGroup opv3;
    @BindView(R.id.opv3a)
    RadioButton opv3a;
    @BindView(R.id.opv3b)
    RadioButton opv3b;
    @BindView(R.id.opv3src)
    RadioGroup opv3src;
    @BindView(R.id.opv3srca)
    RadioButton opv3srca;
    @BindView(R.id.opv3srcb)
    RadioButton opv3srcb;
    @BindView(R.id.m1)
    RadioGroup m1;
    @BindView(R.id.m1a)
    RadioButton m1a;
    @BindView(R.id.m1b)
    RadioButton m1b;
    @BindView(R.id.m1src)
    RadioGroup m1src;
    @BindView(R.id.m1srca)
    RadioButton m1srca;
    @BindView(R.id.m1srcb)
    RadioButton m1srcb;
    @BindView(R.id.m2)
    RadioGroup m2;
    @BindView(R.id.m2a)
    RadioButton m2a;
    @BindView(R.id.m2b)
    RadioButton m2b;
    @BindView(R.id.m2src)
    RadioGroup m2src;
    @BindView(R.id.m2srca)
    RadioButton m2srca;
    @BindView(R.id.m2srcb)
    RadioButton m2srcb;
    @BindView(R.id.imdr)
    RadioGroup imdr;
    @BindView(R.id.imdra)
    RadioButton imdra;
    @BindView(R.id.imdrb)
    RadioButton imdrb;
    @BindView(R.id.imari)
    RadioGroup imari;
    @BindView(R.id.imaria)
    RadioButton imaria;
    @BindView(R.id.imarib)
    RadioButton imarib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_im);
        ButterKnife.bind(this);
        PSSPApp.chCount++;
        childCount.setText("(" + PSSPApp.chCount + " of " + PSSPApp.chTotal + ")");

        ima.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                childName.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        imAgeDob.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpimDOB.setVisibility(View.VISIBLE);
                    imd.setMaxDate(new Date().getTime());
                    imd.setMinDate(new Date().getTime() - (PSSPApp.MILLISECONDS_IN_YEAR * 5));
                    fldGrpimAge.setVisibility(View.GONE);
                    imed.setText(null);
                    imem.setText(null);
                    imey.setText(null);
                } else {
                    fldGrpimDOB.setVisibility(View.GONE);
                    fldGrpimAge.setVisibility(View.VISIBLE);
                }
            }
        });

        imka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpimm.setVisibility(View.VISIBLE);
                } else {
                    fldGrpimm.setVisibility(View.GONE);
                    imm.clearCheck();
                }
            }
        });


    }

    public void submitSecIM(View v) throws JSONException {
        Toast.makeText(this, "Processing Section IM", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDG()) {
                Intent secE;
                if (PSSPApp.chCount < PSSPApp.chTotal) {
                    Toast.makeText(this, "Starting Section IM", Toast.LENGTH_SHORT).show();
                    secE = new Intent(this, SectionIMActivity.class);
                } else {
                    Toast.makeText(this, "Starting Section E", Toast.LENGTH_SHORT).show();
                    secE = new Intent(this, SectionEActivity.class);
                }
                startActivity(secE);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDG() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = null;
        rowId = db.addIM(PSSPApp.im);

        PSSPApp.im.setId(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Current Form UID: " + PSSPApp.fc.getUID(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Current IM UID: " + PSSPApp.im.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
        String DOB = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(imd.getCalendarView().getDate());

        PSSPApp.im = new IMsContract();

        PSSPApp.im.setUID(PSSPApp.fc.getUID());
        PSSPApp.im.setChid(PSSPApp.fc.getUID() + String.format("%02d", PSSPApp.chCount));

        JSONObject im = new JSONObject();

        im.put("ima", ima.getText().toString());
        im.put("imb", imba.isChecked() ? "1" : imbb.isChecked() ? "2" : "");
        im.put("imc", imca.isChecked() ? "1" : imcb.isChecked() ? "2" : "");
        im.put("imd", DOB);
        im.put("imed", imed.getText().toString());
        im.put("imem", imem.getText().toString());
        im.put("imey", imey.getText().toString());
        im.put("imf", imfa.isChecked() ? "1" : imfb.isChecked() ? "2" : "");
        im.put("img", imga.isChecked() ? "1" : imgb.isChecked() ? "2" : "");
        im.put("imh", imha.isChecked() ? "1" : imhb.isChecked() ? "2" : "");
        im.put("imi", imia.isChecked() ? "1" : imib.isChecked() ? "2" : imic.isChecked() ? "3" : "");
        im.put("imj", imj.getText().toString());
        im.put("imk", imka.isChecked() ? "1" : imkb.isChecked() ? "2" : imkc.isChecked() ? "3" : "");
        im.put("iml", imla.isChecked() ? "1" : imlb.isChecked() ? "2" : "");
        im.put("imm", imma.isChecked() ? "1" : immb.isChecked() ? "2" : immc.isChecked() ? "3" : immd.isChecked() ? "4" : "");
        im.put("bcg", bcga.isChecked() ? "1" : bcgb.isChecked() ? "2" : "");
        im.put("bcgscar", bcgscara.isChecked() ? "1" : bcgscarb.isChecked() ? "2" : bcgscarc.isChecked() ? "3" : "");
        im.put("bcgsrc", bcgsrca.isChecked() ? "1" : bcgsrcb.isChecked() ? "2" : "");
        im.put("opv0", opv0a.isChecked() ? "1" : opv0b.isChecked() ? "2" : "");
        im.put("opv0src", opv0srca.isChecked() ? "1" : opv0srcb.isChecked() ? "2" : "");
        im.put("opv1", opv1a.isChecked() ? "1" : opv1b.isChecked() ? "2" : "");
        im.put("opv1src", opv1srca.isChecked() ? "1" : opv1srcb.isChecked() ? "2" : "");

        im.put("opv2", opv2a.isChecked() ? "1" : opv2b.isChecked() ? "2" : "");
        im.put("opv2src", opv2srca.isChecked() ? "1" : opv2srcb.isChecked() ? "2" : "");

        im.put("opv3", opv3a.isChecked() ? "1" : opv3b.isChecked() ? "2" : "");
        im.put("opv3src", opv3srca.isChecked() ? "1" : opv3srcb.isChecked() ? "2" : "");

        im.put("pcv1", pcv1a.isChecked() ? "1" : pcv1b.isChecked() ? "2" : "");
        im.put("pcv1src", pcv1srca.isChecked() ? "1" : pcv1srcb.isChecked() ? "2" : "");

        im.put("pcv2", pcv2a.isChecked() ? "1" : pcv2b.isChecked() ? "2" : "");
        im.put("pcv2src", pcv2srca.isChecked() ? "1" : pcv2srcb.isChecked() ? "2" : "");

        im.put("pcv3", pcv3a.isChecked() ? "1" : pcv3b.isChecked() ? "2" : "");
        im.put("pcv3src", pcv3srca.isChecked() ? "1" : pcv3srcb.isChecked() ? "2" : "");

        im.put("p1", p1a.isChecked() ? "1" : p1b.isChecked() ? "2" : "");
        im.put("p1src", p1srca.isChecked() ? "1" : p1srcb.isChecked() ? "2" : "");

        im.put("p2", p2a.isChecked() ? "1" : p2b.isChecked() ? "2" : "");
        im.put("p2src", p2srca.isChecked() ? "1" : p2srcb.isChecked() ? "2" : "");

        im.put("p3", p3a.isChecked() ? "1" : p3b.isChecked() ? "2" : "");
        im.put("p3src", p3srca.isChecked() ? "1" : p3srcb.isChecked() ? "2" : "");

        im.put("m1", m1a.isChecked() ? "1" : m1b.isChecked() ? "2" : "");
        im.put("m1src", m1srca.isChecked() ? "1" : m1srcb.isChecked() ? "2" : "");

        im.put("m2", m2a.isChecked() ? "1" : m2b.isChecked() ? "2" : "");
        im.put("m2src", m2srca.isChecked() ? "1" : m2srcb.isChecked() ? "2" : "");

        im.put("dr", imdra.isChecked() ? "1" : imdrb.isChecked() ? "2" : "");
        im.put("ari", imaria.isChecked() ? "1" : imarib.isChecked() ? "2" : "");


        PSSPApp.im.setIM(String.valueOf(im));
        PSSPApp.im.setUID(PSSPApp.fc.getDeviceID() + PSSPApp.fc.getID());

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }


    private boolean formValidation() {
        Toast.makeText(this, "Validating Section IM", Toast.LENGTH_SHORT).show();


        // ima
        if (ima.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(This is Required): " + getString(R.string.ima), Toast.LENGTH_LONG).show();
            ima.setError("This is Required");
            Log.i(TAG, "ima: This is Required");
            return false;
        } else {
            ima.setError(null);
        }

        // imaf
        if (imaf.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(This is Required): " + getString(R.string.imaf), Toast.LENGTH_LONG).show();
            imaf.setError("This is Required");
            Log.i(TAG, "imaf: This is Required");
            return false;
        } else {
            imaf.setError(null);
        }

        // imb
        if (imb.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imb), Toast.LENGTH_LONG).show();
            imbb.setError("This data is Required!");
            Log.i(TAG, "imb: This data is Required!");
            return false;
        } else {
            imbb.setError(null);
        }
        // imc
        if (imc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imc), Toast.LENGTH_LONG).show();
            imcb.setError("This data is Required!");
            Log.i(TAG, "imc: This data is Required!");
            return false;
        } else {
            imcb.setError(null);
        }


        // ime
        if (!imAgeDob.isChecked() && (imem.getText().toString().isEmpty() || imed.getText().toString().isEmpty() || imey.getText().toString().isEmpty())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ime), Toast.LENGTH_LONG).show();
            imem.setError("This is Empty");
            Log.i(TAG, "This is Empty");
            return false;

        } else if (!imAgeDob.isChecked() && Integer.valueOf(imed.getText().toString()) > 29) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.ime), Toast.LENGTH_LONG).show();
            imed.setError("This is invalid");
            Log.i(TAG, "This is invalid");
            return false;
        } else if (!imAgeDob.isChecked() && Integer.valueOf(imem.getText().toString()) > 11) {
            imed.setError(null);
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.ime), Toast.LENGTH_LONG).show();
            imem.setError("This is invalid");
            Log.i(TAG, "This is invalid");
            return false;
        } else if (!imAgeDob.isChecked() && Integer.valueOf(imey.getText().toString()) > 4) {
            imem.setError(null);
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.ime), Toast.LENGTH_LONG).show();
            imey.setError("This is invalid");
            Log.i(TAG, "This is invalid");
            return false;
        } else {
            imey.setError(null);
        }

        // imf
        if (imf.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imf), Toast.LENGTH_LONG).show();
            imfb.setError("This data is Required!");
            Log.i(TAG, "imf: This data is Required!");
            return false;
        } else {
            imfb.setError(null);
        }
        // img
        if (img.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.img), Toast.LENGTH_LONG).show();
            imgb.setError("This data is Required!");
            Log.i(TAG, "img: This data is Required!");
            return false;
        } else {
            imgb.setError(null);
        }
        // imh
        if (imh.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imh), Toast.LENGTH_LONG).show();
            imhb.setError("This data is Required!");
            Log.i(TAG, "imh: This data is Required!");
            return false;
        } else {
            imhb.setError(null);
        }
        // imi
        if (imi.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imi), Toast.LENGTH_LONG).show();
            imic.setError("This data is Required!");
            Log.i(TAG, "imi: This data is Required!");
            return false;
        } else {
            imic.setError(null);
        }


        // imj
        if (imj.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(This is Required): " + getString(R.string.imj), Toast.LENGTH_LONG).show();
            imj.setError("This is Required");
            Log.i(TAG, "imj: This is Required");
            return false;
        } else {
            imj.setError(null);
        }

        // imk
        if (imk.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imk), Toast.LENGTH_LONG).show();
            imkc.setError("This data is Required!");
            Log.i(TAG, "imk: This data is Required!");
            return false;
        } else {
            imkc.setError(null);
        }
        // iml
        if (iml.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.iml), Toast.LENGTH_LONG).show();
            imlb.setError("This data is Required!");
            Log.i(TAG, "iml: This data is Required!");
            return false;
        } else {
            imlb.setError(null);
        }
        // imm
        if (imka.isChecked() && imm.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imm), Toast.LENGTH_LONG).show();
            immd.setError("This data is Required!");
            Log.i(TAG, "imm: This data is Required!");
            return false;
        } else {
            immd.setError(null);
        }

        // bcg
        if (bcg.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.bcg), Toast.LENGTH_LONG).show();
            bcgb.setError("This data is Required!");
            Log.i(TAG, "bcg: This data is Required!");
            return false;
        } else {
            bcgb.setError(null);
        }

        // bcg source
        if (bcgsrc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.bcgsrc), Toast.LENGTH_LONG).show();
            bcgsrca.setError("This data is Required!");
            Log.i(TAG, "bcg: This data is Required!");
            return false;
        } else {
            bcgsrca.setError(null);
        }

        // bcg source
        if (bcgscar.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.bcgscar), Toast.LENGTH_LONG).show();
            bcgscara.setError("This data is Required!");
            Log.i(TAG, "bcg: This data is Required!");
            return false;
        } else {
            bcgscara.setError(null);
        }

        // opv0
        if (opv0.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv0), Toast.LENGTH_LONG).show();
            opv0b.setError("This data is Required!");
            Log.i(TAG, "opv0: This data is Required!");
            return false;
        } else {
            opv0b.setError(null);
        }

        // opv0 source
        if (opv0src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv0src), Toast.LENGTH_LONG).show();
            opv0srca.setError("This data is Required!");
            Log.i(TAG, "opv0: This data is Required!");
            return false;
        } else {
            opv0srca.setError(null);
        }

        // opv1
        if (opv1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv1), Toast.LENGTH_LONG).show();
            opv1b.setError("This data is Required!");
            Log.i(TAG, "opv1: This data is Required!");
            return false;
        } else {
            opv1b.setError(null);
        }

        // opv1 source
        if (opv1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv1src), Toast.LENGTH_LONG).show();
            opv1srca.setError("This data is Required!");
            Log.i(TAG, "opv1: This data is Required!");
            return false;
        } else {
            opv1srca.setError(null);
        }

        // opv2
        if (opv2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv2), Toast.LENGTH_LONG).show();
            opv2b.setError("This data is Required!");
            Log.i(TAG, "opv2: This data is Required!");
            return false;
        } else {
            opv2b.setError(null);
        }

        // opv2 source
        if (opv2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv2src), Toast.LENGTH_LONG).show();
            opv2srca.setError("This data is Required!");
            Log.i(TAG, "opv2: This data is Required!");
            return false;
        } else {
            opv2srca.setError(null);
        }

        // opv3
        if (opv3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv3), Toast.LENGTH_LONG).show();
            opv3b.setError("This data is Required!");
            Log.i(TAG, "opv3: This data is Required!");
            return false;
        } else {
            opv3b.setError(null);
        }

        // opv3 source
        if (opv3src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.opv3src), Toast.LENGTH_LONG).show();
            opv3srca.setError("This data is Required!");
            Log.i(TAG, "opv3: This data is Required!");
            return false;
        } else {
            opv3srca.setError(null);
        }

        // p1
        if (p1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.p1), Toast.LENGTH_LONG).show();
            p1b.setError("This data is Required!");
            Log.i(TAG, "p1: This data is Required!");
            return false;
        } else {
            p1b.setError(null);
        }

        // p1 source
        if (p1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.p1src), Toast.LENGTH_LONG).show();
            p1srca.setError("This data is Required!");
            Log.i(TAG, "p1: This data is Required!");
            return false;
        } else {
            p1srca.setError(null);
        }

        // pcv1
        if (pcv1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv1), Toast.LENGTH_LONG).show();
            pcv1b.setError("This data is Required!");
            Log.i(TAG, "pcv1: This data is Required!");
            return false;
        } else {
            pcv1b.setError(null);
        }

        // pcv1 source
        if (pcv1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv1src), Toast.LENGTH_LONG).show();
            pcv1srca.setError("This data is Required!");
            Log.i(TAG, "pcv1: This data is Required!");
            return false;
        } else {
            pcv1srca.setError(null);
        }

        // pcv2
        if (pcv2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv2), Toast.LENGTH_LONG).show();
            pcv2b.setError("This data is Required!");
            Log.i(TAG, "pcv2: This data is Required!");
            return false;
        } else {
            pcv2b.setError(null);
        }

        // pcv2 source
        if (pcv2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv2src), Toast.LENGTH_LONG).show();
            pcv2srca.setError("This data is Required!");
            Log.i(TAG, "pcv2: This data is Required!");
            return false;
        } else {
            pcv2srca.setError(null);
        }

        // pcv3
        if (pcv3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv3), Toast.LENGTH_LONG).show();
            pcv3b.setError("This data is Required!");
            Log.i(TAG, "pcv3: This data is Required!");
            return false;
        } else {
            pcv3b.setError(null);
        }

        // pcv3 source
        if (pcv3src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.pcv3src), Toast.LENGTH_LONG).show();
            pcv3srca.setError("This data is Required!");
            Log.i(TAG, "pcv3: This data is Required!");
            return false;
        } else {
            pcv3srca.setError(null);
        }

        // m1
        if (m1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.m1), Toast.LENGTH_LONG).show();
            m1b.setError("This data is Required!");
            Log.i(TAG, "m1: This data is Required!");
            return false;
        } else {
            m1b.setError(null);
        }

        // m1 source
        if (m1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.m1src), Toast.LENGTH_LONG).show();
            m1srca.setError("This data is Required!");
            Log.i(TAG, "m1: This data is Required!");
            return false;
        } else {
            m1srca.setError(null);
        }

        // m2
        if (m2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.m2), Toast.LENGTH_LONG).show();
            m2b.setError("This data is Required!");
            Log.i(TAG, "m2: This data is Required!");
            return false;
        } else {
            m2b.setError(null);
        }

        // m2 source
        if (m2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.m2src), Toast.LENGTH_LONG).show();
            m2srca.setError("This data is Required!");
            Log.i(TAG, "m2: This data is Required!");
            return false;
        } else {
            m2srca.setError(null);
        }

        // imdr
        if (imdr.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imdr), Toast.LENGTH_LONG).show();
            imdrb.setError("This data is Required!");
            Log.i(TAG, "imdr: This data is Required!");
            return false;
        } else {
            imdrb.setError(null);
        }

        // imari
        if (imari.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.imari), Toast.LENGTH_LONG).show();
            imarib.setError("This data is Required!");
            Log.i(TAG, "imari: This data is Required!");
            return false;
        } else {
            imarib.setError(null);
        }

        return true;
    }
}
