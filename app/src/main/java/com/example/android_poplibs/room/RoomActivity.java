package com.example.android_poplibs.room;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android_poplibs.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RoomActivity extends AppCompatActivity {

    private RoomPresenter roomPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        ButterKnife.bind(this);
        roomPresenter = new RoomPresenter();
    }

    @OnClick({R.id.btn_add_one_user, R.id.btn_add_some_user,
            R.id.btn_delete_user, R.id.btn_update_user, R.id.btn_all_users})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_one_user:
                roomPresenter.addUser();
                break;
            case R.id.btn_add_some_user:
                roomPresenter.addSomeUsers();
                break;
            case R.id.btn_delete_user:
                roomPresenter.deleteUser();
                break;
            case R.id.btn_update_user:
                roomPresenter.updateUser();
                break;
            case R.id.btn_all_users:
                roomPresenter.getAll();
                break;
        }
    }
}
