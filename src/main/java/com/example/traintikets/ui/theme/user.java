package com.example.traintikets.ui.theme;


import java.io.Serializable;

public class user implements Serializable {
    private  String name;
    private String number ;
    private String NameIn;


    public user (String name,String number, String NameIn){
        this.name=name;
        this.number=number;
        this.NameIn=NameIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameIn() {
        return NameIn;
    }

    public void setNameIn(String nameIn) {
        NameIn = nameIn;
    }
}
