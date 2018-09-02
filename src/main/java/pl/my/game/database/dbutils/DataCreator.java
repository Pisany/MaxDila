package pl.my.game.database.dbutils;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Player;

import java.sql.SQLException;

public class DataCreator {

    private static ConnectionSource connectionSource;

    Dao<Player, Integer> dao = DaoManager.createDao(connectionSource, Player.class);

    public DataCreator() throws SQLException {
    }

    public void createPlayer(){
        Player player1 = new Player();

    }




}
