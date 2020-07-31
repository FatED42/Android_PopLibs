package com.example.android_poplibs.coffee;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;

import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class CoffeeActivity extends AppCompatActivity {

    private static final String TAG = "CoffeeActivity";

    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        Presenter presenter = new Presenter();
        observable = presenter.getCupOfCoffee();
    }

    @OnClick(R.id.subCoffeeBtn)
    public void subscribe(View view) {
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(
                string -> Log.d(TAG, "onNext: " + string),
                throwable -> Log.e(TAG, "onError: "),
                () -> Log.d(TAG, "onComplete: "));
    }

    @OnClick(R.id.unsubscribeCoffeeBtn)
    public void unsubscribe(View view) {
        disposable.dispose();
    }
}
