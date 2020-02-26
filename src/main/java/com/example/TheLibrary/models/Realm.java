package com.example.TheLibrary.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Realm {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Faction> factions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Guild> guilds = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> characters = new ArrayList<>();
}
