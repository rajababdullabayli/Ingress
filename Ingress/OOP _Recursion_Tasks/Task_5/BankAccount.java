package Task_5;

public class BankAccount {
    public String bankName;
    protected String owner;
    private double balance;
    int accountNumber;

    public String getBankName() {
        return bankName;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getInfo(){
        System.out.println("BankName: "+bankName);
        System.out.println("Owner: "+owner);
        System.out.println("Balance: "+balance);
        System.out.println("AccountNumber: "+accountNumber);
    }

    public BankAccount() {
    }
}
