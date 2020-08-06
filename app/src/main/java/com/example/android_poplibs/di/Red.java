package com.example.android_poplibs.di;

import android.util.Log;

public class Red {

    private static final String TAG = "Red";

    public Red(Green green) {
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }

}
