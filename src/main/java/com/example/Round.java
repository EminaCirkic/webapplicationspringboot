package com.example;

import javax.persistence.*;

/**
 * Created by Emina on 3/29/2017.
 */
@Entity
public class Round {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="RoundID")
    private long id;

    private int roundnr;

    public int getRoundnr() {
        return roundnr;
    }

    public void setRoundnr(int roundnr) {
        this.roundnr = roundnr;
    }

    @ManyToOne
    @JoinColumn(name="Player_ID",referencedColumnName="PlayerID")
    private Players players;


    @ManyToOne
    @JoinColumn(name="Game_ID",referencedColumnName = "GameID")
    private Game game;

    @ManyToOne
    @JoinColumn(name="Scoretype_ID",referencedColumnName = "Scoretypeid")
    private Scoretypes scoretypes;

    public Scoretypes getScoretypes() {
        return scoretypes;
    }

    public void setScoretypes(Scoretypes scoretypes) {
        this.scoretypes = scoretypes;
    }

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
