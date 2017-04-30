package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Emina on 3/21/2017.
 */
public interface PlayersRepository extends JpaRepository<Players,Long> {

    //List<Players> findByplayeridEquals(long id);
    List<Players> findByname(String name);

    List<Players> findByplayeridEquals(long id);

    List<Players> findAll();




}
