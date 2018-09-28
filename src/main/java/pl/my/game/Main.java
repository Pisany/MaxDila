package pl.my.game;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Level;
import pl.my.game.modelFX.LevelModel;
import pl.my.game.utils.FxmlUtils;

import static java.lang.Math.pow;

public class Main extends Application {
    static Parent root;


    public static final String BORDER_PANE_MAIN_FXML = "/fxml/main/BorderPaneMain.fxml";
    public static final String NEW_GAME_FIRST_PANE_FXML = "/fxml/main/newGame/NewGame.fxml";

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {

        //Locale.setDefault(new Locale("en"));
        //Parent borderPane =FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        root = FxmlUtils.fxmlLoader(NEW_GAME_FIRST_PANE_FXML);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("application.tittle"));
        primaryStage.show();

        DbManager.initDatabase();

//        LevelModel levelModel=new LevelModel();
//        levelModel.initLevelTable();






    }


}
