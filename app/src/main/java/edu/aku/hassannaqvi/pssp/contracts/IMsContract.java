package edu.aku.hassannaqvi.pssp.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class IMsContract {

    private static final String TAG = "IM_CONTRACT";
    public String tagId;
    private String  _ID;
    private String UID;
    private String UUID;
    private String chid;
    private String formDate = "";
    private String deviceId = "";
    private String user = "";
    private String im;
    private String synced = "";
    private String syncedDate = "";
    private String appVer = "";
    public IMsContract() {
    }

    public IMsContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(IMsTable._ID);
        this.appVer = jsonObject.getString(IMsTable.COLUMN_APPVER);
        this.chid = jsonObject.getString(IMsTable.COLUMN_CHID);
        this.deviceId = jsonObject.getString(IMsTable.COLUMN_DEVICEID);
        this.formDate = jsonObject.getString(IMsTable.COLUMN_FORMDATE);
        this.im = jsonObject.getString(IMsTable.COLUMN_IM);
        this.tagId = jsonObject.getString(IMsTable.COLUMN_TAGID);
        this.UID = jsonObject.getString(IMsTable.COLUMN_UID);
        this.user = jsonObject.getString(IMsTable.COLUMN_USER);
        this.UUID = jsonObject.getString(IMsTable.COLUMN_UUID);



        return this;
    }

    public IMsContract hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(IMsTable._ID));
        this.appVer = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_APPVER));
        this.chid = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_CHID));
        this.deviceId = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_DEVICEID));
        this.formDate = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_FORMDATE));
        this.im = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_IM));
        this.tagId = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_TAGID));
        this.UID = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_UID));
        this.user = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_USER));
        this.UUID = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_UUID));
        this.synced = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_SYNCED));
        this.syncedDate = cursor.getString(cursor.getColumnIndex(IMsTable.COLUMN_SYNCED_DATE));




        return this;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getChid() {
        return chid;
    }

    public void setChid(String chid) {
        this.chid = chid;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncedDate() {
        return syncedDate;
    }

    public void setSyncedDate(String syncedDate) {
        this.syncedDate = syncedDate;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getAppVer() {
        return appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(IMsTable._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(IMsTable.COLUMN_APPVER, this.appVer == null ? JSONObject.NULL : this.appVer);
        json.put(IMsTable.COLUMN_CHID, this.chid == null ? JSONObject.NULL : this.chid);
        json.put(IMsTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
        json.put(IMsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        if (!this.im.equals("")) {
            json.put(IMsTable.COLUMN_IM, this.im == null ? JSONObject.NULL : new JSONObject(this.im));
        }
        json.put(IMsTable.COLUMN_TAGID, this.tagId == null ? JSONObject.NULL : this.tagId);
        json.put(IMsTable.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(IMsTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(IMsTable.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);

        return json;
    }

    public static abstract class IMsTable implements BaseColumns {

        public static final String TABLE_NAME = "Ims";
        public static final String _URL = "ims.php";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_APPVER = "appver";
        public static final String COLUMN_CHID = "chid";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_IM = "im";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synceddate";
        public static final String COLUMN_TAGID = "tagid";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_UUID = "uuid";



    }

}