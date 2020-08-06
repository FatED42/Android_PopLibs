package com.example.android_poplibs.dagger;

import android.util.Log;

import com.example.android_poplibs.dagger.app.App;

import javax.inject.Inject;

public class Red {

    private static final String TAG = "Red";

    @Inject
    Green green;

    public Red() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }
}
