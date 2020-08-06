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
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class RetrofitActivity extends MvpAppCompatActivity implements RetrofitView {

    @BindView(R.id.imageView)
    ImageView imageView;

    private static final String TAG = "RetrofitActivity";

    @InjectPresenter
    RetrofitPresenter retrofitPresenter;

    @ProvidePresenter
    public RetrofitPresenter providePresenter() {
        return new RetrofitPresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
    }

    @Override
    public void showPhoto(String avatarUrl) {
        Glide
                .with(this)
                .load(avatarUrl)
                .into(imageView);
    }
}
