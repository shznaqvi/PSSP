package edu.aku.hassannaqvi.pssp.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.pssp.contracts.FormsContract;
import edu.aku.hassannaqvi.pssp.contracts.FormsContract.singleForm;
import edu.aku.hassannaqvi.pssp.contracts.IMsContract;
import edu.aku.hassannaqvi.pssp.contracts.IMsContract.IMsTable;
import edu.aku.hassannaqvi.pssp.contracts.PSUsContract;
import edu.aku.hassannaqvi.pssp.contracts.PSUsContract.singleChild;
import edu.aku.hassannaqvi.pssp.contracts.UsersContract;
import edu.aku.hassannaqvi.pssp.contracts.UsersContract.singleUser;

/**
 * Created by hassan.naqvi on 10/29/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String SQL_CREATE_PSU = "CREATE TABLE " + singleChild.TABLE_NAME + "("
            + singleChild._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleChild.COLUMN_PSU + " TEXT,"
            + singleChild.COLUMN_LUID + " TEXT,"
            + singleChild.COLUMN_HH + " TEXT,"
            + singleChild.COLUMN_HH03 + " TEXT,"
            + singleChild.COLUMN_HH07 + " TEXT,"
            + singleChild.COLUMN_CHILD_NAME + " TEXT );";
    public static final String SQL_CREATE_IMS = "CREATE TABLE " + IMsTable.TABLE_NAME + "("
            + IMsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + IMsTable.COLUMN_APPVER + " TEXT,"
            + IMsTable.COLUMN_CHID + " TEXT,"
            + IMsTable.COLUMN_DEVICEID + " TEXT,"
            + IMsTable.COLUMN_FORMDATE + " TEXT,"
            + IMsTable.COLUMN_IM + " TEXT,"
            + IMsTable.COLUMN_SYNCED + " TEXT,"
            + IMsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + IMsTable.COLUMN_TAGID + " TEXT,"
            + IMsTable.COLUMN_UID + " TEXT,"
            + IMsTable.COLUMN_USER + " TEXT,"
            + IMsTable.COLUMN_UUID + " TEXT"
            + " );";
    public static final String SQL_CREATE_USERS = "CREATE TABLE " + singleUser.TABLE_NAME + "("
            + singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleUser.ROW_USERNAME + " TEXT,"
            + singleUser.ROW_PASSWORD + " TEXT );";
    public static final String DATABASE_NAME = "sero.db";
    public static final String DB_NAME = "sero_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + singleForm.TABLE_NAME + "("
            + singleForm._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleForm.COLUMN_UID + " TEXT,"
            + singleForm.COLUMN_DEVICE_ID + " TEXT,"
            + singleForm.COLUMN_TAGID + " TEXT,"
            + singleForm.COLUMN_APPVER + " TEXT,"
            + singleForm.COLUMN_PROJECT_NAME + " TEXT,"
            + singleForm.COLUMN_SURVEY_TYPE + " TEXT,"
            + singleForm.COLUMN_NAME_ROUND + " TEXT,"
            + singleForm.COLUMN_GPS_ACC + " TEXT,"
            + singleForm.COLUMN_GPS_LAT + " TEXT,"
            + singleForm.COLUMN_GPS_LNG + " TEXT,"
            + singleForm.COLUMN_GPS_TIME + " TEXT,"
            + singleForm.COLUMN_SYNCED + " TEXT,"
            + singleForm.COLUMN_SYNCED_DATE + " TEXT,"
            + singleForm.COLUMN_FORM_DATE + " TEXT,"
            + singleForm.COLUMN_USER + " TEXT,"
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
            "DROP TABLE IF EXISTS " + IMsTable.TABLE_NAME;
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + singleUser.TABLE_NAME;
    private static final String SQL_DELETE_PSUS =
            "DROP TABLE IF EXISTS " + singleChild.TABLE_NAME;
    public static String DB_FORM_ID;
    public static String DB_IMS_ID;
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_IMS);
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_PSU);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_IMS);
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_PSUS);

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
        values.put(singleForm.COLUMN_NAME_ROUND, fc.getRound());
        values.put(singleForm.COLUMN_FORM_DATE, fc.getFormDate());
        values.put(singleForm.COLUMN_USER, fc.getUser());
        values.put(singleForm.COLUMN_MNA3, fc.getMna3());
        values.put(singleForm.COLUMN_MNA4, fc.getMna4());
        values.put(singleForm.COLUMN_MNA5, fc.getMna5());
        values.put(singleForm.COLUMN_MNA6, fc.getMna6());
        values.put(singleForm.COLUMN_MNA6A, fc.getMna6a());
        values.put(singleForm.COLUMN_MNA7, fc.getMna7());
        values.put(singleForm.COLUMN_SA, fc.getsA());
        values.put(singleForm.COLUMN_SB, fc.getsB());
        values.put(singleForm.COLUMN_SC, fc.getsC());
        values.put(singleForm.COLUMN_SD, fc.getsD());
        values.put(singleForm.COLUMN_SE, fc.getsE());
        values.put(singleForm.COLUMN_SF, fc.getsF());
        values.put(singleForm.COLUMN_SG, fc.getsG());
        values.put(singleForm.COLUMN_TAGID, fc.getTagId());
        values.put(singleForm.COLUMN_APPVER, fc.getAppVer());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                singleForm.TABLE_NAME,
                singleForm.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SYNCED, true);
        values.put(singleForm.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = singleForm._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                singleForm.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedIMs(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(IMsTable.COLUMN_SYNCED, true);
        values.put(IMsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = IMsTable._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                IMsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public Long addIMs(IMsContract imc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(IMsTable._ID, imc.get_ID());
        values.put(IMsTable.COLUMN_APPVER, imc.getAppVer());
        values.put(IMsTable.COLUMN_CHID, imc.getChid());
        values.put(IMsTable.COLUMN_DEVICEID, imc.getDeviceId());
        values.put(IMsTable.COLUMN_FORMDATE, imc.getFormDate());
        values.put(IMsTable.COLUMN_IM, imc.getIm());
        values.put(IMsTable.COLUMN_TAGID, imc.getTagId());
        values.put(IMsTable.COLUMN_UID, imc.getUID());
        values.put(IMsTable.COLUMN_USER, imc.getUser());
        values.put(IMsTable.COLUMN_UUID, imc.getUUID());


        /* * * * * NO NEED TO USE THESE IN 'INSERT' * * * * */
        /*
        values.put(IMsTable.COLUMN_SYNCED, imc.getSynced());
        values.put(IMsTable.COLUMN_SYNCED_DATE, imc.getSynced_date());
        */


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                IMsTable.TABLE_NAME,
                IMsTable.COLUMN_NAME_NULLABLE,
                values);
        db.close();
        return newRowId;
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
                singleForm.COLUMN_NAME_ROUND,
                singleForm.COLUMN_SYNCED,
                singleForm.COLUMN_SYNCED_DATE,
                singleForm.COLUMN_FORM_DATE,
                singleForm.COLUMN_USER,
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
                singleForm.COLUMN_APPVER,
                singleForm.COLUMN_TAGID
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

    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleForm._ID,
                singleForm.COLUMN_UID,
                //singleForm.COLUMN_PROJECT_NAME,
                //singleForm.COLUMN_SURVEY_TYPE,
                singleForm.COLUMN_DEVICE_ID,
                singleForm.COLUMN_GPS_LAT,
                singleForm.COLUMN_GPS_LNG,
                singleForm.COLUMN_GPS_ACC,
                singleForm.COLUMN_GPS_TIME,
                singleForm.COLUMN_NAME_ROUND,
                //singleForm.COLUMN_SYNCED,
                //singleForm.COLUMN_SYNCED_DATE,
                singleForm.COLUMN_FORM_DATE,
                singleForm.COLUMN_USER,
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
                singleForm.COLUMN_APPVER,
                singleForm.COLUMN_TAGID
        };
        String whereClause = singleForm.COLUMN_SYNCED + " is null OR " + singleForm.COLUMN_SYNCED + " = ''";
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

    public Collection<FormsContract> getTodayForms() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleForm._ID,
                singleForm.COLUMN_MNA4,
                singleForm.COLUMN_MNA5,
                singleForm.COLUMN_MNA7,
        };

        String whereClause = singleForm.COLUMN_FORM_DATE + " LIKE ?";
        String[] whereArgs = {spDateT};
        String groupBy = null;
        String having = null;

        String orderBy =
                singleForm._ID + " ASC";

        Collection<FormsContract> formList = new ArrayList<FormsContract>();
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
                formList.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }


        // return contact list
        return formList;
    }

    public Collection<IMsContract> getAllIMs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                IMsTable._ID,
                IMsTable.COLUMN_APPVER,
                IMsTable.COLUMN_CHID,
                IMsTable.COLUMN_DEVICEID,
                IMsTable.COLUMN_FORMDATE,
                IMsTable.COLUMN_IM,
                IMsTable.COLUMN_SYNCED,
                IMsTable.COLUMN_SYNCED_DATE,
                IMsTable.COLUMN_TAGID,
                IMsTable.COLUMN_UID,
                IMsTable.COLUMN_USER,
                IMsTable.COLUMN_UUID


        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                IMsTable._ID + " ASC";

        Collection<IMsContract> allIM = new ArrayList<IMsContract>();
        try {
            c = db.query(
                    IMsTable.TABLE_NAME,  // The table to query
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

    public Collection<IMsContract> getUnsyncedIMs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                IMsTable._ID,
                IMsTable.COLUMN_APPVER,
                IMsTable.COLUMN_CHID,
                IMsTable.COLUMN_DEVICEID,
                IMsTable.COLUMN_FORMDATE,
                IMsTable.COLUMN_IM,
                IMsTable.COLUMN_TAGID,
                IMsTable.COLUMN_UID,
                IMsTable.COLUMN_USER,
                IMsTable.COLUMN_UUID


        };
        String whereClause = IMsTable.COLUMN_SYNCED + " is null OR " + IMsTable.COLUMN_SYNCED + " = ''";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                IMsTable._ID + " ASC";

        Collection<IMsContract> allIM = new ArrayList<IMsContract>();
        try {
            c = db.query(
                    IMsTable.TABLE_NAME,  // The table to query
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

    public void updateIMsUID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(IMsTable.COLUMN_UID, PSSPApp.im.getUID());

// Which row to update, based on the title
        String where = IMsTable._ID + " = ?";
        String[] whereArgs = {PSSPApp.im.get_ID().toString()};

        int count = db.update(
                IMsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateSB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SB, PSSPApp.fc.getsB());
        values.put(singleForm.COLUMN_UID, PSSPApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
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
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(PSSPApp.fc.getID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void addUser(UsersContract userscontract) {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(singleUser.ROW_USERNAME, userscontract.getUserName());
            values.put(singleUser.ROW_PASSWORD, userscontract.getPassword());
            db.insert(singleUser.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(singleUser.ROW_USERNAME, userName);
                values.put(singleUser.ROW_PASSWORD, password);
                db.insert(singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + singleUser.TABLE_NAME + " WHERE " + singleUser.ROW_USERNAME + "=? AND " + singleUser.ROW_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            return mCursor.getCount() > 0;
        }
        return false;
    }

    public void syncChildren(JSONArray childlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(PSUsContract.singleChild.TABLE_NAME, null, null);
        Log.d(TAG, "PSU table deleted!");
        try {
            JSONArray jsonArray = childlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String LUID = jsonObjectUser.getString("UID");
                String psu = jsonObjectUser.getString("hh02");
                String hh03 = jsonObjectUser.getString("hh03");
                String hh07 = jsonObjectUser.getString("hh07");
                String child_name = jsonObjectUser.getString("child_name");


                ContentValues values = new ContentValues();

                values.put(singleChild.COLUMN_LUID, LUID);
                values.put(singleChild.COLUMN_HH03, hh03);
                values.put(singleChild.COLUMN_HH07, hh07);
                values.put(singleChild.COLUMN_HH, hh03 + "-" + hh07);
                values.put(singleChild.COLUMN_PSU, psu);
                values.put(singleChild.COLUMN_CHILD_NAME, child_name);

                db.insert(singleChild.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public List<FormsContract> getFormsByPSU(String psu) {
        List<FormsContract> formList = new ArrayList<FormsContract>();
        // Select All Unsynced Query
        String selectQuery = "SELECT * FROM " + singleForm.TABLE_NAME + " WHERE " + singleForm.COLUMN_MNA4 + "='" + psu + "' ORDER BY " + singleForm._ID + " desc";
        //String selectQuery = "SELECT  * FROM " + singleForm.TABLE_NAME;
        Log.d(TAG, selectQuery);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                FormsContract form = new FormsContract();
                form.setFormDate(cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_FORM_DATE)));
                form.setMna5(cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA5)));
                form.setMna7(cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA7)));

                // Adding contact to list
                formList.add(form);
            } while (cursor.moveToNext());
        }

        // return contact list
        return formList;
    }


    public ArrayList<PSUsContract> getAllChildren() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<PSUsContract> childList = null;
        try {
            childList = new ArrayList<PSUsContract>();
            String QUERY = "SELECT * FROM " + singleChild.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    PSUsContract child = new PSUsContract(cursor);

                    childList.add(child);

                }
            }
            db.close();
        } catch (Exception e) {
        }
        return childList;
    }

    public String getChildByHH(String hh, String psu) {
        SQLiteDatabase db = this.getReadableDatabase();
        PSUsContract child = null;
        try {
            String QUERY = "SELECT * FROM " + singleChild.TABLE_NAME
                    + " where " + singleChild.COLUMN_HH + " = '" + hh.toUpperCase().replaceFirst("^0+(?!$)", "") + "' and " + singleChild.COLUMN_PSU + " = '" + psu + "' Limit 1";
            Cursor cursor = db.rawQuery(QUERY, null);
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    child = new PSUsContract(cursor);
                    return child.getChild_name() + "|"+child.getLUID();

                }
            } else {
                return "No Child Found";
            }
            db.close();
        } catch (Exception e) {
        }
        return "No Child Found";

    }


    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }


    }
}