package pl.my.game.database.models;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Bank")
public class Bank implements BaseModel {

    @DatabaseField(columnName = "Id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "Cash")
    private double cash;

    @DatabaseField(columnName = "Cash_in_bank")
    private double cashInBank;

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCashInBank() {
        return cashInBank;
    }

    public void setCashInBank(double cashInBank) {
        this.cashInBank = cashInBank;
    }
}
