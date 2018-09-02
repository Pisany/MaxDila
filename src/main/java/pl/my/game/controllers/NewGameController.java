package pl.my.game.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import pl.my.game.utils.DataCreator;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;


public class NewGameController implements Initializable {

    public static final String NEW_GAME_GAME_SLOT_FXML = "/fxml/main/newGame/GameSlot.fxml";


    @FXML
    private Pane rootPane;

    @FXML
    private Pane gameSlotPane;

    @FXML
    private Pane namePane;

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField nameField;

    @FXML
    private Button acceptButtonNamePane;

    @FXML
    public void initialize(){
//        initBindings();
        System.out.println("Dupalalal");
    }

    private void initBindings() {
        this.acceptButtonNamePane.disableProperty().bind(nameField.textProperty().isEmpty());
    }


    public void newGame() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_GAME_SLOT_FXML);
        rootPane.getChildren().setAll(pane);
    }



    public void loadGame() {

    }

    public void options() {
    }

    public void slot_1() {
        Pane pane=FxmlUtils.fxmlLoader("/fxml/main/newGame/NamePane.fxml");
        gameSlotPane.getChildren().setAll(pane);
        initBindings();
    }

    public void slot_2() {
        Pane pane=FxmlUtils.fxmlLoader("/fxml/main/newGame/NamePane.fxml");
        gameSlotPane.getChildren().setAll(pane);
    }

    public void slot_3() {
        Pane pane=FxmlUtils.fxmlLoader("/fxml/main/newGame/NamePane.fxml");
        gameSlotPane.getChildren().setAll(pane);
    }

    public void backToFirstPane() {
        Pane pane=FxmlUtils.fxmlLoader("/fxml/main/newGame/RootPane.fxml");
        gameSlotPane.getChildren().setAll(pane);
    }

    public void acceptName() {

        BorderPane borderPane= (BorderPane) FxmlUtils.fxmlLoader("/fxml/main/BorderPaneMain.fxml");
        namePane.getChildren().setAll(borderPane);
        borderPane.getScene().getWindow().setX(borderPane.getScene().getWindow().getX()-100);
        borderPane.getScene().getWindow().setY(borderPane.getScene().getWindow().getY()-100);
        borderPane.getScene().getWindow().setHeight(640);
        borderPane.getScene().getWindow().setWidth(820);
        DataCreator.fillDataBase(nameField.getText());



    }


    public void backToGameSlot() {

        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_GAME_SLOT_FXML);
        namePane.getChildren().setAll(pane);
    }

    public void exitGame(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
