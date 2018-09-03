package pl.my.game.modelFX;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
/*
@@@@@@@@@@@@@@@$$$$$$$$$$###########@$%^&************&^%%%%%%%%%%%%
$$$$$$$$$$###########@$%^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@
###########@$%^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@$$$$$$$$$$
@$%^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@$$$$$$$$$$###########
$%^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@$$$$$$$$$$###########@
%^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@$$$$$$$$$$###########@$
^&************&^%%%%%%%%%%%%@@@@@@@@@@@@@@@$$$$$$$$$$###########@$%
 */
public class BankFx {

    private IntegerProperty id = new SimpleIntegerProperty();
    private IntegerProperty cash= new SimpleIntegerProperty();
    private IntegerProperty cashInBank = new SimpleIntegerProperty();

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getCash() {
        return cash.get();
    }

    public IntegerProperty cashProperty() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash.set(cash);
    }

    public int getCashInBank() {
        return cashInBank.get();
    }

    public IntegerProperty cashInBankProperty() {
        return cashInBank;
    }

    public void setCashInBank(int cashInBank) {
        this.cashInBank.set(cashInBank);
    }
}
