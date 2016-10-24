package edu.aku.hassannaqvi.pssp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;

public class ActivitySectionFActivity extends Activity {

    @BindView(R.id.activity_section_F)
    ScrollView activitySectionF;
    @BindView(R.id.mnf1)
    RadioGroup mnf1;
    @BindView(R.id.mnf1a)
    RadioButton mnf1a;
    @BindView(R.id.mnf1b)
    RadioButton mnf1b;
    @BindView(R.id.mnf1c)
    RadioButton mnf1c;
    @BindView(R.id.mnf1d)
    RadioButton mnf1d;
    @BindView(R.id.mnf1e)
    RadioButton mnf1e;
    @BindView(R.id.mnf1x)
    RadioButton mnf1x;
    @BindView(R.id.mnf1xx)
    EditText mnf1xx;
    @BindView(R.id.mnf2)
    RadioGroup mnf2;
    @BindView(R.id.mnf2a)
    RadioButton mnf2a;
    @BindView(R.id.mnf2b)
    RadioButton mnf2b;
    @BindView(R.id.mnf2c)
    RadioButton mnf2c;
    @BindView(R.id.mnf2d)
    RadioButton mnf2d;
    @BindView(R.id.mnf2e)
    RadioButton mnf2e;
    @BindView(R.id.mnf2f)
    RadioButton mnf2f;
    @BindView(R.id.mnf2g)
    RadioButton mnf2g;
    @BindView(R.id.mnf2h)
    RadioButton mnf2h;
    @BindView(R.id.mnf2i)
    RadioButton mnf2i;
    @BindView(R.id.mnf2x)
    RadioButton mnf2x;
    @BindView(R.id.mnf2xx)
    EditText mnf2xx;
    @BindView(R.id.mnf3)
    RadioGroup mnf3;
    @BindView(R.id.mnf3a)
    RadioButton mnf3a;
    @BindView(R.id.mnf3b)
    RadioButton mnf3b;
    @BindView(R.id.mnf3c)
    RadioButton mnf3c;
    @BindView(R.id.mnf3x)
    RadioButton mnf3x;
    @BindView(R.id.mnf3xx)
    EditText mnf3xx;
    @BindView(R.id.mnf4)
    EditText mnf4;
    @BindView(R.id.mnf5)
    RadioGroup mnf5;
    @BindView(R.id.mnf5a)
    RadioButton mnf5a;
    @BindView(R.id.mnf5b)
    RadioButton mnf5b;
    @BindView(R.id.mnf5c)
    RadioButton mnf5c;
    @BindView(R.id.mnf5d)
    RadioButton mnf5d;
    @BindView(R.id.mnf5e)
    RadioButton mnf5e;
    @BindView(R.id.mnf5f)
    RadioButton mnf5f;
    @BindView(R.id.mnf5g)
    RadioButton mnf5g;
    @BindView(R.id.mnf5h)
    RadioButton mnf5h;
    @BindView(R.id.mnf5i)
    RadioButton mnf5i;
    @BindView(R.id.mnf5x)
    RadioButton mnf5x;
    @BindView(R.id.mnf5xx)
    EditText mnf5xx;
    @BindView(R.id.mnf6)
    RadioGroup mnf6;
    @BindView(R.id.mnf6a)
    RadioButton mnf6a;
    @BindView(R.id.mnf6b)
    RadioButton mnf6b;
    @BindView(R.id.mnf7)
    RadioGroup mnf7;
    @BindView(R.id.mnf7a)
    RadioButton mnf7a;
    @BindView(R.id.mnf7b)
    RadioButton mnf7b;
    @BindView(R.id.mnf7c)
    RadioButton mnf7c;
    @BindView(R.id.mnf7d)
    RadioButton mnf7d;
    @BindView(R.id.mnf7e)
    RadioButton mnf7e;
    @BindView(R.id.mnf7f)
    RadioButton mnf7f;
    @BindView(R.id.mnf7g)
    RadioButton mnf7g;
    @BindView(R.id.mnf7x)
    RadioButton mnf7x;
    @BindView(R.id.mnf7xx)
    EditText mnf7xx;
    @BindView(R.id.mnf8)
    RadioGroup mnf8;
    @BindView(R.id.mnf8a)
    RadioButton mnf8a;
    @BindView(R.id.mnf8b)
    RadioButton mnf8b;
    @BindView(R.id.mnf8c)
    RadioButton mnf8c;
    @BindView(R.id.mnf8d)
    RadioButton mnf8d;
    @BindView(R.id.mnf8e)
    RadioButton mnf8e;
    @BindView(R.id.mnf8f)
    RadioButton mnf8f;
    @BindView(R.id.mnf8g)
    RadioButton mnf8g;
    @BindView(R.id.mnf8h)
    RadioButton mnf8h;
    @BindView(R.id.mnf8i)
    RadioButton mnf8i;
    @BindView(R.id.mnf8j)
    RadioButton mnf8j;
    @BindView(R.id.mnf8k)
    RadioButton mnf8k;
    @BindView(R.id.mnf8l)
    RadioButton mnf8l;
    @BindView(R.id.mnf8m)
    RadioButton mnf8m;
    @BindView(R.id.mnf8n)
    RadioButton mnf8n;
    @BindView(R.id.mnf8x)
    RadioButton mnf8x;
    @BindView(R.id.mnf8xx)
    EditText mnf8xx;
    @BindView(R.id.mnf9a)
    EditText mnf9a;
    @BindView(R.id.mnf9b)
    EditText mnf9b;
    @BindView(R.id.mnf9c)
    EditText mnf9c;
    @BindView(R.id.mnf9d)
    EditText mnf9d;
    @BindView(R.id.mnf9e)
    EditText mnf9e;
    @BindView(R.id.mnf9f)
    EditText mnf9f;
    @BindView(R.id.mnf9g)
    EditText mnf9g;
    @BindView(R.id.mnf9gx)
    EditText mnf9gx;
    @BindView(R.id.mnf9h)
    EditText mnf9h;
    @BindView(R.id.mnf9i)
    EditText mnf9i;
    @BindView(R.id.mnf9j)
    EditText mnf9j;
    @BindView(R.id.mnf9k)
    EditText mnf9k;
    @BindView(R.id.mnf9l)
    EditText mnf9l;
    @BindView(R.id.mnf9m)
    EditText mnf9m;
    @BindView(R.id.mnf9n)
    EditText mnf9n;
    @BindView(R.id.mnf9o)
    EditText mnf9o;
    @BindView(R.id.mnf9p)
    EditText mnf9p;
    @BindView(R.id.mnf9q)
    EditText mnf9q;
    @BindView(R.id.mnf9r)
    EditText mnf9r;
    @BindView(R.id.mnf9s)
    EditText mnf9s;
    @BindView(R.id.mnf9t)
    EditText mnf9t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

    }


    public void submitSecC(View v) {
        Toast.makeText(this, "Processing Section F", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section F", Toast.LENGTH_SHORT).show();
                Intent secF = new Intent(this, SectionDActivity.class);
                startActivity(secF);
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


    private boolean formValidation()
    {

        Toast.makeText(this, "Validating Section F", Toast.LENGTH_SHORT).show();

        if (mnf1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf1), Toast.LENGTH_LONG).show();
            mnf1x.setError("This data is Required!");
            Log.i(TAG, "mnf1: This data is Required!");
            return false;
        }

        else {
            mnf1.setError(null);
        }


 if (mnf2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf2), Toast.LENGTH_LONG).show();
     mnf2x.setError("This data is Required!");
            Log.i(TAG, "mnf2: This data is Required!");
            return false;
        }

        else {
            mnf2.setError(null);
        }


 if (mnf2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf2), Toast.LENGTH_LONG).show();
     mnf2x.setError("This data is Required!");
            Log.i(TAG, "mnf2: This data is Required!");
            return false;
        }

        else {
            mnf2.setError(null);
        }


 if (mnf3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf3), Toast.LENGTH_LONG).show();
     mnf3x.setError("This data is Required!");
            Log.i(TAG, "mnf3: This data is Required!");
            return false;
        }

        else {
            mnf3.setError(null);
        }

