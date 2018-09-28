package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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

    @FXML
    public AnchorPane topMenuIcon;

    public TopMenuIconsController() {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PlayerModel playerModel = new PlayerModel();
        BankModel bankModel=new BankModel();
        Player player = playerModel.initTopMenu(NamePaneController.counter);
        Bank bank =bankModel.initTopMenu(NamePaneController.counter);

        System.out.println("Player name: "+ player.getName());
        nameTopMenuIcons.setText(player.getName());
        levelTopMenuIcons.setText(String.valueOf(player.getLevel()));
        Image image = new Image(String.valueOf(player.getAvatar()));
        avatarTopMenuIcons.setImage(image);
        cashTopMenuIcons.setText(String.valueOf(bank.getCash()));
        cashInBankTopMenuIcons.setText(String.valueOf(bank.getCashInBank()));





    }






}
