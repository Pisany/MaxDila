package pl.my.game.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName ="PlayerStats")
public
class PlayerStats implements BaseModel {

    private PlayerStats playerStats;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "Hunger", canBeNull = false)
    private int hunger;

    @DatabaseField(columnName = "Energy", canBeNull = false)
    private int energy;

    @DatabaseField(columnName = "Health", canBeNull = false)
    private int health;

    @DatabaseField(columnName = "Exp", canBeNull=false)
    private int experience;

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
