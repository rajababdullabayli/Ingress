package Task_2;

import Payment.Payment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        double[] arrayPaymentAmount = new double[totalPayment];
        double[] arrayPaymentCommissionPercent = new double[totalPayment];

        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the PaymentAmount: ");
            double paymentAmount = scanner.nextDouble();
            arrayPaymentAmount[i] = paymentAmount;
            System.out.println("Enter the PaymentCommissionPercent: ");
            double paymentCommissionPercent = scanner.nextDouble();
            arrayPaymentCommissionPercent[i] = paymentCommissionPercent;
        }
        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setAmount(arrayPaymentAmount[i]);
            payment.setCommissionPercent(arrayPaymentCommissionPercent[i]);
            double total = payment.calculateTotalAmount();
            System.out.println("Total = " + total);
        }
    }
}
