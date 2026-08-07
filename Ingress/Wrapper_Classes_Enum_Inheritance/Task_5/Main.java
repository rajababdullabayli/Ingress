package Task_5;

public class Main {
    static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Receb",600.0,AccountStatus.ACTIVE);
        savingsAccount.deposit(100.0);
        savingsAccount.withdraw(400.0);

        CurrentAccount currentAccount = new CurrentAccount("Receb",700.0,AccountStatus.ACTIVE,200.0);
        currentAccount.withdraw(450.0);
    }
}
