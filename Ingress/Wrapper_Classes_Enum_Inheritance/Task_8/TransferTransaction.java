package Task_8;

public class TransferTransaction extends Transaction {
    private String sender;
    private String receiver;

    public TransferTransaction(Long id, Double amount, TransactionType type, TransactionStatus status, String sender, String receiver) {
        super(id, amount, type, status);
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (amount == null || amount <= 0) {
            status = TransactionStatus.FAILED;
            System.out.println("This amount mustn't to be 0 and negative number");
        }
        else {
            status = TransactionStatus.SUCCESS;
            System.out.println("Success: Sender " + sender + ", Receiver " + receiver + "on account " + amount + "is passing. Status: " + status);
        }
    }
}
