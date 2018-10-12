package pl.my.game.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName ="Stats")
public
class Stats implements BaseModel {

    private Stats stats;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "Hunger", canBeNull = false)
    private int hunger;

    @DatabaseField(columnName = "MAXHunger", canBeNull = false)
    private int maxHunger;

    @DatabaseField(columnName = "Energy", canBeNull = false)
    private int energy;

    @DatabaseField(columnName = "MAXEnergy", canBeNull = false)
    private int maxEnergy;

    @DatabaseField(columnName = "Health", canBeNull = false)
    private int health;

    @DatabaseField(columnName = "MAXHealth", canBeNull = false)
    private int maxHealth;

    @DatabaseField(columnName = "Exp", canBeNull=false)
    private int experience;

    @DatabaseField(columnName = "MAXExp", canBeNull=false)
    private int maxExperience;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
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

    public int getMaxHunger() {
        return maxHunger;
    }

    public void setMaxHunger(int maxHunger) {
        this.maxHunger = maxHunger;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(int madExperience) {
        this.maxExperience = madExperience;
    }
}
