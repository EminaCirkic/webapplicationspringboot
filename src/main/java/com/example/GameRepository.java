package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Emina on 4/8/2017.
 */
public interface GameRepository extends JpaRepository<Game,Long> {

    List<Game> findAll();
}
