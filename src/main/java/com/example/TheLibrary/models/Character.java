package com.example.TheLibrary.models;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    private Guild guild;

}
