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

    @ManyToOne(cascade = CascadeType.ALL)
    private Guild guild;

    //|||Constructors|||
    public Character() {}

    public Character(String name, int age, Guild guild){
        this.name = name;
        this.age = age;
        this.guild = guild;
    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Guild getGuild() {
        return guild;
    }
}
