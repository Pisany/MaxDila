package pl.my.game.modelFX;

import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dao.PlayerDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Bank;
import pl.my.game.database.models.Player;

import java.util.ArrayList;

public class BankModel {

    public void create(int counter) {
        BankDao bankDao = new BankDao(DbManager.getConnectionSource());
        Bank bank = new Bank();
        bank.setId(counter);
        bank.setCash(500);
        bank.setCashInBank(1500);

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
        Bank bank= new Bank();

        ArrayList<String[]> bankList = (ArrayList<String[]>) bankDao.loadQueryRawByID(counter);
        bank.setCash(Double.parseDouble(bankList.get(0)[1]));
        bank.setCashInBank(Double.parseDouble(bankList.get(0)[2]));


        DbManager.closeConnectionSource();
        return bank;
    }
}



