package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText names;
EditText familys;
Button save;
method methods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names=findViewById(R.id.name);
        familys=findViewById(R.id.family);
        save=findViewById(R.id.save);
methods=new method();
        Toast.makeText(MainActivity.this, "خوش امدید", Toast.LENGTH_SHORT).show();
       save.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new Intent(MainActivity.this,navigation.class);
               startActivity(intent);
           }
       });

    }

}
