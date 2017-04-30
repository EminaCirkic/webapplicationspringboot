package com.example;

import org.springframework.data.jpa.repository.*;

import javax.persistence.*;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

/**
 * Created by Emina on 3/21/2017.
 */
@Entity
public class Playersingame {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ResultID")
    private long id;

    @ManyToOne
    @JoinColumn(name="Player_ID",referencedColumnName="PlayerID")
    private Players players;


    @ManyToOne
    @JoinColumn(name="Game_ID",referencedColumnName = "GameID")
    private Game game;



    private int score;


    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
