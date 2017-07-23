package com.example.apk.dasut;

/**
 * Created by APK on 23/07/17.
 */

public class UserData {

    String email_id;
    String android_id;
    String model;
    Double latitude;
    Double longitude;
    String dateandtime;
    String app_builder;

    public UserData() {

    }

    public UserData(String email_id, String android_id, String model, Double latitude, Double longitude, String dateandtime, String app_builder) {
        this.email_id = email_id;
        this.android_id = android_id;
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dateandtime = dateandtime;
        this.app_builder = app_builder;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getAndroid_id() {
        return android_id;
    }

    public String getModel() {
        return model;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getDateandtime() {
        return dateandtime;
    }

    public String getApp_builder() {
        return app_builder;
    }
}