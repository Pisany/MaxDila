package pl.my.game.modelFX;

import pl.my.game.database.dao.LevelDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Level;

import java.util.ArrayList;

public class LevelModel {

    public void initLevelTable() {
        LevelDao levelDao = new LevelDao(DbManager.getConnectionSource());
        Level level = new Level();

        for (int i = 1; i <= 50; i++) {
            level.setId(i);
            level.setLevel(i);
            level.setExperience(expGenerator(i));
            levelDao.createOrUpdate(level);
        }
        DbManager.closeConnectionSource();

    }

    private int expGenerator(int n) {
        if ((n == 0) || (n == 1))
            return 100;
        else
            return (2 * (expGenerator(n - 1)) - expGenerator(n - 2) + 100);
    }

    public int loadLevelFromDB(int counter){
            LevelDao levelDao=new LevelDao(DbManager.getConnectionSource());
            ArrayList<String[]> levelList = (ArrayList<String[]>) levelDao.loadQueryRaw(counter);
            int exp= Integer.parseInt(levelList.get(0)[2]);
            DbManager.closeConnectionSource();
            return exp;
    }
}


