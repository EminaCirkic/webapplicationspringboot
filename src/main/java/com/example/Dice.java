package com.example;

import javax.persistence.*;

/**
 * Created by Emina on 3/29/2017.
 */
@Entity
@Table(name="Dice")
public class Dice {


    @Id
    @Column(name = "DiceID")
    private long id;

    @Column(name = "Nr")
    private int nr;

    @ManyToOne
    @JoinColumn(name="Round_ID",referencedColumnName="RoundID")
    private Round rounds;


    public long getId() {
        return id;
    }

    public int getNr() {
        return nr;
    }

    public Round getRounds() {
        return rounds;
    }
}
