package com.example.android_poplibs.moxy.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;
import com.example.android_poplibs.moxy.presenter.MainPresenter1;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class MainActivity1 extends MvpAppCompatActivity implements MainView1 {

    private EditText editText;
    private TextView textView;
    private Button button;

    @InjectPresenter
    MainPresenter1 presenter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        initViews();
        button.setOnClickListener(onClickListener);
    }

    private void initViews() {
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    public void setText(String text) {
        textView.setText(text);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter1.onBtnClick(editText.getText().toString());
        }
    };
}