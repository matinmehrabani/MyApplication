package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
EditText name,family;
Button login;
boolean logins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.name);
        family=findViewById(R.id.family);
        login=findViewById(R.id.login);
final SharedPreferences.Editor editor=  getSharedPreferences("log", MODE_PRIVATE).edit();
editor.putBoolean("register",false);
editor.commit();

login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

if (!name.getText().toString().isEmpty()){
    //SharedPreferences sharedPreferences=getSharedPreferences("log",MODE_PRIVATE);
   // logins= !sharedPreferences.getBoolean("register",false);
    editor.clear();
    editor.putBoolean("register",true);
    editor.commit();
    Intent intent = new Intent(register.this,MainActivity.class);
    startActivity(intent);
}











    }
});
}
    }