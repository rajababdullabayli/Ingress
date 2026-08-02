package Task_11;

import Payment.Payment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        String[] arrayPaymentId = new String[totalPayment];
        double[] arrayPaymentAmount = new double[totalPayment];

        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the PaymentID: ");
            String paymentID = scanner.next();
            arrayPaymentId[i] = paymentID;
            System.out.println("Enter the Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            arrayPaymentAmount[i] = paymentAmount;
        }
        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setPaymentId(arrayPaymentId[i]);
            payment.setAmount(arrayPaymentAmount[i]);
            payment.printRiskReport();
        }
    }
}
