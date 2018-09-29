package pl.my.game.database.dao;

import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao extends CommonDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);

//TODO add LOGER


    public PlayerDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRaw() {//int id
            GenericRawResults<String[]> where;
        try {
            where= getDao(Player.class).queryRaw("SELECT * FROM Players "); //WHERE id ='"+id+"'
            return where.getResults();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<String[]> loadQueryRawByID(int count) {
            GenericRawResults<String[]> where;
        try {
            where= getDao(Player.class).queryRaw("SELECT * FROM Players WHERE id ='"+count+"'");
            return where.getResults();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }





}
