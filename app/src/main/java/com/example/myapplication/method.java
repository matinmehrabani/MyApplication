package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

import static android.content.ContentValues.TAG;

public class method {
    Realm realm;

    public method() {
        realm = Realm.getDefaultInstance();
    }

    public void sevedata(final Context context, final String name, final String family) {

        realm.executeTransactionAsync(new Realm.Transaction() {
                                          @Override
                                          public void execute(Realm realm) {
                                              long mid;
                                              Number number = realm.where(table.class).max("id");
                                              if (number == null) {

                                                  mid = 1;
                                              } else {
                                                  mid = number.longValue() + 1;
                                              }

                                              table tables = realm.createObject(table.class, mid);
                                              tables.setName(name);
                                              tables.setFamily(family);

                                          }
                                      },
                new Realm.Transaction.OnSuccess() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(context, "true", Toast.LENGTH_SHORT).show();
                    }
                },
                new Realm.Transaction.OnError() {
                    @Override
                    public void onError(Throwable error) {
                        Toast.makeText(context, "false", Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }

    public void showdata() {
        RealmResults<table> results = realm.where(table.class).findAll();
        for (table us : results) {

            Log.i("showdata", results.toString());
        }
    }
}