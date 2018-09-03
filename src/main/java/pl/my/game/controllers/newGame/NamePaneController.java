package pl.my.game.controllers.newGame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class NamePaneController implements Initializable {
    public static final String NEW_GAME_GAME_SLOT_FXML = "/fxml/main/newGame/NewGameSlot.fxml";
    public static final String BORDER_PANE_MAIN_FXML = "/fxml/main/BorderPaneMain.fxml";

    static int counter=0;

    private PlayerModel playerModel;
    private BankModel bankModel;


    @FXML
    private Pane namePane;

    @FXML
    private TextField nameField;

    @FXML
    private Button acceptButtonNamePane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.bankModel = new BankModel();
        this.playerModel = new PlayerModel();
        initBindings();

    }

    private void initBindings() {
        this.acceptButtonNamePane.disableProperty().bind(nameField.textProperty().isEmpty());
    }

    public void acceptName() {

        BorderPane borderPane= (BorderPane) FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        namePane.getChildren().setAll(borderPane);
        borderPane.getScene().getWindow().setX(borderPane.getScene().getWindow().getX()-100);
        borderPane.getScene().getWindow().setY(borderPane.getScene().getWindow().getY()-100);
        borderPane.getScene().getWindow().setHeight(640);
        borderPane.getScene().getWindow().setWidth(820);
        playerModel.createPlayer(counter, nameField.getText());
        bankModel.createBank();



    }

    public void backToGameSlot() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_GAME_SLOT_FXML);
        namePane.getChildren().setAll(pane);
    }


}
