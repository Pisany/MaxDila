package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import pl.my.game.body.ViewBody;
import pl.my.game.controllers.newGame.NamePaneController;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;

import java.net.URL;
import java.util.ResourceBundle;

public class TopMenuIconsController implements Initializable {



    @FXML
    public ImageView avatarTopMenuIcons;

    @FXML
    public Label levelTopMenuIcons;

    @FXML
    public Label cashTopMenuIcons;

    @FXML
    public Label cashInBankTopMenuIcons;

    @FXML
    public Label nameTopMenuIcons;

    @FXML public AnchorPane topMenuIcon;
    @FXML public ProgressBar expBarTopMenuIcons;
    @FXML public ProgressBar energyBarTopMenuIcons;
    @FXML public ProgressBar healthBarTopMenuIcons;
    @FXML public Label presentExpTopMenuIcons;
    @FXML public Label expToNextLevelTopMenuIcons;
    @FXML public Label hpTopMenuIcons;
    @FXML public Label maxHpTopMenuIcons;
    @FXML public HBox eneBarTopMenuIcons;
    @FXML public Label eneTopMenuIcons;
    @FXML public Label maxEneTopMenuIcons;

    public TopMenuIconsController() {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PlayerModel playerModel = new PlayerModel();
        BankModel bankModel=new BankModel();
        ViewBody viewBody = new ViewBody();
        Player player = playerModel.loadPlayerFromDB(NamePaneController.counter);
        Bank bank =bankModel.loadBankFromDB(NamePaneController.counter);

        System.out.println("Player name: "+ player.getName());
        nameTopMenuIcons.setText(player.getName());
        levelTopMenuIcons.setText(String.valueOf(player.getLevel()));
        Image image = new Image(String.valueOf(player.getAvatar()));
        avatarTopMenuIcons.setImage(image);
        cashTopMenuIcons.setText(String.valueOf(bank.getCash()));
        cashInBankTopMenuIcons.setText(String.valueOf(bank.getCashInBank()));
        maxEneTopMenuIcons.setText(String.valueOf("/  "+viewBody.computeMaxEnergy()));
        maxHpTopMenuIcons.setText(String.valueOf("/  "+viewBody.computeMaxHealth()));
        expToNextLevelTopMenuIcons.setText(String.valueOf("/  "+viewBody.computeExp()));
        presentExpTopMenuIcons.setText(String.valueOf(player.getExperience()));




    }






}
