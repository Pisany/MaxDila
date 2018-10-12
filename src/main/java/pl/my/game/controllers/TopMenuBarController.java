package pl.my.game.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dao.CommonDao;
import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dao.StatsDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;
import pl.my.game.database.models.Stats;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;
import pl.my.game.modelFX.StatsModel;
import pl.my.game.utils.DialogsUtils;
import pl.my.game.utils.FxmlUtils;

import java.util.Optional;

public class TopMenuBarController {
    private static final String GAME_SLOT_FXML = "/fxml/main/newGame/NewGameSlot.fxml";

    @FXML BorderPane mainBorderPane;

    public void newGame() {
        Pane pane= FxmlUtils.fxmlLoader(GAME_SLOT_FXML);
        mainBorderPane.getChildren().setAll(pane);
    }

    public void saveGame() {
        PlayerModel playerModel = new PlayerModel();
        BankModel bankModel= new BankModel();
        StatsModel statsModel = new StatsModel();



         playerModel.savePlayerToDB();
         bankModel.saveBankToDB();
         statsModel.saveStatsToDB();

    }

    public void loadGame(ActionEvent actionEvent) {
    }

    public void cheatsPanel() {
        Scene scene = new Scene(FxmlUtils.fxmlLoader("/fxml/main/CheatPane.fxml"), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("CHEATS");
        stage.setScene(scene);
        stage.show();
     }

    public void closeApplication() {
        Optional<ButtonType> result = DialogsUtils.confirmationDialog();
        if (result.get() == ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }
    }

    public void setAutoSave(ActionEvent actionEvent) {
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        Stage stage = (Stage) mainBorderPane.getScene().getWindow();
        boolean value = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get();
        stage.setAlwaysOnTop(value);

    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void about() {
        DialogsUtils.dialogAboutApplication();
    }

    public void tutorial(ActionEvent actionEvent) {
    }
}
