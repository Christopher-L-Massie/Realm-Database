package com.example.TheLibrary.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Faction {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String name;

    //|||Constructors|||

    public Faction(){}

    public Faction(String name){
        this.name = name;
    }

    //|||Methods|||

    //|||Accessors|||

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
