package pl.my.game.modelFX;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import pl.my.game.database.models.Player;
import pl.my.game.database.models.Stats;


public class StatsProperty {

    private DoubleProperty propertyHunger = new SimpleDoubleProperty(this, "propertyHunger");
    private IntegerProperty propertyMaxHunger = new SimpleIntegerProperty(this, "propertyMaxHunger");
    private DoubleProperty propertyEnergy = new SimpleDoubleProperty(this, "propertyEnergy");
    private IntegerProperty propertyMaxEnergy = new SimpleIntegerProperty(this, "propertyMaxEnergy");
    private DoubleProperty propertyHealth = new SimpleDoubleProperty(this, "propertyHealth");
    private IntegerProperty propertyMaxHelth = new SimpleIntegerProperty(this, "propertyMaxHelth");
    private DoubleProperty propertyExperience = new SimpleDoubleProperty(this, "propertyExperience");
    private IntegerProperty propertyMaxExperience = new SimpleIntegerProperty(this, "propertyMaxExperience");

    public double getPropertyHunger() {
        return propertyHunger.get();
    }

    public DoubleProperty propertyHungerProperty() {
        return propertyHunger;
    }

    public void setPropertyHunger(double propertyHunger) {
        if (propertyHunger > propertyMaxHungerProperty().getValue())
            this.propertyHunger.set(propertyMaxHungerProperty().getValue());
        else
            this.propertyHunger.set(propertyHunger);

    }

    public int getPropertyMaxHunger() {
        return propertyMaxHunger.get();
    }

    public IntegerProperty propertyMaxHungerProperty() {
        return propertyMaxHunger;
    }

    public void setPropertyMaxHunger(int propertyMaxHunger) {
        this.propertyMaxHunger.set(propertyMaxHunger);
    }

    public double getPropertyEnergy() {
        return propertyEnergy.get();
    }

    public DoubleProperty propertyEnergyProperty() {
        return propertyEnergy;
    }

    public void setPropertyEnergy(double propertyEnergy) {
        if (propertyEnergy > propertyMaxEnergyProperty().getValue())
            this.propertyEnergy.set(propertyMaxEnergyProperty().getValue());
        else
            this.propertyEnergy.set(propertyEnergy);
    }

    public int getPropertyMaxEnergy() {
        return propertyMaxEnergy.get();
    }

    public IntegerProperty propertyMaxEnergyProperty() {
        return propertyMaxEnergy;
    }

    public void setPropertyMaxEnergy() {
        double foo=(82+PlayerModel.playerProperty.getProperyLevel()*10)+((100+PlayerModel.playerProperty.getProperyLevel()*10)*(PlayerModel.playerProperty.getPropertyAgility()*0.01));
        this.propertyMaxEnergy.set((int) foo);
    }

    public double getPropertyHealth() {
        return propertyHealth.get();
    }

    public DoubleProperty propertyHealthProperty() {
        return propertyHealth;
    }

    public void setPropertyHealth(double propertyHealth) {
        if (propertyHealth > propertyMaxHelthProperty().getValue())
            this.propertyHealth.set(propertyMaxEnergyProperty().getValue());
        else
            this.propertyHealth.set(propertyHealth);
    }

    public int getPropertyMaxHelth() {
        return propertyMaxHelth.get();
    }

    public IntegerProperty propertyMaxHelthProperty() {
        return propertyMaxHelth;
    }

    void setPropertyMaxHelth() {
        double foo=(82+PlayerModel.playerProperty.getProperyLevel()*10)+((100+PlayerModel.playerProperty.getProperyLevel()*10)*(PlayerModel.playerProperty.getPropertyStrange()*0.01));
        this.propertyMaxHelth.set((int) foo);
    }

    public double getPropertyExperience() {
        return propertyExperience.get();
    }

    public DoubleProperty propertyExperienceProperty() {
        return propertyExperience;
    }

    public void setPropertyExperience(double propertyExperience) {
        this.propertyExperience.set(propertyExperience);
        if(StatsModel.statsProperty.getPropertyExperience()>= StatsModel.statsProperty.getPropertyMaxExperience())
            PlayerModel.playerProperty.setPropertyLevelUp(true);
        else
            PlayerModel.playerProperty.setPropertyLevelUp(false);
    }

    public int getPropertyMaxExperience() {
        return propertyMaxExperience.get();
    }

    public IntegerProperty propertyMaxExperienceProperty() {
        return propertyMaxExperience;
    }

    public void setPropertyMaxExperience(int propertyMaxExperience) {
        this.propertyMaxExperience.set(propertyMaxExperience);
    }


    StatsProperty(Stats stats) {
        propertyHunger.set(stats.getHunger());
        propertyMaxHunger.set(stats.getMaxHunger());
        propertyEnergy.set(stats.getEnergy());
        propertyMaxEnergy.set(stats.getMaxEnergy());
        propertyHealth.set(stats.getHealth());
        propertyMaxHelth.set(stats.getMaxHealth());
        propertyExperience.set(stats.getExperience());
        propertyMaxExperience.set(stats.getMaxExperience());


    }
}
