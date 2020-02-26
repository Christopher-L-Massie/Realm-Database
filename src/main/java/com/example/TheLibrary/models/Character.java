package com.example.TheLibrary.models;

import javax.persistence.*;

@Entity
public class Character {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    private String characterClass;

    @ManyToOne(cascade = CascadeType.ALL)
    private Guild guild;

    @ManyToOne(cascade = CascadeType.ALL)
    private Realm realm;

    //|||Constructors|||
    public Character() {}

    public Character(String name, int age, Guild guild,String characterClass, Realm realm){
        this.name = name;
        this.age = age;
        this.guild = guild;
        this.characterClass = characterClass;
        this.realm = realm;
    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Guild getGuild() {
        return this.guild;
    }

    public String getCharacterClass(){
        return this.characterClass;
    }

    public Realm getRealm() {return this.realm;}
}
