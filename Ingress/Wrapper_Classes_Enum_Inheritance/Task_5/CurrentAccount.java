package Task_5;

public class CurrentAccount extends Account{
    private Double overdraftLimit;
    public CurrentAccount(String ownerName, Double balance, AccountStatus status, Double overdraftLimit) {
        super(ownerName, balance, status);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void withdraw(Double amount){
        if(balance-amount >= -500){
            balance -= amount;
        }
        else {
            System.out.println("Balance - Amount must be greater than -500");
        }
    }

}
