package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
boolean log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
SharedPreferences sharedPreferences=getSharedPreferences("log", MODE_PRIVATE);
log=sharedPreferences.getBoolean("register",false);
if(log==true){
    startActivity(new Intent(splash.this,MainActivity.class));
}
if(log==false){
    startActivity(new Intent(splash.this,register.class));
}
finish();
            }
        },2000);

    }
}
