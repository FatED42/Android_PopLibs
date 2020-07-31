package com.example.android_poplibs.coffee;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class Presenter {

    private static final String TAG = "CoffeePresenter";

    public Observable<String> getCupOfCoffee() {
        Observable<String> observable = Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String cup = "cup: " + i;
                    Log.d(TAG, "getCupOfCoffee: " + Thread.currentThread().getName() + ": " + cup);
                    emitter.onNext(cup);
                }
            } catch (InterruptedException e) {
                Log.d(TAG, "getCupOfCoffee: not disposed");
            }
        }).subscribeOn(Schedulers.io());

        return observable;
    }
}
