package pl.my.game.database.dao;

import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;

import java.sql.SQLException;
import java.util.List;

public class BankDao extends CommonDao {
    public BankDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }

    public List<String[]> loadQueryRaw() {
        GenericRawResults<String[]> where;
        try {
            where= getDao(Bank.class).queryRaw("SELECT * FROM Bank WHERE id ='1' ");
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
