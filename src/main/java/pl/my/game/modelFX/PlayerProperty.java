package pl.my.game.modelFX;

import javafx.beans.property.*;
import pl.my.game.database.models.Player;

public class PlayerProperty {

    private StringProperty propertyName = new SimpleStringProperty(this, "name");
    private IntegerProperty properyLevel = new SimpleIntegerProperty(this,"level");
    private IntegerProperty  propertyStrange= new SimpleIntegerProperty(this, "strange");
    private IntegerProperty  propertyAgility= new SimpleIntegerProperty(this, "agility");
    private IntegerProperty  propertyIntellect= new SimpleIntegerProperty(this, "intellect");
    private IntegerProperty  propertyCharisma= new SimpleIntegerProperty(this, "charisma");
    private StringProperty  propertyAvatar= new SimpleStringProperty(this, "avatar");
    private BooleanProperty propertyLevelUp = new SimpleBooleanProperty(this, "levelUP");

    PlayerProperty(Player player){
        propertyName.set(player.getName());
        properyLevel.set(player.getLevel());
        propertyStrange.set(player.getStrange());
        propertyAgility.set(player.getAgility());
        propertyIntellect.set(player.getIntellect());
        propertyCharisma.set(player.getCharisma());
        propertyAvatar.set(player.getAvatar());
        propertyLevelUp.set(false);
    }

    public String getPropertyName() {
        return propertyName.get();
    }

    public StringProperty propertyNameProperty() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName.set(propertyName);
    }

    public int getProperyLevel() {
        return properyLevel.get();
    }

    public IntegerProperty properyLevelProperty() {
        return properyLevel;
    }

    public void setProperyLevel(int properyLevel) {
        this.properyLevel.set(properyLevel);
        StatsModel.statsProperty.setPropertyMaxHelth();
        StatsModel.statsProperty.setPropertyMaxEnergy();
    }

    public int getPropertyStrange() {
        return propertyStrange.get();
    }

    public IntegerProperty propertyStrangeProperty() {
        return propertyStrange;
    }

    public void setPropertyStrange(int propertyStrange) {
        this.propertyStrange.set(propertyStrange);
        StatsModel.statsProperty.setPropertyMaxHelth();
    }

    public int getPropertyAgility() {
        return propertyAgility.get();
    }

    public IntegerProperty propertyAgilityProperty() {
        return propertyAgility;
    }

    public void setPropertyAgility(int propertyAgility) {
        this.propertyAgility.set(propertyAgility);
        StatsModel.statsProperty.setPropertyMaxEnergy();

    }

    public int getPropertyIntellect() {
        return propertyIntellect.get();
    }

    public IntegerProperty propertyIntellectProperty() {
        return propertyIntellect;
    }

    public void setPropertyIntellect(int propertyIntellect) {
        this.propertyIntellect.set(propertyIntellect);
    }

    public int getPropertyCharisma() {
        return propertyCharisma.get();
    }

    public IntegerProperty propertyCharismaProperty() {
        return propertyCharisma;
    }

    public void setPropertyCharisma(int propertyCharisma) {
        this.propertyCharisma.set(propertyCharisma);
    }

    public String getPropertyAvatar() {
        return propertyAvatar.get();
    }

    public StringProperty propertyAvatarProperty() {
        return propertyAvatar;
    }

    public void setPropertyAvatar(String propertyAvatar) {
        this.propertyAvatar.set(propertyAvatar);
    }

    public boolean isPropertyLevelUp() {
        return propertyLevelUp.get();
    }

    public BooleanProperty propertyLevelUpProperty() {

        return propertyLevelUp;

    }

    public void setPropertyLevelUp(boolean propertyLevelUp) {
        this.propertyLevelUp.set(propertyLevelUp);
    }
}
