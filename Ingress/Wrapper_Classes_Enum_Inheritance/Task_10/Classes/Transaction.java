package Task_10.Classes;

import Task_10.Enums.AccountStatus;
import Task_10.Enums.TransactionStatus;
import Task_10.Enums.TransactionType;

public class Transaction {
    protected Long id;
    protected Double amount;
    protected TransactionType type;
    protected TransactionStatus status;

    public Transaction(Long id, Double amount, TransactionType type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.status = TransactionStatus.CREATED;
    }

    public void execute(BankAccount account){
        if (account.status == AccountStatus.BLOCKED){
            status = TransactionStatus.FAILED;
            System.out.println("Error: This Account blocked and can not processing transaction");
        }
        if(amount == null || amount <= 0){
            status = TransactionStatus.FAILED;
            System.out.println("Error: Enter the correct amount");
        }

        Double initialBalance = account.balance;

        switch (type){
            case DEPOSIT:
                account.deposit(amount);
                status= TransactionStatus.SUCCESS;
                System.out.println("Success: "+ account.owner+" from account " + amount +" adding Azn");
                break;
            case WITHDRAW:
            case TRANSFER:
                if (account.balance.equals(initialBalance)){
                    status = TransactionStatus.FAILED;
                }
                else {
                    status = TransactionStatus.SUCCESS;
                    System.out.println("Success: "+ account.owner+"from account "+ amount + "Azn removed");
                }
                break;
        }
    }

}
