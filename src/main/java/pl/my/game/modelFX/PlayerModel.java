package pl.my.game.modelFX;

import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;

import pl.my.game.database.models.Player;

import java.util.ArrayList;

public class PlayerModel {
    private Player player = new Player();




    public void create(int id, String name) {
        PlayerDao playerDao = new PlayerDao(DbManager.getConnectionSource());


        player.setId(id);
        player.setName(name);
        player.setLevel(1);
        player.setStrange(8);
        player.setAgility(8);
        player.setCharisma(8);
        player.setIntellect(8);
        player.setExperience(0);
        playerDao.createOrUpdate(player);
        playerDao.refresh(player);
        DbManager.closeConnectionSource();
    }

    public ArrayList<String[]> initLoadGame(){
        PlayerDao playerDao=new PlayerDao(DbManager.getConnectionSource());
        ArrayList<String[]> playerList = (ArrayList<String[]>) playerDao.loadQueryRaw();
        DbManager.closeConnectionSource();
        return playerList;
    }

    public Player loadPlayerFromDB(int counter){
        PlayerDao playerDao=new PlayerDao(DbManager.getConnectionSource());
        Player player= new Player();

        ArrayList<String[]> playerList = (ArrayList<String[]>) playerDao.loadQueryRawByID(counter);
        player.setName(String.valueOf(playerList.get(0)[1]));
        player.setLevel(Integer.parseInt(playerList.get(0)[2]));
        player.setStrange(Integer.parseInt(playerList.get(0)[3]));
        player.setAgility(Integer.parseInt(playerList.get(0)[4]));
        player.setIntellect(Integer.parseInt(playerList.get(0)[5]));
        player.setCharisma(Integer.parseInt(playerList.get(0)[6]));
        player.setAvatar(String.valueOf(playerList.get(0)[7]));



        DbManager.closeConnectionSource();
        return player;
    }

    public void setAvatarPlayer(String avatar) {
        player.setAvatar(avatar);
    }


}





