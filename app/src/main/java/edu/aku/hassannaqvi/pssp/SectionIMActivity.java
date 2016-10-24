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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionIMActivity extends Activity {

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
    @BindView(R.id.imd)
    DatePicker imd;
    @BindView(R.id.imey)
    EditText imey;
    @BindView(R.id.imem)
    EditText imem;
    @BindView(R.id.imed)
    EditText imed;
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
    @BindView(R.id.bcgYes)
    RadioButton bcgYes;
    @BindView(R.id.bcgNO)
    RadioButton bcgNO;
    @BindView(R.id.bcgsrc)
    RadioGroup bcgsrc;
    @BindView(R.id.bcgsrcCard)
    RadioButton bcgsrcCard;
    @BindView(R.id.bcgsrcResp)
    RadioButton bcgsrcResp;
    @BindView(R.id.bcgscar)
    RadioGroup bcgscar;
    @BindView(R.id.bcgscarYES)
    RadioButton bcgscarYES;
    @BindView(R.id.bcgscarNO)
    RadioButton bcgscarNO;
    @BindView(R.id.bcgscarNP)
    RadioButton bcgscarNP;
    @BindView(R.id.opv0)
    RadioGroup opv0;
    @BindView(R.id.opv0YES)
    RadioButton opv0YES;
    @BindView(R.id.opv0NO)
    RadioButton opv0NO;
    @BindView(R.id.opv0src)
    RadioGroup opv0src;
    @BindView(R.id.opv0srcCard)
    RadioButton opv0srcCard;
    @BindView(R.id.opv0srcResp)
    RadioButton opv0srcResp;
    @BindView(R.id.p1)
    RadioGroup p1;
    @BindView(R.id.p1YES)
    RadioButton p1YES;
    @BindView(R.id.p1NO)
    RadioButton p1NO;
    @BindView(R.id.p1src)
    RadioGroup p1src;
    @BindView(R.id.p1srcCard)
    RadioButton p1srcCard;
    @BindView(R.id.p1srcResp)
    RadioButton p1srcResp;
    @BindView(R.id.pcv1)
    RadioGroup pcv1;
    @BindView(R.id.pcv1YES)
    RadioButton pcv1YES;
    @BindView(R.id.pcv1NO)
    RadioButton pcv1NO;
    @BindView(R.id.pcv1src)
    RadioGroup pcv1src;
    @BindView(R.id.pcv1srcCard)
    RadioButton pcv1srcCard;
    @BindView(R.id.pcv1srcResp)
    RadioButton pcv1srcResp;
    @BindView(R.id.opv1)
    RadioGroup opv1;
    @BindView(R.id.opv1YES)
    RadioButton opv1YES;
    @BindView(R.id.opv1NO)
    RadioButton opv1NO;
    @BindView(R.id.opv1src)
    RadioGroup opv1src;
    @BindView(R.id.opv1srcCard)
    RadioButton opv1srcCard;
    @BindView(R.id.opv1srcResp)
    RadioButton opv1srcResp;
    @BindView(R.id.p2)
    RadioGroup p2;
    @BindView(R.id.p2YES)
    RadioButton p2YES;
    @BindView(R.id.p2NO)
    RadioButton p2NO;
    @BindView(R.id.p2src)
    RadioGroup p2src;
    @BindView(R.id.p2srcCard)
    RadioButton p2srcCard;
    @BindView(R.id.p2srcResp)
    RadioButton p2srcResp;
    @BindView(R.id.pcv2)
    RadioGroup pcv2;
    @BindView(R.id.pcv2YES)
    RadioButton pcv2YES;
    @BindView(R.id.pcv2NO)
    RadioButton pcv2NO;
    @BindView(R.id.pcv2src)
    RadioGroup pcv2src;
    @BindView(R.id.pcv2srcCard)
    RadioButton pcv2srcCard;
    @BindView(R.id.pcv2srcResp)
    RadioButton pcv2srcResp;
    @BindView(R.id.opv2)
    RadioGroup opv2;
    @BindView(R.id.opv2YES)
    RadioButton opv2YES;
    @BindView(R.id.opv2NO)
    RadioButton opv2NO;
    @BindView(R.id.opv2src)
    RadioGroup opv2src;
    @BindView(R.id.opv2srcCard)
    RadioButton opv2srcCard;
    @BindView(R.id.opv2srcResp)
    RadioButton opv2srcResp;
    @BindView(R.id.p3)
    RadioGroup p3;
    @BindView(R.id.p3YES)
    RadioButton p3YES;
    @BindView(R.id.p3NO)
    RadioButton p3NO;
    @BindView(R.id.p3src)
    RadioGroup p3src;
    @BindView(R.id.p3srcCard)
    RadioButton p3srcCard;
    @BindView(R.id.p3srcResp)
    RadioButton p3srcResp;
    @BindView(R.id.pcv3)
    RadioGroup pcv3;
    @BindView(R.id.pcv3YES)
    RadioButton pcv3YES;
    @BindView(R.id.pcv3NO)
    RadioButton pcv3NO;
    @BindView(R.id.pcv3src)
    RadioGroup pcv3src;
    @BindView(R.id.pcv3srcCard)
    RadioButton pcv3srcCard;
    @BindView(R.id.pcv3srcREsp)
    RadioButton pcv3srcREsp;
    @BindView(R.id.opv3)
    RadioGroup opv3;
    @BindView(R.id.opv3YES)
    RadioButton opv3YES;
    @BindView(R.id.opv3NO)
    RadioButton opv3NO;
    @BindView(R.id.opv3src)
    RadioGroup opv3src;
    @BindView(R.id.opv3srcCard)
    RadioButton opv3srcCard;
    @BindView(R.id.opv3srcResp)
    RadioButton opv3srcResp;
    @BindView(R.id.m1)
    RadioGroup m1;
    @BindView(R.id.m1YES)
    RadioButton m1YES;
    @BindView(R.id.m1NO)
    RadioButton m1NO;
    @BindView(R.id.m1src)
    RadioGroup m1src;
    @BindView(R.id.m1srcCard)
    RadioButton m1srcCard;
    @BindView(R.id.m1srcResp)
    RadioButton m1srcResp;
    @BindView(R.id.m2)
    RadioGroup m2;
    @BindView(R.id.m2YES)
    RadioButton m2YES;
    @BindView(R.id.mnNO)
    RadioButton mnNO;
    @BindView(R.id.m2src)
    RadioGroup m2src;
    @BindView(R.id.m2srcCard)
    RadioButton m2srcCard;
    @BindView(R.id.m2srcResp)
    RadioButton m2srcResp;
    @BindView(R.id.imdr)
    RadioGroup imdr;
    @BindView(R.id.imdrYES)
    RadioButton imdrYES;
    @BindView(R.id.imdrNO)
    RadioButton imdrNO;
    @BindView(R.id.imari)
    RadioGroup imari;
    @BindView(R.id.imariYES)
    RadioButton imariYES;
    @BindView(R.id.imariNO)
    RadioButton imariNO;

    @BindView(R.id.fldGrpimDOB)
    LinearLayout fldGrpimDOB;
    @BindView(R.id.fldGrpimAge)
    LinearLayout fldGrpimAge;
    @BindView(R.id.fldGrpimm)
    LinearLayout fldGrpimm;

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
                    imd.setMinDate(new Date().getTime() - (PSSPApp.MILLISECONDS_IN_YEAR * 2));
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

    public void submitSecIM(View v) {
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
        Toast.makeText(this, "Database Updated!", Toast.LENGTH_SHORT).show();
        return true;
    }

    private void SaveDraft() {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {
        Toast.makeText(this, "Validating Section IM", Toast.LENGTH_SHORT).show();
        return true;
    }
}
