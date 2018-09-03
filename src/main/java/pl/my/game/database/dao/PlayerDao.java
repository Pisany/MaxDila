package pl.my.game.database.dao;

import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Player;

import java.sql.SQLException;
import java.util.List;

public class PlayerDao extends CommonDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);

    public PlayerDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRaw() {
            GenericRawResults<String[]> where;
        try {
            where= getDao(Player.class).queryRaw("SELECT * FROM Players WHERE id ='1' ");
            List<String[]> resultsWhere = where.getResults();
            resultsWhere.forEach(e->{
                for(String s:e){
                    System.out.println(s);
                }
            });
            return resultsWhere;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
