package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class navigation extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        drawerLayout=findViewById(R.id.drawerlayout);
        textView=findViewById(R.id.text);
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                       if(menuItem.getItemId()==R.id.item1){
                           Toast.makeText(navigation.this, "wellcom to android", Toast.LENGTH_SHORT).show();
                       }
                        // close drawer when item is tapped
                        drawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
        SharedPreferences.Editor editor = getPreferences(MODE_PRIVATE).edit();
        editor.putString("text", "matin");
        editor.putInt("selection-start", 12);
        editor.putInt("selection-end", 13);
        editor.apply();

      SharedPreferences sharedPreferences=getPreferences(MODE_PRIVATE);
     String name= sharedPreferences.getString("text","mmm");
textView.setText(name);
    }
}
