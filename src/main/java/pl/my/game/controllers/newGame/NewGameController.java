package pl.my.game.controllers.newGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;

//TODO Add to nNewGameSlot.fxml information about !empty gameslot
public class NewGameController implements Initializable {

    private static final String GAME_SLOT_FXML = "/fxml/main/newGame/NewGameSlot.fxml";
    private static final String NAME_PANE_FXML = "/fxml/main/newGame/NamePane.fxml";
    private static final String NEW_GAME_PANE_FXML = "/fxml/main/newGame/NewGame.fxml";
    private static final String LOAD_GAME_SLOT_FXML = "/fxml/main/newGame/LoadGameSlot.fxml";

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private Pane newGame;

    @FXML
    private Pane newGameSlotPane;

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
        newGameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=1;
    }

    public void slot_2() {
        Pane pane=FxmlUtils.fxmlLoader(NAME_PANE_FXML);
        newGameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=2;

    }

    public void slot_3() {
        Pane pane=FxmlUtils.fxmlLoader(NAME_PANE_FXML);
        newGameSlotPane.getChildren().setAll(pane);
        NamePaneController.counter=3;

    }

    public void backToFirstPane() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_PANE_FXML);
        newGameSlotPane.getChildren().setAll(pane);

    }






    public void exitGame(ActionEvent actionEvent) {
    }


}
