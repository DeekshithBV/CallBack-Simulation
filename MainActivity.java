package com.example.callback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements MyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.doAsyncTask(this);
        Log.d("MainActivity","oncreate");
    }

    @Override
    public void onSuccess(String res) {
        Log.d("MainActivity",res);
    }

    @Override
    public void onFailure(String err) {
        Log.d("MainActivity",err);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","restart");
    }

    @Override
    public void recreate() {
        super.recreate();
        Log.d("MainActivity","recreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","destroy");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("MainActivity","finish");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","pause");
    }
}