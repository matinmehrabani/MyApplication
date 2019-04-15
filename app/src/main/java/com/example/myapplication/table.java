package com.example.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class table extends RealmObject {
@PrimaryKey
    long id;
    String name;
    String family;
public table(){

}
    public table( long id, String name, String family) {
        this.id = id;
        this.name = name;
        this.family = family;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
