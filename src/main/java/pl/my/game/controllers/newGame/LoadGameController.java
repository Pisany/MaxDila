package pl.my.game.controllers.newGame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;
import pl.my.game.utils.FxmlUtils;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoadGameController implements Initializable {

    public static final String NEW_GAME_PANE_FXML = "/fxml/main/newGame/NewGame.fxml";
    public static final String BORDER_PANE_MAIN_FXML = "/fxml/main/BorderPaneMain.fxml";

    




    @Override
    public void initialize(URL location, ResourceBundle resources) {

        initStats();


    }



    @FXML
    private Pane loadGame;

    @FXML
    private Label name1_LoadGameSlot, name2_LoadGameSlot, name3_LoadGameSlot,
                  level1_LoadGameSlot, level2_LoadGameSlot, level3_LoadGameSlot,
                  cash1_LoadGameSlot, cash2_LoadGameSlot, cash3_LoadGameSlot;

    @FXML
    public ImageView avatar1_LoadGameSlot, avatar2_LoadGameSlot, avatar3_LoadGameSlot;


//TODO Add exception handling when exist only one or two saves

    public void slot1() {
        NamePaneController.counter=1;

        BorderPane mainBorderPane = (BorderPane) FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        loadGame.getChildren().setAll(mainBorderPane);

        mainBorderPane.getScene().getWindow().setX(mainBorderPane.getScene().getWindow().getX()-100);
        mainBorderPane.getScene().getWindow().setY(mainBorderPane.getScene().getWindow().getY()-100);
        mainBorderPane.getScene().getWindow().setHeight(640);
        mainBorderPane.getScene().getWindow().setWidth(820);
    }

    public void slot2() {
        NamePaneController.counter=2;

        BorderPane mainBorderPane = (BorderPane) FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        loadGame.getChildren().setAll(mainBorderPane);

        mainBorderPane.getScene().getWindow().setX(mainBorderPane.getScene().getWindow().getX()-100);
        mainBorderPane.getScene().getWindow().setY(mainBorderPane.getScene().getWindow().getY()-100);
        mainBorderPane.getScene().getWindow().setHeight(640);
        mainBorderPane.getScene().getWindow().setWidth(820);
    }

    public void slot3() {
        NamePaneController.counter=3;

        BorderPane mainBorderPane = (BorderPane) FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        loadGame.getChildren().setAll(mainBorderPane);

        mainBorderPane.getScene().getWindow().setX(mainBorderPane.getScene().getWindow().getX()-100);
        mainBorderPane.getScene().getWindow().setY(mainBorderPane.getScene().getWindow().getY()-100);
        mainBorderPane.getScene().getWindow().setHeight(640);
        mainBorderPane.getScene().getWindow().setWidth(820);
    }


    public void backToFirstPane() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_PANE_FXML);
        loadGame.getChildren().setAll(pane);

    }

    private void initStats() {
        System.out.println("initStats()");
        PlayerModel playerModel = new PlayerModel();
        BankModel bankModel = new BankModel();
        ArrayList<String[]> playerList= playerModel.initLoadGame();
        ArrayList<String[]> bankList= bankModel.initLoadGame();


        name1_LoadGameSlot.setText(String.valueOf(playerList.get(0)[1]));//(String) PlayerDao.currentPlayer.get(1)
        level1_LoadGameSlot.setText(String.valueOf(playerList.get(0)[2]));//(String) PlayerDao.currentPlayer.get(2)
        Image image = new Image(String.valueOf(playerList.get(0)[7]));
        avatar1_LoadGameSlot.setImage(image);
        cash1_LoadGameSlot.setText(String.valueOf(bankList.get(0)[1]));

        name2_LoadGameSlot.setText(String.valueOf(playerList.get(1)[1]));
        level2_LoadGameSlot.setText(String.valueOf(playerList.get(1)[2]));
        image = new Image(String.valueOf(playerList.get(1)[7]));
        avatar2_LoadGameSlot.setImage(image);
        cash2_LoadGameSlot.setText(String.valueOf(bankList.get(1)[1]));

        name3_LoadGameSlot.setText(String.valueOf(playerList.get(2)[1]));
        level3_LoadGameSlot.setText(String.valueOf(playerList.get(2)[2]));
        image = new Image(String.valueOf(playerList.get(2)[7]));
        avatar3_LoadGameSlot.setImage(image);
        cash3_LoadGameSlot.setText(String.valueOf(bankList.get(2)[1]));

        



    }
}
