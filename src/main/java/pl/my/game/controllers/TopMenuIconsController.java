package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import pl.my.game.controllers.newGame.NamePaneController;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;
import pl.my.game.database.models.Stats;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;
import pl.my.game.modelFX.StatsModel;

import java.net.URL;
import java.util.ResourceBundle;

public class TopMenuIconsController implements Initializable {
//TODO Fix progressbar

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

    public TopMenuIconsController() {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PlayerModel playerModel = new PlayerModel();
        BankModel bankModel = new BankModel();
        StatsModel statsModel = new StatsModel();

        Player player = playerModel.loadPlayerFromDB(NamePaneController.counter);
        Bank bank = bankModel.loadBankFromDB(NamePaneController.counter);
        Stats stats = statsModel.loadFromDB(NamePaneController.counter);


        nameTopMenuIcons.setText(player.getName());
        levelTopMenuIcons.setText(String.valueOf(player.getLevel()));
        Image image = new Image(String.valueOf(player.getAvatar()));
        avatarTopMenuIcons.setImage(image);

        cashTopMenuIcons.setText(String.valueOf(bank.getCash()));
        cashInBankTopMenuIcons.setText(String.valueOf(bank.getCashInBank()));

        energyBarTopMenuIcons.setProgress((double)(stats.getEnergy()*100/stats.getMaxEnergy()));
        eneTopMenuIcons.setText(String.valueOf(stats.getEnergy()));
        maxEneTopMenuIcons.setText(String.valueOf("/  " + stats.getMaxEnergy()));

        healthBarTopMenuIcons.setProgress((double)stats.getHealth()*100/stats.getMaxHealth());
        hpTopMenuIcons.setText(String.valueOf(stats.getHealth()));
        maxHpTopMenuIcons.setText(String.valueOf("/  " + stats.getMaxHealth()));

        expBarTopMenuIcons.setProgress((double)stats.getExperience()*100/stats.getMaxExperience());
        presentExpTopMenuIcons.setText(String.valueOf(stats.getExperience()));
        expToNextLevelTopMenuIcons.setText(String.valueOf("/  " + stats.getMaxExperience()));


    }


}
