package pl.my.game.controllers.newGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;


public class NewGameController implements Initializable {

    public static final String GAME_SLOT_FXML = "/fxml/main/newGame/NewGameSlot.fxml";
    public static final String NAME_PANE_FXML = "/fxml/main/newGame/NamePane.fxml";
    public static final String NEW_GAME_PANE_FXML = "/fxml/main/newGame/NewGame.fxml";
    public static final String LOAD_GAME_SLOT_FXML = "/fxml/main/newGame/LoadGameSlot.fxml";

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private Pane newGame;

    @FXML
    private Pane gameSlotPane;

    public void newGame() {
        Pane pane=FxmlUtils.fxmlLoader(GAME_SLOT_FXML);
        newGame.getChildren().setAll(pane);
        System.out.println("pane parent:"+pane.getParent());
    }

    public void loadGame() {
        Pane pane= FxmlUtils.fxmlLoader(LOAD_GAME_SLOT_FXML);
        newGame.getChildren().setAll(pane);

    }

    public void options() {

    }

    public void slot_1() {
        Pane pane=FxmlUtils.fxmlLoader(NAME_PANE_FXML);
        gameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=1;
    }

    public void slot_2() {
        Pane pane=FxmlUtils.fxmlLoader(NAME_PANE_FXML);
        gameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=2;

    }

    public void slot_3() {
        Pane pane=FxmlUtils.fxmlLoader(NAME_PANE_FXML);
        gameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=3;

    }

    public void backToFirstPane() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_PANE_FXML);
        gameSlotPane.getChildren().setAll(pane);

    }






    public void exitGame(ActionEvent actionEvent) {
    }


}
