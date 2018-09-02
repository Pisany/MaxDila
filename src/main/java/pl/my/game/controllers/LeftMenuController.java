package pl.my.game.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LeftMenuController {

    public static final String EMPTY_MENU_FXML = "/fxml/rightMenu/EmptyMenu.fxml";
    public static final String CHARACTER_MAIN_FXML = "/fxml/centerMenu/CharacterMain.fxml";
    public static final String CHARACTER_MENU_FXML = "/fxml/rightMenu/CharacterMenu.fxml";
    public static final String CITY_MAIN_FXML = "/fxml/centerMenu/CityMain.fxml";
    public static final String CITY_MENU_FXML = "/fxml/rightMenu/CityMenu.fxml";
    public static final String BACKPACK_MAIN_FXML = "/fxml/centerMenu/BackpackMain.fxml";
    public static final String ACTION_MAIN_FXML = "/fxml/centerMenu/ActionMain.fxml";
    public static final String GOTO_MAIN_FXML = "/fxml/centerMenu/GotoMain.fxml";
    public static final String HOME_MAIN_FXML = "/fxml/centerMenu/HomeMain.fxml";
    public static final String HOME_MENU_FXML = "/fxml/rightMenu/HomeMenu.fxml";
    public static final String PROPERTIES_MAIN_FXML = "/fxml/centerMenu/PropertiesMain.fxml";
    public static final String TEAM_MAIN_FXML = "/fxml/centerMenu/TeamMain.fxml";
    private MainController mainController;



    @FXML
    public void openCharacterWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(CHARACTER_MAIN_FXML);
        mainController.setRight(CHARACTER_MENU_FXML);
    }

    @FXML
    public void openCityWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(CITY_MAIN_FXML);
        mainController.setRight(CITY_MENU_FXML);

    }

    @FXML
    public void openBackpackWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(BACKPACK_MAIN_FXML);
        //mainController.setRight("/fxml/rightMenu/");
    }


    public void openActionWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(ACTION_MAIN_FXML);
        //mainController.setRight("/fxml/rightMenu/ActionMenu.fxml");
    }

    public void openGoToWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(GOTO_MAIN_FXML);
        //mainController.setRight("/fxml/rightMenu/");
    }

    public void openHomeWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(HOME_MAIN_FXML);
        mainController.setRight(HOME_MENU_FXML);
    }

    public void openProperitiesWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(PROPERTIES_MAIN_FXML);
        //mainController.setRight("/fxml/rightMenu/");
    }

    public void openGroupWindow() {
        mainController.setRight(EMPTY_MENU_FXML);
        mainController.setCenter(TEAM_MAIN_FXML);
        //mainController.setRight("/fxml/rightMenu/");
    }

    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }
}
