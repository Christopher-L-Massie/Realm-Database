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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> characters = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Guild> guilds = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Realm realm;

    //|||Constructors|||
    
    public Faction(){}

    public Faction(String name, Realm realm){
        this.name = name;
        this.realm = realm;
    }

    //|||Methods|||

    //|||Accessors|||

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public List<Guild> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<Guild> guilds) {
        this.guilds = guilds;
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }
}
