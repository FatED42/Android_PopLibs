package com.example.android_poplibs.single;

import android.util.Log;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class TeaPresenter {

    private static final String TAG = "TeaPresenter";

    public Single<String> getCupOfTea() {
        Single<String> single = Single.create((SingleOnSubscribe<String>) emitter -> {
            String cup = "cup: ";
            Log.d(TAG, "getCupOfTea: " + Thread.currentThread().getName() + ": " + cup);
            emitter.onSuccess(cup);
        }).subscribeOn(Schedulers.io());
        return single;
    }

}
