package com.example.TheLibrary.models;

import com.example.TheLibrary.models.Accounts.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Gossip {

    //|||Properties|||

    @Id
    @GeneratedValue
    private int id;

    private String gossip;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    @ManyToOne(cascade = CascadeType.ALL)
    private User owner;

    //|||Constructors|||
    public Gossip(){}

    public Gossip(String gossip, User owner){
        this.gossip = gossip;
        this.owner = owner;
        this.timeCreated = new Timestamp(System.currentTimeMillis());
    }

    //|||Methods|||

    //|||Accessors|||

    public String getGossip(){
        return this.gossip;
    }

    public Timestamp getTimeCreated(){
        return this.timeCreated;
    }

    public User getOwner(){
        return this.owner;
    }
}
