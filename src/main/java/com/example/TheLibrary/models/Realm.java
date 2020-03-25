package com.example.TheLibrary.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Entity
public class Realm {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private TimeZone timeZone;

    private String region;

    private String type;









    //|||Constructors|||
    public Realm(){}

    public Realm(String name,String timezone, String region, String type){
        this.name = name;
        this.timeZone = this.timeZone.getTimeZone(timezone);
        this.region = region;
        this.type = type;
    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return name;
    }



    public TimeZone getTimeZone(){
        return this.timeZone;
    }
}
