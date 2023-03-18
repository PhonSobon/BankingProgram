package co.istad.banking;

public class Account {
    private Integer number;
    private String name;
    private Double balance;
    public Account(){
    }
    public Account(Integer number,String name,Double balance){
        this.number=number;
        this.name =name;
        this.balance=balance;

    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

//    private void setBalance(Double balance) {
//        this.balance = balance;
//    }
    protected void deposit(double amount){
        if(amount<0){
            System.out.println("Are you kidding me ?");
            return;
        }
        if(amount ==0){
            System.out.println("you can't deposit");
            return;
        }
        balance +=amount;
    }
    protected void withdrawal(double amount){
        if(amount<0){
            System.out.println("Are you kidding me?");
            return;
        }
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=amount;
    }
    protected void showBalance(){
        System.out.println("Account Information");
        System.out.println("--------------------");
        System.out.println("Act No:"+number);
        System.out.println("Act Name:"+name);
        System.out.println("balance:"+balance);
    }
}
