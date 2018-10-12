package pl.my.game.modelFX;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import pl.my.game.database.models.Bank;

public class BankProperty {

    private IntegerProperty propertyId = new SimpleIntegerProperty(this,"id");
    private DoubleProperty propertyCash= new SimpleDoubleProperty(this, "propertyCash");
    private DoubleProperty propertyCashInBank = new SimpleDoubleProperty(this,"propertyCashInBank");

    public BankProperty(Bank bank){
        propertyId.set(bank.getId());
        propertyCash.set(bank.getCash());
        propertyCashInBank.set(bank.getCashInBank());
    }

    public int getPropertyId() {
        return propertyId.get();
    }

    public IntegerProperty propertyIdProperty() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId.set(propertyId);
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
