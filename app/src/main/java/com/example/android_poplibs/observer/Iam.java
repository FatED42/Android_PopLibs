package com.example.android_poplibs.observer;

import android.util.Log;

public class Iam implements Observer {

    private static final String TAG = "Iam";

    @Override
    public void updateData(String name, String num) {
        Log.d(TAG, "display " + name + " number " + num);
    }
}
