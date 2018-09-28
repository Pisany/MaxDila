package pl.my.game.database.models;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Level")
public class Level implements BaseModel {



    @DatabaseField(columnName = "Id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "Level",canBeNull = false)
    private int level;

    @DatabaseField(columnName = "Experience",canBeNull = false)
    private int experience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
