package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.AccountType;

public class PremiumAccount extends BankAccount {
    private Double limit;

    public PremiumAccount(Long accountId, String owner, Double balance, AccountType accountType, AccountStatus status, Double limit) {
        super(accountId, owner, balance, accountType, status);
        this.limit = limit;
    }

    public void withdraw(Double amount){
        if(balance-amount >= -limit){
            balance = balance -amount;
            System.out.println("Last Balance: "+balance);
        }
        else {
            System.out.println("Error: Premium limit exceeded");
        }
    }
}
