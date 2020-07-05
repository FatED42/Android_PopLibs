package com.example.android_poplibs.observer;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;

public class ObserverActivity extends AppCompatActivity {

    private Spam spam = new Spam();
    private Iam iam = new Iam();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
    }

    public void register(View view) {
        spam.registerObserver(iam);
    }

    public void unregister(View view) {
        spam.unregisterObserver(iam);
    }

    public void emitter(View view) {
        spam.newSpam("Spam", "01");
    }
}
