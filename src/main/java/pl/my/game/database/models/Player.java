package pl.my.game.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName ="Players")
public class Player implements BaseModel{

    public Player(){
    }


    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "Name", canBeNull = false)
    private String name;

    @DatabaseField(columnName = "Level", canBeNull = false)
    private int level;

    @DatabaseField(columnName = "Strange", canBeNull = false)
    private int strange;

    @DatabaseField(columnName = "Agility", canBeNull = false)
    private int agility;

    @DatabaseField(columnName = "Intellect", canBeNull = false)
    private int intellect;

    @DatabaseField(columnName = "Charisma", canBeNull = false)
    private int charisma;

    @DatabaseField(columnName = "BANK_ID", foreign = true)
    private Bank bank;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int mind) {
        this.intellect = mind;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "\nid=" + id +
                "\n name= " + name +
                "\n level='" + level + '\'' +
                "\n strange='" + strange + '\'' +
                "\n agility='" + agility + '\'' +
                "\n intellect='" + intellect + '\'' +
                "\n charisma='" + charisma + '\'' +

                '}';
    }
}
