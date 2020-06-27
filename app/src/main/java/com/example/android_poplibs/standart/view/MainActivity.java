package com.example.android_poplibs.standart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android_poplibs.R;
import com.example.android_poplibs.standart.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {

    private EditText editText;
    private TextView textView;
    private Button button;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        button.setOnClickListener(onClickListener);
        presenter = new MainPresenter(this);
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
            presenter.onBtnClick(editText.getText().toString());
        }
    };
}