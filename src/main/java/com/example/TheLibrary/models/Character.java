package com.example.TheLibrary.models;

import javax.persistence.*;


public class Character {

    //|||Properties|||



    private String name;

    private int age;



    //|||Constructors|||
    public Character() {}

    public Character(String name, int age){
        this.name = name;
        this.age = age;


    }

    //|||Methods|||

    //|||Accessors|||
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
