package edu.aku.hassannaqvi.pssp;

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

import edu.aku.hassannaqvi.pssp.FormsContract.singleForm;
import edu.aku.hassannaqvi.pssp.IMsContract.singleIms;
import edu.aku.hassannaqvi.pssp.PSUsContract.singleChild;
import edu.aku.hassannaqvi.pssp.UsersContract.singleUser;

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
    public static final String SQL_CREATE_IMS = "CREATE TABLE " + singleIms.TABLE_NAME + "("
            + singleIms._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleIms.COLUMN_CHID + " TEXT,"
            + singleIms.COLUMN_UID + " TEXT,"
            + singleIms.COLUMN_IM + " TEXT );";
    public static final String SQL_CREATE_USERS = "CREATE TABLE " + singleUser.TABLE_NAME + "("
            + singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleUser.ROW_USERNAME + " TEXT,"
            + singleUser.ROW_PASSWORD + " TEXT );";
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

    public void updateForms(String id) {
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
public Collection<FormsContract> getUnsyncedForms() {
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
        String whereClause = singleForm.COLUMN_SYNCED + " <> ?";
        String[] whereArgs = {"1"};
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

        String whereClause = singleForm.COLUMN_MNA1 + " LIKE ?";
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
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public void syncChild(JSONArray childlist) {
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
                    return child.getChild_name();

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