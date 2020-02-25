package com.example.TheLibrary.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guild {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String motto;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> members = new ArrayList<>();

    //|||Constructors|||
    public Guild(){}

    public Guild(String name, String motto){
        this.name = name;
        this.motto = motto;
    }
}
