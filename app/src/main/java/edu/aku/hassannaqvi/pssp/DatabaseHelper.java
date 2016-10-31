package edu.aku.hassannaqvi.pssp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.pssp.FormsContract.singleForm;
import edu.aku.hassannaqvi.pssp.IMsContract.singleIms;

/**
 * Created by hassan.naqvi on 10/29/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_IMS = "CREATE TABLE " + singleIms.TABLE_NAME + "("
            + singleIms._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleIms.COLUMN_CHID + " TEXT,"
            + singleIms.COLUMN_UID + " TEXT,"
            + singleIms.COLUMN_IM + " TEXT );";
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
            + singleForm.COLUMN_SYNCED + " TEXT,"
            + singleForm.COLUMN_SYNCED_DATE + " TEXT,"
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
    private static final String SQL_DELETE_IMS =
            "DROP TABLE IF EXISTS " + singleIms.TABLE_NAME;

    public static String DB_FORM_ID;
    public static String DB_IMS_ID;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_IMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_IMS);

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

    public long addIM(IMsContract imscontract) {
        SQLiteDatabase db = this.getWritableDatabase();


        ContentValues values = new ContentValues();
        values.put(singleIms.COLUMN_UID, imscontract.getUID());
        values.put(singleIms.COLUMN_CHID, imscontract.getChid());
        values.put(singleIms.COLUMN_IM, imscontract.getIM());


        // Inserting Row
        long rowId = db.insert(singleIms.TABLE_NAME, null, values);
        db.close(); // Closing database connection
        DB_IMS_ID = String.valueOf(rowId);
        return rowId;
    }

    ////////////
    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleForm._ID,
                singleForm.COLUMN_UID,
                singleForm.COLUMN_PROJECT_NAME,
                singleForm.COLUMN_SURVEY_TYPE,
                singleForm.COLUMN_DEVICE_ID,
                singleForm.COLUMN_GPS_LAT,
                singleForm.COLUMN_GPS_LNG,
                singleForm.COLUMN_GPS_ACC,
                singleForm.COLUMN_GPS_TIME,
                singleForm.COLUMN_SYNCED,
                singleForm.COLUMN_SYNCED_DATE,
                singleForm.COLUMN_MNA1,
                singleForm.COLUMN_MNA2,
                singleForm.COLUMN_MNA3,
                singleForm.COLUMN_MNA4,
                singleForm.COLUMN_MNA5,
                singleForm.COLUMN_MNA6,
                singleForm.COLUMN_MNA6A,
                singleForm.COLUMN_MNA7,
                singleForm.COLUMN_SA,
                singleForm.COLUMN_SB,
                singleForm.COLUMN_SC,
                singleForm.COLUMN_SD,
                singleForm.COLUMN_SE,
                singleForm.COLUMN_SF,
                singleForm.COLUMN_SG,


        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                singleForm._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    singleForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<IMsContract> getAllIMs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleIms._ID,
                singleIms.COLUMN_UID,
                singleIms.COLUMN_CHID,
                singleIms.COLUMN_IM,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                singleIms._ID + " ASC";

        Collection<IMsContract> allIM = new ArrayList<IMsContract>();
        try {
            c = db.query(
                    singleIms.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                IMsContract ims = new IMsContract();
                allIM.add(ims.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allIM;
    }
//////////////////////////////

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

    public int updateEnd() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_MNA7, PSSPApp.fc.getMna7());


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