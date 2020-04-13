package com.example.TheLibrary.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gossip {

    @Id
    @GeneratedValue
    private int id;
}
