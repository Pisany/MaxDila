package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CheatPaneController {
    public AnchorPane cheatPane;
    @FXML
    public Label cmdHistory;
    @FXML
    public TextField cmdTextField;

    private String appInput;
    private String databaseInput;

    private ArrayList<String> outPut = new ArrayList<>();

    private String[] part = new String[3];

    //TODO add scrollbar to cmdHistory

    @FXML
    public void initialize() {

    }

    public void acceptCmd() {
        appInput = cmdTextField.getText();
        System.out.println(appInput);
        splitString();
        if(checkCmd()){
            cmdHistory.setText(String.valueOf(outPut));
        }

    }

    public void closeCheatPane() {
        Stage stage = (Stage) cheatPane.getScene().getWindow();
        stage.close();
    }

    private void splitString() {
        part = appInput.split(" ");

    }

    private boolean checkCmd() {
        boolean foo = false;

        switch (part[0]) {

            case "eat":
                System.out.println("Hunger + 100");
                outPut.add(appInput);
                foo= true;
            break;

            case "medic":
                System.out.println("Health + 100");
                outPut.add(appInput);
                foo= true;
            break;

            case "energy":
                System.out.println("Energy + 100");
                outPut.add(appInput);
                foo= true;

                break;

            case "add_cash":
                System.out.println("Cash + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_exp":
                System.out.println("Exp + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_lvl":
                System.out.println("Lvl + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_strange":
                System.out.println("Strange + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_agility":
                System.out.println("Agility + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_charisma":
                System.out.println("Charisma + " + part[1]);
                outPut.add(appInput);
                foo= true;
                break;

            case "add_items":
                System.out.println("Item id: " + part[1] + " x" + part[2]);
                outPut.add(appInput);
                foo= true;
                break;

            default:
                System.out.println("Błędne cmd");
                foo= false;

        }
return foo;
    }


}
