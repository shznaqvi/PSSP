package edu.aku.hassannaqvi.pssp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import edu.aku.hassannaqvi.pssp.FormsContract.singleForm;

/**
 * Created by hassan.naqvi on 10/29/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sero.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + singleForm.TABLE_NAME + "("
            + singleForm._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleForm.COLUMN_UID + " TEXT,"
            + singleForm.COLUMN_DEVICE_ID + " TEXT,"
            + singleForm.COLUMN_PROJECT_NAME + " TEXT,"
            + singleForm.COLUMN_SURVEY_TYPE + " TEXT,"
            + singleForm.COLUMN_GPS_ACC + " TEXT,"
            + singleForm.COLUMN_GPS_LAT + " TEXT,"
            + singleForm.COLUMN_GPS_LNG + " TEXT,"
            + singleForm.COLUMN_GPS_TIME + " TEXT,"
            + singleForm.COLUMN_SYNC + " TEXT,"
            + singleForm.COLUMN_MNA1 + " TEXT,"
            + singleForm.COLUMN_MNA2 + " TEXT,"
            + singleForm.COLUMN_MNA3 + " TEXT,"
            + singleForm.COLUMN_MNA4 + " TEXT,"
            + singleForm.COLUMN_MNA5 + " TEXT,"
            + singleForm.COLUMN_MNA6 + " TEXT,"
            + singleForm.COLUMN_MNA6A + " TEXT,"
            + singleForm.COLUMN_MNA7 + " TEXT,"
            + singleForm.COLUMN_SA + " TEXT,"
            + singleForm.COLUMN_SB + " TEXT,"
            + singleForm.COLUMN_SC + " TEXT,"
            + singleForm.COLUMN_SD + " TEXT,"
            + singleForm.COLUMN_SE + " TEXT,"
            + singleForm.COLUMN_SF + " TEXT,"
            + singleForm.COLUMN_SG + " TEXT"
            + " );";

    private static final java.lang.String SQL_DELETE_FORMS = "DROP TABLE IF EXISTS " + singleForm.TABLE_NAME;

    public static String DB_FORM_ID;
    public static String DB_OCS_ID;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        onCreate(db);
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_PROJECT_NAME, fc.getProjectName());
        values.put(singleForm.COLUMN_SURVEY_TYPE, fc.getProjectName());
        values.put(singleForm.COLUMN_DEVICE_ID, fc.getDeviceID());
        values.put(singleForm.COLUMN_GPS_ACC, fc.getGpsAcc());
        values.put(singleForm.COLUMN_GPS_LAT, fc.getGpsLat());
        values.put(singleForm.COLUMN_GPS_LNG, fc.getGpsLng());
        values.put(singleForm.COLUMN_GPS_TIME, fc.getGpsTime());
        values.put(singleForm.COLUMN_MNA1, fc.getMna1());
        values.put(singleForm.COLUMN_MNA2, fc.getMna2());
        values.put(singleForm.COLUMN_MNA3, fc.getMna3());
        values.put(singleForm.COLUMN_MNA4, fc.getMna4());
        values.put(singleForm.COLUMN_MNA5, fc.getMna5());
        values.put(singleForm.COLUMN_MNA6, fc.getMna6());
        values.put(singleForm.COLUMN_MNA6A, fc.getMna6a());
        values.put(singleForm.COLUMN_MNA7, fc.getMna7());
        values.put(singleForm.COLUMN_SA, fc.getsA());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                singleForm.TABLE_NAME,
                singleForm.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public int updateSB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SB, PSSPApp.fc.getsB());
        values.put(singleForm.COLUMN_UID, PSSPApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSC() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SC, PSSPApp.fc.getsC());


        // Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSD() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SD, PSSPApp.fc.getsD());


        // Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSE() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SE, PSSPApp.fc.getsE());


        // Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSF() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SF, PSSPApp.fc.getsF());


        // Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSG() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SG, PSSPApp.fc.getsG());


        // Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

}