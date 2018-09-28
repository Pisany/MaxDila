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

    private static ArrayList currentPlayer = new ArrayList();



    public PlayerDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRaw() {//int id
            GenericRawResults<String[]> where;
        try {
            where= getDao(Player.class).queryRaw("SELECT * FROM Players "); //WHERE id ='"+id+"'
            List<String[]> resultsWhere = where.getResults();
            resultsWhere.forEach(e->{
                System.out.println("<Dao>"); //: +"+id+"
                for(String s:e){
                    System.out.println(s);
                    currentPlayer.add(s);
                }
                System.out.println("<Doa/>");

            });
            return resultsWhere;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<String[]> loadQueryRawByID(int count) {
            GenericRawResults<String[]> where;
        try {
            where= getDao(Player.class).queryRaw("SELECT * FROM Players WHERE id ='"+count+"'");
            List<String[]> resultsWhere = where.getResults();
            resultsWhere.forEach(e->{
                System.out.println("<Dao> : "+count+"");
                for(String s:e){
                    System.out.println(s);
                }
                System.out.println("<Doa/>");

            });
            return resultsWhere;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }





}
