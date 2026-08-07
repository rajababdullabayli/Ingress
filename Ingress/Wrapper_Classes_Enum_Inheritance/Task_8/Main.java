package Task_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new TransferTransaction(101L,525.50,TransactionType.TRANSFER,TransactionStatus.SUCCESS,"Rashul","Receb"));
        transactions.add(new DepositTransaction(102L,500.0,TransactionType.DEPOSIT,TransactionStatus.CREATED));
        transactions.add(new WithdrawTransaction(103L,1500.0,TransactionType.WITHDRAW,TransactionStatus.CREATED));

        for (Transaction transaction : transactions){
            transaction.execute();
        }
    }
}
