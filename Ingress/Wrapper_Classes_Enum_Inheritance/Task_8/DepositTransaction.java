package Task_8;

public class DepositTransaction extends Transaction{
    public DepositTransaction(Long id, Double amount, TransactionType type, TransactionStatus status) {
        super(id, amount, type, status);
    }

    public void execute(){
        if(amount == null || amount <=0 ){
            status= TransactionStatus.FAILED;
            System.out.println("This amount mustn't to be 0 and negative number");
        }
        else {
            status =TransactionStatus.SUCCESS;
            System.out.println("Success: To Account "+ amount +"was added.Status: "+status);
        }
    }
}
