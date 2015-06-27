package com.example.philbert.mylocation;

/**
 * Created by Philbert on 19.06.15.
 */
public class MyMarker {

    private String mSpotName;
    private String mPicture;
    private String mDescription;
    private Double mLatitude;
    private Double mLongitude;

    public MyMarker(String spotName, String picture, String description, Double latitude, Double longitude)
    {
        this.mSpotName = spotName;
        this.mPicture = picture;
        this.mDescription = description;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
    }

    public String getmSpotName() {
        return mSpotName;
    }

    public void setmSpotName(String mSpotName) {
        this.mSpotName = mSpotName;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String picture) {
        this.mPicture = picture;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String description) {
        this.mDescription = description;
    }

    public Double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(Double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public Double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(Double mLongitude) {
        this.mLongitude = mLongitude;
    }
}
