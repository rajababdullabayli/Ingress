package Task_8;

import Payment.Payment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Payments: ");
        int totalPayment = scanner.nextInt();
        scanner.nextLine();
        double[] arrayPaymentAmount = new double[totalPayment];
        for (int i = 0; i < totalPayment; i++) {
            System.out.println("Enter the Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            arrayPaymentAmount[i] = paymentAmount;
        }
        for (int i = 0; i < totalPayment; i++) {
            Payment payment = new Payment();
            payment.setAmount(arrayPaymentAmount[i]);
            if (payment.isLargePayment() == true){
                System.out.println("Type: LARGE PAYMENT");
            }
            else {
                System.out.println("Type: NORMAL PAYMENT");
            }
        }
    }
}
