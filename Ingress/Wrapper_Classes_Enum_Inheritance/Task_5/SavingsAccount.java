package Task_5;

public class SavingsAccount extends Account{
    public SavingsAccount(String ownerName, Double balance, AccountStatus status) {
        super(ownerName, balance, status);
    }
    @Override
    public void withdraw(Double amount){
        if(balance >= amount){
            balance-=amount;
        }
        else{
            System.out.println("The balance must be greater than the amount");
        }
    }
}
