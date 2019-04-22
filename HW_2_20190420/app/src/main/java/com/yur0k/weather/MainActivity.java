package com.yur0k.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Logs("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.rain);
    }

    @Override
    protected void onStart() {
        Logs("onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Logs("onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Logs("onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Logs("onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Logs("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Logs("onDestroy");
        super.onDestroy();
    }

    private void Logs (String msg){
        Log.d("Method", msg);
    }
}
