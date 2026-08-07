package Task_5;

public class Account {
    protected String ownerName;
    protected Double balance;
    protected AccountStatus status;

    public Account(String ownerName, Double balance, AccountStatus status) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.status = status;
    }

    public void deposit(Double amount) {
        if (amount != null && amount > 0) {
            balance+=amount;
            System.out.println("New Balance: "+ balance);
        }
    }

    public void withdraw(Double amount) {
        System.out.println("The operation is in progress");
    }


}
