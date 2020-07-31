package com.example.android_poplibs.single;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;

import butterknife.OnClick;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class TeaActivity extends AppCompatActivity {

    private static final String TAG = "CoffeeActivity";

    private Single<String> single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);

        TeaPresenter presenter = new TeaPresenter();
        single = presenter.getCupOfTea();
    }

    @OnClick(R.id.subTeaBtn)
    public void subscribe(View view) {
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                string -> Log.d(TAG, "subscribe: " + string),
                throwable -> Log.e(TAG, "subscribe: ", throwable));
    }
}