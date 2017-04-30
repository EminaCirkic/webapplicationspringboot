package com.example;

import org.hibernate.sql.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

/**
 * Created by Emina on 3/21/2017.
 */
public interface PlayersInGameRepository extends JpaRepository<Playersingame,Long>{



     List<Playersingame> findAll();

    //@Query("select u.game.id,u.game.date,u.score,u.players.name from Playersingame u where u.players.name=:name ")
    List<Playersingame> findByPlayersName(@Param("name") String name);

            List<Playersingame> findByGameId(@Param("id")  long id);



}
