package Task_8;

public class Transaction {
    protected Long id;
    protected Double amount;
    protected TransactionType type;
    protected TransactionStatus status;

    public Transaction(Long id, Double amount, TransactionType type, TransactionStatus status) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.status = status;
    }

    public void execute(){
        System.out.println("Progress executing");
    }

}
