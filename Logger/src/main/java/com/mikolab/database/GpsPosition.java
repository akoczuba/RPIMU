package com.mikolab.database;

/**
 * Created by User on 2016-01-11.
 */
public class GpsPosition {

    String type="";

    long id=-1;
    public String rawNMEA = "";
    public float time = 0.0f;
    public float lat = 0.0f;
    public float lon = 0.0f;
    public boolean fixed = false;
    public int quality = 0;
    public float dir = 0.0f;
    public float altitude = 0.0f;
    public float velocity = 0.0f;

    public void updatefix() {
        fixed = quality > 0;
    }

    public String toString() {
        return String.format("POSITION: lat: %f, lon: %f, time: %f, Q: %d, dir: %f, alt: %f, vel: %f", lat, lon, time, quality, dir, altitude, velocity);
    }
    public String toJson() {
        return "";
    }

    public GpsPosition(){

    }
}
