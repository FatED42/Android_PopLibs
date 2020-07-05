package com.example.android_poplibs.observer;

import android.util.Log;

import java.util.ArrayList;

public class Spam implements Observable {

    private static final String TAG = "Spam";

    private ArrayList<Observer> arrayList;
    private String name;
    private String num;

    public Spam() {
        arrayList = new ArrayList<>();
    }

    public void newSpam(String name, String num) {
        this.name = name;
        this.num = num;

        notifyAllObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        Log.d(TAG, "registerObserver: ");
        arrayList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        Log.d(TAG, "unregisterObserver: ");
        arrayList.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        Log.d(TAG, "notifyAllObservers: ");
        for (int i = 0; i < arrayList.size(); i++) {
            Observer observer = arrayList.get(i);
            observer.updateData(name, num);
        }
    }
}
