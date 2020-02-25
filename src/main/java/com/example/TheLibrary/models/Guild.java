package com.example.TheLibrary.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guild {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String motto;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Character> members = new ArrayList<>();
}
