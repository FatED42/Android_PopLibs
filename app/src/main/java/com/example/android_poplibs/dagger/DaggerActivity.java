package com.example.android_poplibs.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;
import com.example.android_poplibs.dagger.app.App;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App.getAppComponent().inject(this);

        new Red();
        new White();

        Log.d(TAG, "onCreate: " + green.show());
        Log.i(TAG, "onCreate: " + green);
    }

}
