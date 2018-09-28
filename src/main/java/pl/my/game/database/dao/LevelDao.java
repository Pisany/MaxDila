package pl.my.game.database.dao;

import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;

public class LevelDao extends CommonDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);

    public LevelDao(ConnectionSource connectionSource) {
        super(connectionSource);
    }
}
