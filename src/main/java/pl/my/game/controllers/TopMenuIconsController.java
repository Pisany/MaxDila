package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

import static pl.my.game.modelFX.BankModel.*;
import static pl.my.game.modelFX.PlayerModel.*;
import static pl.my.game.modelFX.StatsModel.*;

public class TopMenuIconsController implements Initializable {
//TODO Fix progressbar, observable

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


    //TODO fix statsbar

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
        foo= statsProperty.propertyHungerProperty().doubleValue()/statsProperty.propertyMaxHungerProperty().doubleValue();

        hungerBarTopMenuIcons.setProgress(foo);
        presentHungerTopMenuItems.textProperty().bind(statsProperty.propertyHungerProperty().asString());

        //ENERGY
        foo=statsProperty.propertyEnergyProperty().doubleValue()/statsProperty.propertyMaxEnergyProperty().doubleValue();
        energyBarTopMenuIcons.setProgress(foo);
        eneTopMenuIcons.textProperty().bind(statsProperty.propertyEnergyProperty().asString());
        maxEneTopMenuIcons.textProperty().bind(statsProperty.propertyMaxEnergyProperty().asString());

        //HEALTH
        foo=statsProperty.propertyHealthProperty().doubleValue()*100/statsProperty.propertyMaxHelthProperty().doubleValue();
        healthBarTopMenuIcons.setProgress(foo);
        hpTopMenuIcons.textProperty().bind(statsProperty.propertyHealthProperty().asString());
        maxHpTopMenuIcons.textProperty().bind(statsProperty.propertyMaxHelthProperty().asString());

        //EXP
        foo=statsProperty.propertyExperienceProperty().doubleValue()*100/statsProperty.propertyMaxExperienceProperty().doubleValue();
        expBarTopMenuIcons.setProgress(foo);
        presentExpTopMenuIcons.textProperty().bind(statsProperty.propertyExperienceProperty().asString());
        expToNextLevelTopMenuIcons.textProperty().bind(statsProperty.propertyMaxExperienceProperty().asString());


    }


}
