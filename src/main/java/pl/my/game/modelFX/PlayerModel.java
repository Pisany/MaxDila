package pl.my.game.modelFX;

import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;

import pl.my.game.database.models.Player;

import java.util.ArrayList;

public class PlayerModel {
    private Player player = new Player();

    public static PlayerProperty playerProperty;




    public Player create(int id, String name) {
        PlayerDao playerDao = new PlayerDao(DbManager.getConnectionSource());

        player.setId(id);
        player.setName(name);
        player.setLevel(1);
        player.setStrange(8);
        player.setAgility(8);
        player.setCharisma(8);
        player.setIntellect(8);


        playerDao.createOrUpdate(player);
        playerDao.refresh(player);
        DbManager.closeConnectionSource();
        playerProperty=new PlayerProperty(player);

        return player;
    }

    public ArrayList<String[]> initLoadGame(){
        PlayerDao playerDao=new PlayerDao(DbManager.getConnectionSource());
        ArrayList<String[]> playerList = (ArrayList<String[]>) playerDao.loadQueryRaw();
        DbManager.closeConnectionSource();
        return playerList;
    }

    public Player loadPlayerFromDB(int counter){
        PlayerDao playerDao=new PlayerDao(DbManager.getConnectionSource());
        player= new Player();

        ArrayList<String[]> playerList = (ArrayList<String[]>) playerDao.loadQueryRawByID(counter);
        player.setId(Integer.parseInt(playerList.get(0)[0]));
        player.setName(String.valueOf(playerList.get(0)[1]));
        player.setLevel(Integer.parseInt(playerList.get(0)[2]));
        player.setStrange(Integer.parseInt(playerList.get(0)[3]));
        player.setAgility(Integer.parseInt(playerList.get(0)[4]));
        player.setIntellect(Integer.parseInt(playerList.get(0)[5]));
        player.setCharisma(Integer.parseInt(playerList.get(0)[6]));
        player.setAvatar(String.valueOf(playerList.get(0)[7]));

        System.out.println(player);
        playerProperty=new PlayerProperty(player);

        DbManager.closeConnectionSource();
        return player;
    }

    public void savePlayerToDB(){
        PlayerDao playerDao = new PlayerDao(DbManager.getConnectionSource());

        player.setId(playerProperty.getPropertyId());
        player.setName(playerProperty.getPropertyName());
        player.setLevel(playerProperty.getProperyLevel());
        player.setStrange(playerProperty.getPropertyStrange());
        player.setAgility(playerProperty.getPropertyAgility());
        player.setCharisma(playerProperty.getPropertyCharisma());
        player.setIntellect(playerProperty.getPropertyIntellect());
        player.setAvatar(playerProperty.getPropertyAvatar());

        playerDao.createOrUpdate(player);
        DbManager.closeConnectionSource();


    }

    public Player getPlayer() {
        return player;
    }

    public void setAvatarPlayer(String avatar) {
        player.setAvatar(avatar);
    }


}





