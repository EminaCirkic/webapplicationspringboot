package com.example;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Emina on 3/28/2017.
 */
@Entity
@Table(name="Date")
public class Game {


    @Id
    @Column(name="GameID")
    private long id;

    private Date date;

    public long getId() {
        return id;
    }


    public Date getDate() {
        return date;
    }

}
