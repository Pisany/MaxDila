package pl.my.game.modelFX;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import pl.my.game.database.models.Stats;

public class StatsProperty {

    private IntegerProperty propertyHunger= new SimpleIntegerProperty(this,"propertyHunger");
    private IntegerProperty propertyMaxHunger= new SimpleIntegerProperty(this,"propertyMaxHunger");
    private IntegerProperty propertyEnergy= new SimpleIntegerProperty(this,"propertyEnergy");
    private IntegerProperty propertyMaxEnergy= new SimpleIntegerProperty(this,"propertyMaxEnergy");
    private IntegerProperty propertyHealth= new SimpleIntegerProperty(this,"propertyHealth");
    private IntegerProperty propertyMaxHelth= new SimpleIntegerProperty(this,"propertyMaxHelth");
    private IntegerProperty propertyExperience= new SimpleIntegerProperty(this,"propertyExperience");
    private IntegerProperty propertyMaxExperience= new SimpleIntegerProperty(this,"propertyMaxExperience");

    public int getPropertyHunger() {
        return propertyHunger.get();
    }

    public IntegerProperty propertyHungerProperty() {
        return propertyHunger;
    }

    public void setPropertyHunger(int propertyHunger) {
        if(propertyHunger>propertyMaxHungerProperty().getValue())
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

    public int getPropertyEnergy() {
        return propertyEnergy.get();
    }

    public IntegerProperty propertyEnergyProperty() {
        return propertyEnergy;
    }

    public void setPropertyEnergy(int propertyEnergy) {
        if(propertyEnergy>propertyMaxEnergyProperty().getValue())
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

    public void setPropertyMaxEnergy(int propertyMaxEnergy) {
        this.propertyMaxEnergy.set(propertyMaxEnergy);
    }

    public int getPropertyHealth() {
        return propertyHealth.get();
    }

    public IntegerProperty propertyHealthProperty() {
        return propertyHealth;
    }

    public void setPropertyHealth(int propertyHealth) {
        if(propertyHealth>propertyMaxHelthProperty().getValue())
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

    public void setPropertyMaxHelth(int propertyMaxHelth) {
        this.propertyMaxHelth.set(propertyMaxHelth);
    }

    public int getPropertyExperience() {
        return propertyExperience.get();
    }

    public IntegerProperty propertyExperienceProperty() {
        return propertyExperience;
    }

    public void setPropertyExperience(int propertyExperience) {
        this.propertyExperience.set(propertyExperience);
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

    public StatsProperty(Stats stats){
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
