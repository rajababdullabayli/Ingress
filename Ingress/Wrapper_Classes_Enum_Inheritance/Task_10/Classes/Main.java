package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.AccountType;
import Task_10.Enums.TransactionType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();

        BankAccount bankAccount1 = new SavingsAccount(1L,"Receb",3600.0, AccountType.PREMIUM, AccountStatus.ACTIVE);
        BankAccount bankAccount2 = new CurrentAccount(2L,"Reshul",3200.0,AccountType.CURRENT,AccountStatus.BLOCKED);
        BankAccount bankAccount3 = new PremiumAccount(3L,"Murad",3400.0,AccountType.SAVINGS,AccountStatus.ACTIVE,1500.0);

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);

        transactions.add(new Transaction(1L,3600.0, TransactionType.DEPOSIT));
        transactions.add(new Transaction(2L,300.0,TransactionType.WITHDRAW));
        transactions.add(new Transaction(3L,3600.0,TransactionType.WITHDRAW));
        transactions.add(new Transaction(4L,2000.0,TransactionType.WITHDRAW));

        transactions.get(0).execute(bankAccount1);
        transactions.get(1).execute(bankAccount1);
        transactions.get(2).execute(bankAccount2);
        transactions.get(3).execute(bankAccount3);

        for(BankAccount account : bankAccounts){
            account.printInfo();
        }
    }
}
