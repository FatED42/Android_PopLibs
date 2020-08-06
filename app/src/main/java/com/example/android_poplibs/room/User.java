package com.example.android_poplibs.room;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_user")
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String surname;
    public int age;

    @NonNull
    @Override
    public String toString() {
        return "User {" +
                "id: " + id +
                ", name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", age: " + age + '\'' +
                "}";
    }
}
