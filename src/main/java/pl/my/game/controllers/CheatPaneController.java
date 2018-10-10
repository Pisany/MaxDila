package pl.my.game.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

import static pl.my.game.modelFX.BankModel.*;
import static pl.my.game.modelFX.PlayerModel.*;
import static pl.my.game.modelFX.StatsModel.*;

public class CheatPaneController {
    public AnchorPane cheatPane;
    @FXML
    public Label cmdHistory;
    @FXML
    public TextField cmdTextField;

    private String appInput;

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
            cmdHistory.setText(String.join("\n", outPut));
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
                statsProperty.setPropertyHunger(statsProperty.getPropertyHunger()+100);
                foo= true;
            break;

            case "medic":
                System.out.println("Health + 100");
                outPut.add(appInput);
                statsProperty.setPropertyHealth(statsProperty.getPropertyHealth()+100);
                foo= true;
            break;

            case "energy":
                System.out.println("Energy + 100");
                outPut.add(appInput);
                statsProperty.setPropertyEnergy(statsProperty.getPropertyEnergy()+100);
                foo= true;

                break;

            case "add_cash":
                System.out.println("Cash + " + part[1]);
                outPut.add(appInput);
                bankProperty.setPropertyCash(bankProperty.getPropertyCash()+(Double.parseDouble(part[1])));
                foo= true;
                break;

            case "add_exp":
                System.out.println("Exp + " + part[1]);
                outPut.add(appInput);
                statsProperty.setPropertyExperience(statsProperty.getPropertyExperience()+(Integer.parseInt(part[1])));
                foo= true;
                break;

            case "add_lvl":
                System.out.println("Lvl + 1");
                outPut.add(appInput);
                playerProperty.setProperyLevel(playerProperty.getProperyLevel()+1);
                foo= true;
                break;

            case "add_strange":
                System.out.println("Strange + " + part[1]);
                outPut.add(appInput);
                playerProperty.setPropertyStrange(playerProperty.getPropertyStrange()+Integer.parseInt(part[1]));
                foo= true;
                break;

            case "add_agility":
                System.out.println("Agility + " + part[1]);
                outPut.add(appInput);
                playerProperty.setPropertyAgility(playerProperty.getPropertyAgility()+Integer.parseInt(part[1]));
                foo= true;
                break;

            case "add_charisma":
                System.out.println("Charisma + " + part[1]);
                outPut.add(appInput);
                playerProperty.setPropertyCharisma(playerProperty.getPropertyCharisma()+Integer.parseInt(part[1]));
                foo= true;
                break;

            case "add_items":
                System.out.println("Item id: " + part[1] + " x" + part[2]);
                outPut.add(appInput);
                foo= true;
                break;

            default:
                System.out.println("Błędne cmd");

        }
return foo;
    }


}
