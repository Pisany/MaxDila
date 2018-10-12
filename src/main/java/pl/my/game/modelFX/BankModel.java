package pl.my.game.modelFX;

import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Bank;

import java.util.ArrayList;

public class BankModel {
    Bank bank = new Bank();


    public static BankProperty bankProperty;

    public void create(int counter) {
        BankDao bankDao = new BankDao(DbManager.getConnectionSource());
        bank.setId(counter);
        bank.setCash(500);
        bank.setCashInBank(1500);

        bankProperty = new BankProperty(bank);

        bankDao.createOrUpdate(bank);
        bankDao.refresh(bank);
        DbManager.closeConnectionSource();
    }

    public ArrayList<String[]> initLoadGame(){
        BankDao bankDao=new BankDao(DbManager.getConnectionSource());
        ArrayList<String[]> bankList = (ArrayList<String[]>) bankDao.loadQueryRaw();
        DbManager.closeConnectionSource();
        return bankList;
    }
    public Bank loadBankFromDB(int counter){
        BankDao bankDao=new BankDao(DbManager.getConnectionSource());

        ArrayList<String[]> bankList = (ArrayList<String[]>) bankDao.loadQueryRawByID(counter);

        bank.setId(Integer.parseInt(bankList.get(0)[0]));
        bank.setCash(Double.parseDouble(bankList.get(0)[1]));
        bank.setCashInBank(Double.parseDouble(bankList.get(0)[2]));

        bankProperty = new BankProperty(bank);

        DbManager.closeConnectionSource();
        return bank;
    }

    public void saveBankToDB(){
        BankDao bankDao = new BankDao(DbManager.getConnectionSource());

        bank.setId(bankProperty.getPropertyId());
        bank.setCash(bankProperty.getPropertyCash());
        bank.setCashInBank(bankProperty.getPropertyCashInBank());

        bankDao.createOrUpdate(bank);
        DbManager.closeConnectionSource();

    }
}



