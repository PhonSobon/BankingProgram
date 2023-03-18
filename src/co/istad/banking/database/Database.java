package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard createCard(){
        CreditCard creditCard=new CreditCard(8888899,"PHON SOBON",1000.0);
        creditCard.setPin(1232);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount savingAccount(){
        SavingAccount saving =new SavingAccount(12324,"Lay phearum",100.0);

        return saving;
    }

}
