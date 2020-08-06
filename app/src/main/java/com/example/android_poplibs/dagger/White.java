package com.example.android_poplibs.dagger;

import android.util.Log;

import com.example.android_poplibs.dagger.app.App;

import javax.inject.Inject;

public class White {

    private static final String TAG = "White";

    @Inject
    Green green;

    public White() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }

}
