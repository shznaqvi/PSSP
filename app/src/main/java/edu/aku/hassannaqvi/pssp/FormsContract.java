package edu.aku.hassannaqvi.pssp;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "Sero 2016-17";
    private final String surveyType = "SN";
    private String _ID;
    private String UID;
    private String mna1; // Date
    private String mna2; // DC name
    private String mna3; // District
    private String mna4; // PSU
    private String mna5; // HH no.
    private String mna6; // Index Child Name
    private String mna6a; // Name Confirmation
    private String mna7; // Form Status
    private String sA;
    private String sB;
    private String sC;
    private String sD;
    private String sE;
    private String sF;
    private String sG;
    private String gpsLat;
    private String gpsLng;
    private String gpsTime;
    private String gpsAcc;
    private String deviceID;


    public FormsContract() {
    }

    public FormsContract(JSONObject jsonObject) throws JSONException {
        this.mna1 = jsonObject.getString("mna1");
        this.mna2 = jsonObject.getString("mna2");
        this.mna3 = jsonObject.getString("mna3");
        this.mna4 = jsonObject.getString("mna4");
        this.mna5 = jsonObject.getString("mna5");
        this.mna6 = jsonObject.getString("mna6");
        this.mna6 = jsonObject.getString("mna6a");
        this.mna7 = jsonObject.getString("mna7");
        this.sA = jsonObject.getString("sA");
        this.sB = jsonObject.getString("sB");
        this.sC = jsonObject.getString("sC");
        this.sD = jsonObject.getString("sD");
        this.sE = jsonObject.getString("sE");
        this.sF = jsonObject.getString("sF");
        this.sG = jsonObject.getString("sG");
        this.gpsLat = jsonObject.getString("gpsLat");
        this.gpsLng = jsonObject.getString("gpsLng");
        this.gpsTime = jsonObject.getString("gpsTime");
        this.gpsAcc = jsonObject.getString("gpsAcc");
        this.deviceID = jsonObject.getString("deviceID");
    }

    public FormsContract(Cursor cursor) {
        this.mna1 = cursor.getString(cursor.getColumnIndex("mna1"));
        this.mna2 = cursor.getString(cursor.getColumnIndex("mna2"));
        this.mna3 = cursor.getString(cursor.getColumnIndex("mna3"));
        this.mna4 = cursor.getString(cursor.getColumnIndex("mna4"));
        this.mna5 = cursor.getString(cursor.getColumnIndex("mna5"));
        this.mna6 = cursor.getString(cursor.getColumnIndex("mna6"));
        this.mna6 = cursor.getString(cursor.getColumnIndex("mna6a"));
        this.mna6 = cursor.getString(cursor.getColumnIndex("mna7"));
        this.sA = cursor.getString(cursor.getColumnIndex("sA"));
        this.sB = cursor.getString(cursor.getColumnIndex("sB"));
        this.sC = cursor.getString(cursor.getColumnIndex("sC"));
        this.sD = cursor.getString(cursor.getColumnIndex("sD"));
        this.sE = cursor.getString(cursor.getColumnIndex("sE"));
        this.sF = cursor.getString(cursor.getColumnIndex("sF"));
        this.sG = cursor.getString(cursor.getColumnIndex("sG"));
        this.gpsLat = cursor.getString(cursor.getColumnIndex("gpsLat"));
        this.gpsLng = cursor.getString(cursor.getColumnIndex("gpsLng"));
        this.gpsTime = cursor.getString(cursor.getColumnIndex("gpsTime"));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex("gpsAcc"));
        this.deviceID = cursor.getString(cursor.getColumnIndex("deviceID"));
    }

    public String getID() {
        return _ID;
    }

    public void setID(String _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getMna1() {
        return mna1;
    }

    public void setMna1(String mna1) {
        this.mna1 = mna1;
    }

    public String getMna2() {
        return mna2;
    }

    public void setMna2(String mna2) {
        this.mna2 = mna2;
    }

    public String getMna3() {
        return mna3;
    }

    public void setMna3(String mna3) {
        this.mna3 = mna3;
    }

    public String getMna4() {
        return mna4;
    }

    public void setMna4(String mna4) {
        this.mna4 = mna4;
    }

    public String getMna5() {
        return mna5;
    }

    public void setMna5(String mna5) {
        this.mna5 = mna5;
    }

    public String getMna6() {
        return mna6;
    }

    public void setMna6(String mna6) {
        this.mna6 = mna6;
    }

    public String getMna6a() {
        return mna6a;
    }

    public void setMna6a(String mna6a) {
        this.mna6a = mna6a;
    }

    public String getMna7() {
        return mna7;
    }

    public void setMna7(String mna7) {
        this.mna7 = mna7;
    }

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }

    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

   /* public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();


        json.put("locationId", getLocationId());

        return json;

    }*/

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_PROJECT_NAME = "projectname";
        public static final String COLUMN_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_DEVICE_ID = "deviceid";
        public static final String COLUMN_GPS_LAT = "gpslat";
        public static final String COLUMN_GPS_LNG = "gpslng";
        public static final String COLUMN_GPS_ACC = "gpsacc";
        public static final String COLUMN_GPS_TIME = "gpstime";
        public static final String COLUMN_SYNC = "sync";
        public static final String COLUMN_MNA1 = "mna1";
        public static final String COLUMN_MNA2 = "mna2";
        public static final String COLUMN_MNA3 = "mna3";
        public static final String COLUMN_MNA4 = "mna4";
        public static final String COLUMN_MNA5 = "mna5";
        public static final String COLUMN_MNA6 = "mna6";
        public static final String COLUMN_MNA6A = "mna6a";
        public static final String COLUMN_MNA7 = "mna7";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SB = "sb";
        public static final String COLUMN_SC = "sc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
    }
}


