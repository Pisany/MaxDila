package pl.my.game.modelFX;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import pl.my.game.database.models.Bank;

public class BankProperty {

    private DoubleProperty propertyCash= new SimpleDoubleProperty(this, "propertyCash");
    private DoubleProperty propertyCashInBank = new SimpleDoubleProperty();

    public BankProperty(Bank bank){
        propertyCash.set(bank.getCash());
        propertyCashInBank.set(bank.getCashInBank());
    }

    public double getPropertyCash() {
        return propertyCash.get();
    }

    public DoubleProperty propertyCashProperty() {
        return propertyCash;
    }

    public void setPropertyCash(double propertyCash) {
        this.propertyCash.set(propertyCash);
    }

    public double getPropertyCashInBank() {
        return propertyCashInBank.get();
    }

    public DoubleProperty propertyCashInBankProperty() {
        return propertyCashInBank;
    }

    public void setPropertyCashInBank(double propertyCashInBank) {
        this.propertyCashInBank.set(propertyCashInBank);
    }
}
