package pl.my.game.modelFX;

import pl.my.game.database.dao.StatsDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Player;
import pl.my.game.database.models.Stats;

import java.util.ArrayList;

public class StatsModel {


    private Player player;

    public static StatsProperty statsProperty;

    Stats stats = new Stats();


    public void create(int counter) {
        StatsDao statsDao = new StatsDao(DbManager.getConnectionSource());

        stats.setId(counter);
        stats.setHunger(50);
        stats.setMaxHunger(100);
        stats.setEnergy(50);
        stats.setMaxEnergy(100);
        stats.setHealth(50);
        stats.setMaxHealth(100);
        stats.setExperience(0);
        stats.setMaxExperience(100);

        statsProperty = new StatsProperty(stats);

        statsDao.createOrUpdate(stats);
        statsDao.refresh(stats);
        DbManager.closeConnectionSource();
    }



//    public int computeExp(){
//        levelModel = new LevelModel();
//        int exp=levelModel.loadLevelFromDB(player.getLevel());
//        return exp;
//    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Stats loadFromDB(int counter){
        StatsDao statsDao=new StatsDao(DbManager.getConnectionSource());

        ArrayList<String[]> statsList = (ArrayList<String[]>) statsDao.loadQueryRawByID(counter);
        stats.setId(Integer.parseInt(statsList.get(0)[0]));
        System.out.println("LOAD");
        System.out.println("stats.getID: "+ stats.getId());
        stats.setHunger(Integer.parseInt(statsList.get(0)[1]));
        stats.setMaxHunger(Integer.parseInt(statsList.get(0)[2]));
        stats.setEnergy(Integer.parseInt(statsList.get(0)[3]));
        stats.setMaxEnergy(Integer.parseInt(statsList.get(0)[4]));
        stats.setHealth(Integer.parseInt(statsList.get(0)[5]));
        stats.setMaxHealth(Integer.parseInt(statsList.get(0)[6]));
        stats.setExperience(Integer.parseInt(statsList.get(0)[7]));
        stats.setMaxExperience(Integer.parseInt(statsList.get(0)[8]));

        statsProperty = new StatsProperty(stats);


        DbManager.closeConnectionSource();
        return stats;
    }

    public void saveStatsToDB(){
        StatsDao statsDao = new StatsDao(DbManager.getConnectionSource());

        stats.setId(statsProperty.getPropertyId());
        System.out.println("SAVE");
        System.out.println("statsProperty.getPropertyId: "+statsProperty.getPropertyId());
        stats.setHunger((int) statsProperty.getPropertyHunger());
        stats.setMaxHunger(statsProperty.getPropertyMaxHunger());

        stats.setEnergy((int) statsProperty.getPropertyEnergy());
        stats.setMaxEnergy(statsProperty.getPropertyMaxEnergy());

        stats.setHealth((int) statsProperty.getPropertyHealth());
        stats.setMaxHealth(statsProperty.getPropertyMaxHelth());

        stats.setExperience((int) statsProperty.getPropertyExperience());
        stats.setMaxExperience(statsProperty.getPropertyMaxExperience());

        statsDao.createOrUpdate(stats);
        DbManager.closeConnectionSource();

    }
}
