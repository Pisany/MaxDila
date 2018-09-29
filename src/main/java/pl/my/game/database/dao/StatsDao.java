package pl.my.game.database.dao;

import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Stats;

import java.sql.SQLException;
import java.util.List;

public class StatsDao extends CommonDao {

    public StatsDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRawByID(int count) {
        GenericRawResults<String[]> where;
        try {
            where= getDao(Stats.class).queryRaw("SELECT * FROM Stats WHERE id ='"+count+"'");
            return where.getResults();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
