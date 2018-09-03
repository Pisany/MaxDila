package pl.my.game.controllers.newGame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.utils.FxmlUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class LoadGameController implements Initializable {

    public static final String NEW_GAME_PANE_FXML = "/fxml/main/newGame/NewGame.fxml";


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initStats();


    }

    @FXML
    private Pane newGame;

    @FXML
    private Pane loadGame;

    @FXML
    private Label name1_LoadGameSlot, name2_LoadGameSlot, name3_LoadGameSlot,
                  level1_LoadGameSlot, level2_LoadGameSlot, level3_LoadGameSlot,
                  cash1_LoadGameSlot, cash2_LoadGameSlot, cash3_LoadGameSlot;


    public void slot1() {
    }

    public void slot2() {
    }

    public void slot3() {
    }


    public void backToFirstPane() {
        Pane pane=FxmlUtils.fxmlLoader(NEW_GAME_PANE_FXML);
        loadGame.getChildren().setAll(pane);

    }
    public void initStats(){
        PlayerDao playerDao=new PlayerDao(DbManager.getConnectionSource());
        BankDao bankDao=new BankDao(DbManager.getConnectionSource());

        name1_LoadGameSlot.setText(playerDao.loadQueryRaw().get(0)[2]);
        level1_LoadGameSlot.setText(playerDao.loadQueryRaw().get(0)[3]);
        cash1_LoadGameSlot.setText("0");
        DbManager.closeConnectionSource();

    }
}
