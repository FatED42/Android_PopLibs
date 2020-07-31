package com.example.android_poplibs.retrofit;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.android_poplibs.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RetrofitActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;

    private static final String TAG = "RetrofitActivity";

    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);

        retrofitPresenter = new RetrofitPresenter();
    }

    @OnClick(R.id.retrofitBtn)
    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
        retrofitPresenter.getString();

        Glide
                .with(this)
                .load("https://avatars0.githubusercontent.com/u/66577?v=4")
                .into(imageView);
    }
}
