package com.example.android_poplibs.observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyAllObservers();
}