if (mnf5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf5), Toast.LENGTH_LONG).show();
     mnf5x.setError("This data is Required!");
            Log.i(TAG, "mnf5: This data is Required!");
            return false;
        }

        else {
            mnf5.setError(null);
        }



if (mnf6.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf6), Toast.LENGTH_LONG).show();
     mnf6b.setError("This data is Required!");
            Log.i(TAG, "mnf6: This data is Required!");
            return false;
        }

        else {
            mnf6.setError(null);
        }

if (mnf7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf7), Toast.LENGTH_LONG).show();
     mnf7x.setError("This data is Required!");
            Log.i(TAG, "mnf7: This data is Required!");
            return false;
        }

        else {
            mnf7.setError(null);
        }


if (mnf8.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mnf8), Toast.LENGTH_LONG).show();
     mnf8x.setError("This data is Required!");
            Log.i(TAG, "mnf8: This data is Required!");
            return false;
        }

        else {
            mnf8.setError(null);
        }



        mnf1x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf1xx.setVisibility(View.VISIBLE);
                } else {
                    mnf1xx.setText(null);
                    mnf1xx.setVisibility(View.GONE);
                }
            }
        });

 mnf2x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf2xx.setVisibility(View.VISIBLE);
                } else {
                    mnf2xx.setText(null);
                    mnf2xx.setVisibility(View.GONE);
                }
            }
        });


mnf3x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf3xx.setVisibility(View.VISIBLE);
                } else {
                    mnf3xx.setText(null);
                    mnf3xx.setVisibility(View.GONE);
                }
            }
        });

mnf5x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf5xx.setVisibility(View.VISIBLE);
                } else {
                    mnf5xx.setText(null);
                    mnf5xx.setVisibility(View.GONE);
                }
            }
        });

mnf7x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf7xx.setVisibility(View.VISIBLE);
                } else {
                    mnf7xx.setText(null);
                    mnf7xx.setVisibility(View.GONE);
                }
            }
        });


mnf8x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf8xx.setVisibility(View.VISIBLE);
                } else {
                    mnf8xx.setText(null);
                    mnf8xx.setVisibility(View.GONE);
                }
            }
        });






    }
