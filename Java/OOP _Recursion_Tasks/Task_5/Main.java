package Task5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        int numb = input.nextInt();
        String[] arrayBankName = new String[numb];
        String[] arrayOwner = new String[numb];
        Double[] arrayBalance = new Double[numb];
        int[] arrayAccountNumber = new int[numb];

        for (int i = 0; i < numb; i++) {
            System.out.println("Enter the BankName:");
            String bankName = input.next();
            arrayBankName[i] = bankName;
            System.out.println("Enter the Owner's Name:");
            String ownerName = input.next();
            arrayOwner[i] = ownerName;
            System.out.println("Enter the Balance:");
            double balance = input.nextDouble();
            arrayBalance[i] = balance;
            System.out.println("Enter the AccountNumber");
            int accountNumber = input.nextInt();
            arrayAccountNumber[i] = accountNumber;
        }

        for (int i = 0; i < numb; i++) {
            BankAccount bankAccount = new BankAccount();
            bankAccount.setBankName(arrayBankName[i]);
            bankAccount.setOwner(arrayOwner[i]);
            bankAccount.setBalance(arrayBalance[i]);
            bankAccount.setAccountNumber(arrayAccountNumber[i]);
            bankAccount.getInfo();
        }
    }
}
