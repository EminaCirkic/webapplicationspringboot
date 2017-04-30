package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Emina on 3/29/2017.
 */
public interface DiceRepository extends JpaRepository<Dice,Long> {

    List<Dice> findByRoundsGameId(@Param("id")  long id);

}
