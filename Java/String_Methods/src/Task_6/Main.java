package Task_6;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        int numb1 = scanner.nextInt();
        System.out.print("Enter the Number2: ");
        int numb2 = scanner.nextInt();
        System.out.print("Enter the Operation: ");
        char operation = scanner.next().charAt(0);
        Calculator calculator = new Calculator();
        calculator.setNumber1(numb1);
        calculator.setNumber2(numb2);
        calculator.setOperation(operation);
        System.out.println("Netice: "+ calculator.calculate());
    }
}
