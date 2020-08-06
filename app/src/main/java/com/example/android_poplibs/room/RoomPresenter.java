package com.example.android_poplibs.room;

import android.util.Log;

import com.example.android_poplibs.App;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RoomPresenter {

    private static final String TAG = "RoomPresenter";

    private UserDao userDao;

    public RoomPresenter() {
        userDao = App.getAppDatabase().userDao();
    }


    public void addUser() {
        User user = new User();
        user.name = "Alexander";
        user.surname = "Zaytsev";
        user.age = 23;
        Disposable disposable = userDao.addUser(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.d(TAG, "addOneUser: " + id + ". " + Thread.currentThread().getName());
                }, throwable -> {
                    Log.e(TAG, "addOneUser: " + throwable);
                });
    }

    public void addSomeUsers() {
        User user1 = new User();
        user1.name = "Ivan";
        user1.surname = "Ivanov";
        user1.age = 18;
        User user2 = new User();
        user2.name = "Petr";
        user2.surname = "Petrov";
        user2.age = 25;
        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        Disposable disposable = userDao.addUsersList(usersList).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d(TAG, "addSomeUser: " + id + ". " + Thread.currentThread().getName()),
                        throwable -> Log.e(TAG, "addSomeUser: " + throwable));
    }

    public void deleteUser() {
        User user = new User();
        user.id = 2;
        Disposable disposable = userDao.deleteUser(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d(TAG, "deleteUser: " + id + ". " + Thread.currentThread().getName()),
                        throwable -> Log.e(TAG, "deleteUser: " + throwable));
    }

    public void updateUser() {
        User user = new User();
        user.id = 1;
        user.name = "Dmitri";
        user.surname = "Morgunov";
        user.age = 15;
        Disposable disposable = userDao.updateUser(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d(TAG, "updateUser: " + id + ". " + Thread.currentThread().getName()),
                        throwable -> Log.e(TAG, "updateUser: " +  throwable));
    }

    public void getAll() {
        Disposable disposable = userDao.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(users -> Log.d(TAG, "getAllData: " + users + " " + Thread.currentThread().getName()),
                        throwable -> Log.d(TAG, "getAllData: " + throwable));
    }

}
