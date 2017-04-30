package com.example;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Emina on 3/21/2017.
 */
@Entity
@Table(name="Players")
public class Players {


    @Id
    @Column(name="PlayerID")
    private long playerid;

    @Column(name = "Name")
    private String name;
    /*
       @OneToMany(mappedBy = "players")
       private Set<Playersingame> playersingames;


       @ManyToMany
       @JoinTable(name = "PlayersInGame",
       joinColumns = {@JoinColumn(name = "Player_ID")},inverseJoinColumns = {@JoinColumn(name = "Game_ID")})
       private Set<Game> games=new HashSet<Game>();

    public Set<Playersingame> getPlayersingames() {
        return playersingames;
    }

    public void setPlayersingames(Set<Playersingame> playersingames) {
        this.playersingames = playersingames;
    }
 */
    public void setPlayerid(long playerid) {
        this.playerid = playerid;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public long getPlayerid() {
        return playerid;
    }

    public String getName() { return name.trim();}

}
