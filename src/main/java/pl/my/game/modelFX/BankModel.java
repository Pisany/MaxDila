package pl.my.game.modelFX;

import pl.my.game.database.dao.BankDao;
import pl.my.game.database.dbutils.DbManager;
import pl.my.game.database.models.Bank;

public class BankModel {

    public void createBank() {
        BankDao bankDao = new BankDao(DbManager.getConnectionSource());
        Bank bank = new Bank();
        bank.setId(1);
        bank.setCash(100);
        bank.setCashInBank(0);

        bankDao.createOrUpdate(bank);
        DbManager.closeConnectionSource();


    }
}



