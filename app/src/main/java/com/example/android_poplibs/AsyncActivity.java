package com.example.android_poplibs;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.TimeUtils;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class AsyncActivity extends AppCompatActivity {

    private static final String TAG = "AsyncActivity";
    private MyAsyncTask myAsyncTask;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
    }

    public void onClickBtn(View view) {
        myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
        Log.d(TAG, "onClickBtn: " + Thread.currentThread().getName());
    }

    private static class MyAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG,"onPreExecute: " + Thread.currentThread().getName());
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                for (int i = 0; i < 5; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Log.d(TAG, "doInBackground: " + Thread.currentThread().getName() + ": " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d(TAG, "onPostExecute: " + Thread.currentThread().getName());
        }
    }
}
