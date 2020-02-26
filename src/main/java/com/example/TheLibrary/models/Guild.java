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

    @ManyToOne(cascade = CascadeType.ALL)
    private Faction faction;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> members = new ArrayList<>();

    //|||Constructors|||
    public Guild(){}

    public Guild(String name, String motto, Faction faction){
        this.name = name;
        this.motto = motto;
        this.faction = faction;
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

    public Faction getFaction(){
        return this.faction;
    }
}
