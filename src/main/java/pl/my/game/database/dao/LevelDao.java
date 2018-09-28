package pl.my.game.database.dao;

import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Level;
import pl.my.game.database.models.Player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LevelDao extends CommonDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);

    public LevelDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRaw(int count) {//int id
        GenericRawResults<String[]> where;

        try {
            where= getDao(Level.class).queryRaw("SELECT * FROM Level WHERE id ='"+count+"'"); //

            return where.getResults();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
