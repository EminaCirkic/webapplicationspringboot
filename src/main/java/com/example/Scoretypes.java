package com.example;

import javax.persistence.*;

/**
 * Created by Emina on 3/29/2017.
 */
@Entity
@Table
public class Scoretypes {

    @Id
    @Column(name = "Scoretypeid")
    private long id;

    @Column(name = "Name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }
}
