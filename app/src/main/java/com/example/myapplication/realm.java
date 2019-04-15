package com.example.myapplication;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class realm extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration=new RealmConfiguration.Builder().name(Realm.DEFAULT_REALM_NAME)
        .schemaVersion(0) .build()   ;
        Realm.setDefaultConfiguration(configuration);
    }
}
