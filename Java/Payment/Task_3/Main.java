package Task_3;

import Payment.Payment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        String[] paymentIdArray = new String[totalPayment];
        double[] paymentAmountArray = new double[totalPayment];
        String[] paymentCurrencyArray = new String[totalPayment];
        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the PaymentID: ");
            String paymentID = scanner.next();
            paymentIdArray[i] = paymentID;
            System.out.println("Enter the PaymentAmount: ");
            double paymentAmount = scanner.nextDouble();
            paymentAmountArray[i] = paymentAmount;
            System.out.println("Enter the PaymentCurrency: ");
            String paymentCurrency = scanner.next();
            paymentCurrencyArray[i] = paymentCurrency;
        }
        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setPaymentId(paymentIdArray[i]);
            payment.setAmount(paymentAmountArray[i]);
            payment.setCurrency(paymentCurrencyArray[i]);
            payment.printInfo();
        }
    }
}
