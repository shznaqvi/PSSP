package edu.aku.hassannaqvi.pssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SectionFActivity extends Activity {

    private static final String TAG = SectionFActivity.class.getSimpleName();


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
    @BindView(R.id.mnf1x96)
    EditText mnf1x96;
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
    @BindView(R.id.mnf2x96)
    EditText mnf2x96;
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
    @BindView(R.id.mnf3x96)
    EditText mnf3x96;
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
    @BindView(R.id.mnf5x96)
    EditText mnf5x96;
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
    @BindView(R.id.mnf7x96)
    EditText mnf7x96;
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
    @BindView(R.id.mnf8x96)
    EditText mnf8x96;
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
    @BindView(R.id.mnf9gx96)
    EditText mnf9gx96;
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

        // F1 Others
        mnf1x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf1x96.setVisibility(View.VISIBLE);
                } else {
                    mnf1x96.setVisibility(View.GONE);
                    mnf1x96.setText(null);
                }
            }
        });

        // F2 Others
        mnf2x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf2x96.setVisibility(View.VISIBLE);
                } else {
                    mnf2x96.setVisibility(View.GONE);
                    mnf2x96.setText(null);
                }
            }
        });

        // F3 Others
        mnf3x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf3x96.setVisibility(View.VISIBLE);
                } else {
                    mnf3x96.setVisibility(View.GONE);
                    mnf3x96.setText(null);
                }
            }
        });

        // F5 Others
        mnf5x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf5x96.setVisibility(View.VISIBLE);
                } else {
                    mnf5x96.setVisibility(View.GONE);
                    mnf5x96.setText(null);
                }
            }
        });

        // F7 Others
        mnf7x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf7x96.setVisibility(View.VISIBLE);
                } else {
                    mnf7x96.setVisibility(View.GONE);
                    mnf7x96.setText(null);
                }
            }
        });

        // F8 Others
        mnf8x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mnf8x96.setVisibility(View.VISIBLE);
                } else {
                    mnf8x96.setVisibility(View.GONE);
                    mnf8x96.setText(null);
                }
            }
        });


    }

    public void submitSecF(View v) {
        Toast.makeText(this, "Processing Section F", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section G", Toast.LENGTH_SHORT).show();
                Intent secG = new Intent(this, SectionGActivity.class);
                startActivity(secG);
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
        Toast.makeText(this, "Validating Section F", Toast.LENGTH_SHORT).show();

        // F1
        if (mnf1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf1), Toast.LENGTH_LONG).show();
            mnf1x.setError("This data is Required!");
            Log.i(TAG, "mnf1: This data is Required!");
            return false;
        } else {
            mnf1x.setError(null);
        }

        // F1 Others
        if (mnf1x.isChecked() && mnf1x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf1), Toast.LENGTH_LONG).show();
            mnf1x96.setError("Data is empty");
            Log.i(TAG, "mnf1: Data is empty!");
            return false;
        } else {
            mnf1x96.setError(null);
        }

        // F2
        if (mnf2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf2), Toast.LENGTH_LONG).show();
            mnf2x.setError("This data is Required!");
            Log.i(TAG, "mnf2: This data is Required!");
            return false;
        } else {
            mnf2x.setError(null);
        }

        // F2 Others
        if (mnf2x.isChecked() && mnf2x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf2), Toast.LENGTH_LONG).show();
            mnf2x96.setError("Data is empty");
            Log.i(TAG, "mnf2: Data is empty!");
            return false;
        } else {
            mnf2x96.setError(null);
        }

        // F3
        if (mnf3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf3), Toast.LENGTH_LONG).show();
            mnf3x.setError("This data is Required!");
            Log.i(TAG, "mnf3: This data is Required!");
            return false;
        } else {
            mnf3x.setError(null);
        }

        // F3 Others
        if (mnf3x.isChecked() && mnf3x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf3), Toast.LENGTH_LONG).show();
            mnf3x96.setError("Data is empty");
            Log.i(TAG, "mnf3: Data is empty!");
            return false;
        } else {
            mnf3x96.setError(null);
        }

        // F4 Others
        if (mnf4.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf4), Toast.LENGTH_LONG).show();
            mnf4.setError("This data is Required!");
            Log.i(TAG, "mnf4: This data is Required!");
            return false;
        } else {
            mnf4.setError(null);
        }


        // F5
        if (mnf5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf5), Toast.LENGTH_LONG).show();
            mnf5x.setError("This data is Required!");
            Log.i(TAG, "mnf5: This data is Required!");
            return false;
        } else {
            mnf5x.setError(null);
        }

        // F5 Others
        if (mnf5x.isChecked() && mnf5x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf5), Toast.LENGTH_LONG).show();
            mnf5x96.setError("Data is empty");
            Log.i(TAG, "mnf5: Data is empty!");
            return false;
        } else {
            mnf5x96.setError(null);
        }

        // F6
        if (mnf6.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf6), Toast.LENGTH_LONG).show();
            mnf6b.setError("This data is Required!");
            Log.i(TAG, "mnf6: This data is Required!");
            return false;
        } else {
            mnf6b.setError(null);
        }

        // F7
        if (mnf7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf7), Toast.LENGTH_LONG).show();
            mnf7x.setError("This data is Required!");
            Log.i(TAG, "mnf7: This data is Required!");
            return false;
        } else {
            mnf7x.setError(null);
        }

        // F7 Others
        if (mnf7x.isChecked() && mnf7x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf7), Toast.LENGTH_LONG).show();
            mnf7x96.setError("Data is empty");
            Log.i(TAG, "mnf7: Data is empty!");
            return false;
        } else {
            mnf7x96.setError(null);
        }
        // F8
        if (mnf8.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.mnf8), Toast.LENGTH_LONG).show();
            mnf8x.setError("This data is Required!");
            Log.i(TAG, "mnf8: This data is Required!");
            return false;
        } else {
            mnf8x.setError(null);
        }

        // F8 Others
        if (mnf8x.isChecked() && mnf8x96.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf8), Toast.LENGTH_LONG).show();
            mnf8x96.setError("Data is empty");
            Log.i(TAG, "mnf8: Data is empty!");
            return false;
        } else {
            mnf8x96.setError(null);
        }

        // F9a Others
        if (mnf9a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9a.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9a.setError(null);
        }

        // F9b Others
        if (mnf9b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9b.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9b.setError(null);
        }

        // F9c Others
        if (mnf9c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9c.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9c.setError(null);
        }

        // F9d Others
        if (mnf9d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9d.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9d.setError(null);
        }

        // F9e Others
        if (mnf9e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9e.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9e.setError(null);
        }

        // F9f Others
        if (mnf9f.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9f.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9f.setError(null);
        }

        // F9g Others
        if (mnf9g.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9g.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else if (mnf9gx96.getText().toString().isEmpty()) {
            mnf9g.setError(null);
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9gx96.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9g.setError(null);
            mnf9gx96.setError(null);
        }

        // F9h Others
        if (mnf9h.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9h.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9h.setError(null);
        }

        // F9i Others
        if (mnf9i.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9i.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9i.setError(null);
        }

        // F9j Others
        if (mnf9j.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9j.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9j.setError(null);
        }

        // F9k Others
        if (mnf9k.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9k.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9k.setError(null);
        }

        // F9l Others
        if (mnf9l.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9l.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9l.setError(null);
        }

        // F9m Others
        if (mnf9m.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9m.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9m.setError(null);
        }

        // F9n Others
        if (mnf9n.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9n.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9n.setError(null);
        }

        // F9o Others
        if (mnf9o.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9o.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9o.setError(null);
        }

        // F9p Others
        if (mnf9p.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9p.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9p.setError(null);
        }

        // F9q Others
        if (mnf9q.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9q.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9q.setError(null);
        }

        // F9r Others
        if (mnf9r.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9r.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9r.setError(null);
        }

        // F9s Others
        if (mnf9s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9s.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9s.setError(null);
        }

        // F9t Others
        if (mnf9t.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnf9), Toast.LENGTH_LONG).show();
            mnf9t.setError("Data is empty");
            Log.i(TAG, "mnf9: Data is empty!");
            return false;
        } else {
            mnf9t.setError(null);
        }


        return true;
    }
}
