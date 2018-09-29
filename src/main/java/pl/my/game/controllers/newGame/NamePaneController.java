package pl.my.game.controllers.newGame;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import pl.my.game.database.models.Player;
import pl.my.game.modelFX.BankModel;
import pl.my.game.modelFX.PlayerModel;
import pl.my.game.modelFX.StatsModel;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class NamePaneController implements Initializable {
    public static final String NEW_GAME_GAME_SLOT_FXML = "/fxml/main/newGame/NewGameSlot.fxml";
    public static final String BORDER_PANE_MAIN_FXML = "/fxml/main/BorderPaneMain.fxml";



    public static int counter = 0;


    private PlayerModel playerModel;
    private BankModel bankModel;
    private StatsModel statsModel;


    @FXML
    private ToggleGroup avatarToggleGroup;

    @FXML
    public RadioButton avatar1NamePane, avatar2NamePane, avatar3NamePane, avatar4NamePane,
            avatar5NamePane, avatar6NamePane, avatar7NamePane, avatar8NamePane;

    @FXML
    private Pane namePane;

    @FXML
    private TextField nameField;

    @FXML
    private Button acceptButtonNamePane;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bankModel = new BankModel();
        playerModel = new PlayerModel();
        statsModel = new StatsModel();
        initBindings();

    }

    private void initBindings() {
        acceptButtonNamePane.disableProperty().bind(nameField.textProperty().isEmpty());
        nameField.setDisable(true);
        avatarToggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null)
                nameField.setDisable(false);
        });
    }

    public void acceptName() {
        Player player = playerModel.create(counter, nameField.getText());
        statsModel.setPlayer(player);
        bankModel.create(counter);
        statsModel.create(counter);


        BorderPane mainBorderPane = (BorderPane) FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        namePane.getChildren().setAll(mainBorderPane);

        mainBorderPane.getScene().getWindow().setX(mainBorderPane.getScene().getWindow().getX()-100);
        mainBorderPane.getScene().getWindow().setY(mainBorderPane.getScene().getWindow().getY()-100);
        mainBorderPane.getScene().getWindow().setHeight(640);
        mainBorderPane.getScene().getWindow().setWidth(820);


    }

    public void backToGameSlot() {
        Pane pane = FxmlUtils.fxmlLoader(NEW_GAME_GAME_SLOT_FXML);
        namePane.getChildren().setAll(pane);
    }


    public void setAvatar1ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/black-blood.png");
        System.out.println("Setavatar 1");
    }

    public void setAvatar2ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/fraud.png");
    }

    public void setAvatar3ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/hitman.png");
    }

    public void setAvatar4ButtonNamePane() {
        playerModel.setAvatarPlayer("/resources/icon/avatars/iron-man.png");
    }

    public void setAvatar5ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/james-bond.png");
    }

    public void setAvatar6ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/old-lady.png");
    }

    public void setAvatar7ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/ski-mask.png");
    }

    public void setAvatar8ButtonNamePane() {
        playerModel.setAvatarPlayer("/icon/avatars/walter-white.png");
    }

}
