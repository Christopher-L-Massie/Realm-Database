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

    //|||Constructors|||
    public Character() {}

    public Character(String name, int age,String characterClass){
        this.name = name;
        this.age = age;
        this.characterClass = characterClass;

    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCharacterClass(){
        return this.characterClass;
    }

}
