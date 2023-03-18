package co.istad.banking;

import co.istad.banking.database.Database;

public class BankingProgram {
    public static void main(String[] args) {
        CreditCard creditCard =new CreditCard();
        creditCard.setNumber(8888899);
        creditCard.setPin(1232);
        //check credit card exist or not
        if(Database.createCard().getNumber().equals(creditCard.getNumber())){
           creditCard=Database.createCard();
        }else{
            System.out.println("Invalid credit card....!");
        }
        creditCard.deposit(2200.0);
        creditCard.withdrawal(200.0);
        creditCard.showBalance();
        SavingAccount savingAccount =new SavingAccount();
        savingAccount.setInterestI(new RielRate());
        savingAccount.showBalance();

        SavingAccount mySaving = new SavingAccount(1234,"sovan",1000.0);
        mySaving.setInterestI(new DollarRate());
        mySaving.calculateInterest();
        System.out.println(mySaving.getInterest());


    }
}
