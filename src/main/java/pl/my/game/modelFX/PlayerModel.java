package pl.my.game.modelFX;

import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;

import pl.my.game.database.models.Player;

public class PlayerModel {

    public void createPlayer(int id, String name) {
        PlayerDao playerDao = new PlayerDao(DbManager.getConnectionSource());
        Player player = new Player();
        player.setId(id);
        player.setName(name);
        player.setLevel(1);
        player.setStrange(8);
        player.setAgility(8);
        player.setCharisma(8);
        player.setIntellect(8);
        playerDao.createOrUpdate(player);
        DbManager.closeConnectionSource();
        System.out.println(player);
    }
}





