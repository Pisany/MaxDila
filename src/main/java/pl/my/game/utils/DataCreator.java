package pl.my.game.utils;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;

import java.sql.SQLException;


public class DataCreator {





    public static void fillDataBase(String name){
        createPlayer(name);
        createAccount();

    }



public static Player createPlayer(String name){
    Player player= new Player();
    player.setName(name);
    player.setLevel(1);
    player.setStrange(8);
    player.setAgility(8);
    player.setCharisma(8);
    player.setIntellect(8);
    System.out.println(player);
    return player;
}

public static Bank createAccount(){
    Bank bank= new Bank();
    bank.setCash(100);

    return bank;
}



}
