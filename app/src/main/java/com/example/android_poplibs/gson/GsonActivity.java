package com.example.android_poplibs.gson;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonActivity extends AppCompatActivity {
    private static final String TAG = "GsonActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String json = "{\"time_of_year\": \"summer\", \"year\": 2020}";

        Gson gson = new GsonBuilder().create();
        TimeOfYear timeOfYear = gson.fromJson(json, TimeOfYear.class);

        Log.d(TAG, "Time of year: " + timeOfYear.timeOfYear);
        Log.d(TAG, "Year: " + timeOfYear.year);
    }
}
