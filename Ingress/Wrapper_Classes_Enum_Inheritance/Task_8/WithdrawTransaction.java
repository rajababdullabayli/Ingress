package Task_8;

public class WithdrawTransaction extends Transaction{
    public WithdrawTransaction(Long id, Double amount, TransactionType type, TransactionStatus status) {
        super(id, amount, type, status);
    }

    public void execute(){
        if (amount == null || amount <= 0) {
            status = TransactionStatus.FAILED;
            System.out.println("This amount mustn't to be 0 and negative number");
        }
        else {
            status = TransactionStatus.SUCCESS;
            System.out.println("Success: From Account "+ amount +"was cashed out.Status: "+status);
        }
    }
}
