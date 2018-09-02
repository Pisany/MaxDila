package pl.my.game.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.my.game.utils.DialogsUtils;

import java.util.Optional;

public class TopMenuBarController {

    BorderPane borderPane;

    public void newGame(ActionEvent actionEvent) {
    }

    public void saveGame(ActionEvent actionEvent) {
    }

    public void loadGame(ActionEvent actionEvent) {
    }

    public void cheatsPanel(ActionEvent actionEvent) {
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
        Stage stage = (Stage) borderPane.getScene().getWindow();
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
