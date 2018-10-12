package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import pl.my.game.modelFX.LevelModel;


import java.net.URL;
import java.util.ResourceBundle;

import static pl.my.game.modelFX.BankModel.*;
import static pl.my.game.modelFX.PlayerModel.*;
import static pl.my.game.modelFX.StatsModel.*;

public class TopMenuIconsController implements Initializable {

    @FXML public ImageView avatarTopMenuIcons;
    @FXML public Label levelTopMenuIcons;
    @FXML public Label cashTopMenuIcons;
    @FXML public Label cashInBankTopMenuIcons;
    @FXML public Label nameTopMenuIcons;
    @FXML public AnchorPane topMenuIcon;
    @FXML public ProgressBar expBarTopMenuIcons;
    @FXML public ProgressBar energyBarTopMenuIcons;
    @FXML public ProgressBar healthBarTopMenuIcons;
    @FXML public Label presentExpTopMenuIcons;
    @FXML public Label expToNextLevelTopMenuIcons;
    @FXML public Label hpTopMenuIcons;
    @FXML public Label maxHpTopMenuIcons;
    @FXML public Label eneTopMenuIcons;
    @FXML public Label maxEneTopMenuIcons;
    @FXML public ProgressBar hungerBarTopMenuIcons;
    @FXML public Label presentHungerTopMenuItems;
    @FXML public Button levelUp;
    @FXML public ImageView levelButtonTopMenuIcons;


    //TODO add % to hunger string format

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        double foo=0;

        //NAME
        nameTopMenuIcons.textProperty().bind(playerProperty.propertyNameProperty());

        //LEVEL
        levelTopMenuIcons.textProperty().bind(playerProperty.properyLevelProperty().asString());

        //AVATAR
        Image image = new Image(playerProperty.getPropertyAvatar());
        avatarTopMenuIcons.setImage(image);

        //CASH
        cashTopMenuIcons.textProperty().bind(bankProperty.propertyCashProperty().asString());
        cashInBankTopMenuIcons.textProperty().bind(bankProperty.propertyCashInBankProperty().asString());

        //HUNGER
        hungerBarTopMenuIcons.progressProperty().bind(statsProperty.propertyHungerProperty().divide(statsProperty.propertyMaxHungerProperty()));
        presentHungerTopMenuItems.textProperty().bind(statsProperty.propertyHungerProperty().asString("%.0f"));

        //ENERGY
        energyBarTopMenuIcons.progressProperty().bind(statsProperty.propertyEnergyProperty().divide(statsProperty.propertyMaxEnergyProperty()));
        eneTopMenuIcons.textProperty().bind(statsProperty.propertyEnergyProperty().asString("%.0f"));
        maxEneTopMenuIcons.textProperty().bind(statsProperty.propertyMaxEnergyProperty().asString());

        //HEALTH
        healthBarTopMenuIcons.progressProperty().bind(statsProperty.propertyHealthProperty().divide(statsProperty.propertyMaxHelthProperty()));
        hpTopMenuIcons.textProperty().bind(statsProperty.propertyHealthProperty().asString("%.0f"));
        maxHpTopMenuIcons.textProperty().bind(statsProperty.propertyMaxHelthProperty().asString());

        //EXP
        expBarTopMenuIcons.progressProperty().bind(statsProperty.propertyExperienceProperty().divide(statsProperty.propertyMaxExperienceProperty()));
        presentExpTopMenuIcons.textProperty().bind(statsProperty.propertyExperienceProperty().asString("%.0f"));
        expToNextLevelTopMenuIcons.textProperty().bind(statsProperty.propertyMaxExperienceProperty().asString());

        //LEVEL UP BUTTON
        levelUp.visibleProperty().bind(playerProperty.propertyLevelUpProperty());

    }


    public void levelUpAction() {
        playerProperty.setPropertyLevelUp(false);
        statsProperty.setPropertyExperience(statsProperty.getPropertyExperience()-statsProperty.getPropertyMaxExperience());
        playerProperty.setProperyLevel(playerProperty.getProperyLevel()+1);
        LevelModel levelModel = new LevelModel();
        statsProperty.setPropertyMaxExperience(levelModel.loadLevelFromDB(playerProperty.getProperyLevel()));
    }
}
