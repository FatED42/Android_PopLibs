package com.example.android_poplibs.retrofit;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import moxy.MvpPresenter;

public class RetrofitPresenter extends MvpPresenter<RetrofitView> {

    private static final String TAG = "RetrofitPresenter";
    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    @Override
    protected void onFirstViewAttach() {
        getString();
    }

    public void getString() {
        Observable<User> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            Log.d(TAG, "login: " + user.login);
            Log.d(TAG, "company: " + user.company);
            if (user != null) {
                getViewState().showPhoto(user.avatarUrl);
            }
        }, throwable -> Log.e(TAG, "onError: " + throwable));
    }

}
