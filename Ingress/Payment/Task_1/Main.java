package Task_1;

import java.util.Scanner;

import Payment.Payment;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        String[] arrayPaymentId = new String[totalPayment];
        double[] arrayPaymentAmount = new double[totalPayment];
        String[] arrayPaymentCurrency = new String[totalPayment];

        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the PaymentID: ");
            String paymentID = scanner.next();
            arrayPaymentId[i] = paymentID;
            System.out.println("Enter the PaymentAmount: ");
            double paymentAmount = scanner.nextDouble();
            arrayPaymentAmount[i] = paymentAmount;
            System.out.println("Enter the PaymentCurrency: ");
            String paymentCurrency = scanner.next();
            arrayPaymentCurrency[i] = paymentCurrency;
        }
        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setPaymentId(arrayPaymentId[i]);
            payment.setAmount(arrayPaymentAmount[i]);
            payment.setCurrency(arrayPaymentCurrency[i]);
            payment.printInfo();
        }
    }
}
