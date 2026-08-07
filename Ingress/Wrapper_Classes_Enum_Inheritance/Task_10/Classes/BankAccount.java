package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.AccountType;

public class BankAccount {
    protected Long accountId;
    protected String owner;
    protected Double balance;
    protected AccountType accountType;
    protected AccountStatus status;

    public BankAccount(Long accountId, String owner, Double balance, AccountType accountType, AccountStatus status) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = balance;
        this.accountType = accountType;
        this.status = status;
    }

    public void deposit(Double amount){
        balance+=amount;
    }

    public void withdraw(Double amount){
        System.out.println("Process is loading");
    }

    public void printInfo(){
        System.out.println("Account ID      : "+accountId);
        System.out.println("Owner           : "+owner);
        System.out.println("Account Type    : "+accountType);
        System.out.println("Balance         : "+balance);
        System.out.println("Status          : "+status);
    }
}
