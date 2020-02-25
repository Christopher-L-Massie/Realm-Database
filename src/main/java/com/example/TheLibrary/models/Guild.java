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

    private boolean isHorde;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> members = new ArrayList<>();

    //|||Constructors|||
    public Guild(){}

    public Guild(String name, String motto, boolean isHorde){
        this.name = name;
        this.motto = motto;
        this.isHorde = isHorde;
    }

    //|||Methods|||

    //|||Accessors|||

    public String getName() {
        return name;
    }

    public String getMotto() {
        return motto;
    }

    public List<Character> getMembers() {
        return members;
    }
    
    public boolean getIsHorde(){
        return this.isHorde;
    }
}
