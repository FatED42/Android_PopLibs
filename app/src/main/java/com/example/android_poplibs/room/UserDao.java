package com.example.android_poplibs.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface UserDao {

    @Query("SELECT * FROM table_user")
    Single<List<User>> getAll();

    @Insert
    Single<Long> addUser(User user);

    @Insert
    Single<List<Long>> addUsersList(List<User> users);

    @Delete
    Single<Integer> deleteUser(User user);

    @Update
    Single<Integer> updateUser(User user);

}
