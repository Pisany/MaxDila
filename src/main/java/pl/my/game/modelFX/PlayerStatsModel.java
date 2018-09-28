package pl.my.game.modelFX;

import pl.my.game.body.ViewBody;
import pl.my.game.database.dao.PlayerStatsDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.PlayerStats;

public class PlayerStatsModel {

    private PlayerStats playerStats= new PlayerStats();

    public void create(int counter) {
        PlayerStatsDao playerStatsDao = new PlayerStatsDao(DbManager.getConnectionSource());
        ViewBody viewBody= new ViewBody();

        playerStats.setId(counter);
        playerStats.setEnergy(viewBody.computeMaxEnergy());
        playerStats.setHealth(viewBody.computeMaxHealth());
        playerStats.setExperience(0);

        playerStatsDao.createOrUpdate(playerStats);
        playerStatsDao.refresh(playerStats);
        DbManager.closeConnectionSource();
    }
}
