package com.example.android_poplibs.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeOfYear {

    @Expose
    @SerializedName("time_of_year")
    public String timeOfYear;

    @Expose
    @SerializedName("year")
    public String year;

}
