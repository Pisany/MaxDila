package pl.my.game.database.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import pl.my.game.database.models.BaseModel;

import java.sql.SQLException;
import java.util.List;

public class CommonDao {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);

    protected final ConnectionSource connectionSource;

    public CommonDao(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    public <T extends BaseModel, I> void createOrUpdate(BaseModel baseModel) {
        Dao<T, I> dao = getDao((Class<T>) baseModel.getClass());
        try {
            dao.createOrUpdate((T) baseModel);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public <T extends BaseModel, I> void refresh(BaseModel baseModel) {
        Dao<T, I> dao = (Dao<T, I>) getDao((Class<T>) baseModel.getClass());
        try {
            dao.refresh((T) baseModel);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public <T extends BaseModel, I> void delete(BaseModel baseModel) {
        Dao<T, I> dao = (Dao<T, I>) getDao((Class<T>) baseModel.getClass());
        try {
            dao.delete((T) baseModel);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public <T extends BaseModel, I> void deleteById(Class<T> cls, Integer id) {
        try {
            Dao<T, I> dao = (Dao<T, I>) getDao(cls);
            dao.deleteById((I) id);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public <T extends BaseModel, I> List<T> queryForAll(Class<T> cls) {
        try {
            Dao<T, ?> dao = getDao(cls);
            return dao.queryForAll();
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
        return null;
    }

    // tworzy dao dla każdej klasy rozszeżającej BaseModel
    public <T extends BaseModel, I> Dao<T, I> getDao(Class<T> cls) {
        try {
            return DaoManager.createDao(connectionSource, cls);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
        return null;
    }


}