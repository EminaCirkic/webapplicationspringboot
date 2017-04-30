package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * Created by Emina on 3/20/2017.
 */

@RestController
@RequestMapping(value="/all")
public class DemoController {

    private PlayersRepository playersRepository;
    private PlayersInGameRepository playersingameRepository;
    private RoundRepository roundRepository;
    private DiceRepository diceRepository;
    private GameRepository gameRepository;

    @Autowired
    public DemoController(GameRepository gameRepository,DiceRepository diceRepository,RoundRepository roundRepository,PlayersRepository playersRepository,PlayersInGameRepository playersingameRepository){

        this.playersRepository=playersRepository;
        this.playersingameRepository=playersingameRepository;
        this.roundRepository=roundRepository;
        this.diceRepository=diceRepository;
        this.gameRepository=gameRepository;
    }


    //PLAYERS
    @RequestMapping(value="/players",method = RequestMethod.GET)
    public List<Players> getPlayers(){
        return playersRepository.findAll();
    }

    @RequestMapping(value="/playersid/{id}",method = RequestMethod.GET)
    public List<Players> playersId(@PathVariable long id){
        return playersRepository.findByplayeridEquals(id);
    }

    @RequestMapping(value="/playersname/{name}",method = RequestMethod.GET)
    public List<Players> playersName(@PathVariable String name){
        return playersRepository.findByname(name);
    }






    //PLAYERSINGAME
    @RequestMapping(value="/allplayergames",method = RequestMethod.GET)
    public List<Playersingame> getplayersingame(){
        return playersingameRepository.findAll();
    }


    @RequestMapping(value="/allplayergames/{name}",method = RequestMethod.GET)
    public List<Playersingame> playersingameName(@PathVariable String name){
        return playersingameRepository.findByPlayersName(name);
    }

    @RequestMapping(value="/loser/{id}",method = RequestMethod.GET)
    public List<Playersingame> getLoser(@PathVariable long id){
        return playersingameRepository.findByGameId(id);
    }


    //ROUNDS
    @RequestMapping(value = "/rounds/{id}",method = RequestMethod.GET)
    public List<Round> getRounds(@PathVariable long id){
        return roundRepository.findByGameId(id);
    }

    //Dice
    @RequestMapping(value = "/dice/{id}",method = RequestMethod.GET)
    public List<Dice> getDicesPerRound(@PathVariable long id){
        return diceRepository.findByRoundsGameId(id);
    }

    //GAMES
    @RequestMapping(value = "/game",method = RequestMethod.GET)
        public List<Game> getGame(){
        return gameRepository.findAll();
    }
}
