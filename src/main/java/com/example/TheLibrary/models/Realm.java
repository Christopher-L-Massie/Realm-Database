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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Faction> factions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Guild> guilds = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> characters = new ArrayList<>();

    //|||Constructors|||
    public Realm(){}

    public Realm(String name,String timezone, String region){
        this.name = name;
        this.timeZone = this.timeZone.getTimeZone(timezone);
        this.region = region;
    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return name;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public List<Guild> getGuilds() {
        return guilds;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public TimeZone getTimeZone(){
        return this.timeZone;
    }
}
