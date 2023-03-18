package co.istad.banking;

import java.time.LocalDate;

public class CreditCard extends Account {
    private Integer pin;
    private Double limitAmount;
    private LocalDate thruDate;
    public CreditCard(Integer number, String name, Double balance) {

        super(number, name, balance);
    }

    public CreditCard() {

    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    protected void deposit(double amount) {

        LocalDate now =LocalDate.now();
        if(isExpired(thruDate)){
            System.out.println("Card is expired..!");
            return;
        }
        super.deposit(amount);
    }

    @Override
    protected void withdrawal(double amount) {

        if(amount>limitAmount){
            System.out.println("over the limit amount ..!");
            return;
        }
        if(isExpired(thruDate)){
            System.out.println("Card is expired..");
        }
        super.withdrawal(amount);
    }

    @Override
    protected void showBalance() {
        super.showBalance();
        System.out.println("pin:"+pin);
        System.out.println("Thru Date:"+thruDate);
        System.out.println("Limit Amount:"+limitAmount);
        System.out.println("..........................");

    }

    private boolean isExpired(LocalDate date){
        LocalDate now =LocalDate.now();
        return now.isAfter(date);
    }
}
