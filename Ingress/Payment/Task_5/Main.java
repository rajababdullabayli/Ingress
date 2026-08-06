package Task_5;

import Payment.Payment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        double[] arrayPaymentAmount = new double[totalPayment];
        String[] arrayPaymentCurrency = new String[totalPayment];

        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            arrayPaymentAmount[i] = paymentAmount;
            scanner.nextLine();
            System.out.println("Enter the Payment Currency: ");
            String paymentCurrency = scanner.next();
            arrayPaymentCurrency[i] = paymentCurrency;
        }

        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setAmount(arrayPaymentAmount[i]);
            payment.setCurrency(arrayPaymentCurrency[i]);
            payment.isPaymentValid();

        }
    }
}
