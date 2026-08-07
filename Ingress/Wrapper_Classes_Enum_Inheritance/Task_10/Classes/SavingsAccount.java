package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.AccountType;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(Long accountId, String owner, Double balance, AccountType accountType, AccountStatus status) {
        super(accountId, owner, balance, accountType, status);
    }

    @Override
    public void withdraw(Double amount){
        if(amount<500){
            System.out.println("You cannot withdraw money from your balance");
        }
        else {
            balance = balance-amount;
            System.out.println("Last balance: "+balance);
        }
    }
}
