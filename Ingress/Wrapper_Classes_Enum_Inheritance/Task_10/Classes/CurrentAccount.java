package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.AccountType;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(Long accountId, String owner, Double balance, AccountType accountType, AccountStatus status) {
        super(accountId, owner, balance, accountType, status);
    }

    @Override
    public void withdraw(Double amount) {
        if (balance -amount >= -500) {
            balance = balance - amount;
            System.out.println("Last Balance: "+balance);
        }
        else {
            System.out.println("Error: 500 Azn Overdraft limit exceeded");
        }
    }
}
