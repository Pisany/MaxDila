package pl.my.game.modelFX;

import pl.my.game.database.dao.StatsDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Player;
import pl.my.game.database.models.Stats;

import java.util.ArrayList;

public class StatsModel {


    Player player;


    private Stats stats = new Stats();

    public void create(int counter) {
        StatsDao statsDao = new StatsDao(DbManager.getConnectionSource());

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Player w playerStatsModel: "+ this.player);


        stats.setId(counter);
        stats.setHunger(100);
        stats.setMaxHunger(100);
        stats.setEnergy(80);
        stats.setMaxEnergy(computeMaxEnergy());
        stats.setHealth(100);
        stats.setMaxHealth(computeMaxHealth());
        stats.setExperience(0);
        stats.setMadExperience(100);

        statsDao.createOrUpdate(stats);
        statsDao.refresh(stats);
        DbManager.closeConnectionSource();
    }

    private int computeMaxEnergy(){
        double maxEne=(82+player.getLevel()*10)+((100+player.getLevel()*10)*player.getAgility()*0.01);
        return (int)maxEne;
    }
    private int computeMaxHealth(){
        double maxHp=(82+player.getLevel()*10)+((100+player.getLevel()*10)*player.getStrange()*0.01);
        return (int)maxHp;
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
        Stats stats= new Stats();

        ArrayList<String[]> statsList = (ArrayList<String[]>) statsDao.loadQueryRawByID(counter);
        stats.setHunger(Integer.parseInt(statsList.get(0)[1]));
        stats.setMaxHunger(Integer.parseInt(statsList.get(0)[2]));
        stats.setEnergy(Integer.parseInt(statsList.get(0)[3]));
        stats.setMaxEnergy(Integer.parseInt(statsList.get(0)[4]));
        stats.setHealth(Integer.parseInt(statsList.get(0)[5]));
        stats.setMaxHealth(Integer.parseInt(statsList.get(0)[6]));
        stats.setExperience(Integer.parseInt(statsList.get(0)[7]));
        stats.setMadExperience(Integer.parseInt(statsList.get(0)[8]));

        DbManager.closeConnectionSource();
        return stats;
    }
}
