package com.example.android_poplibs.withoutDi;

import android.util.Log;

public class White {

    private static final String TAG = "White";

    public White() {
        Green green = new Green();
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }

}
