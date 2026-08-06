package Task_7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = scanner.next();
        Password pass = new Password();
        pass.setPassword(password);
        boolean result  = pass.isPasswordValid(password);
        System.out.println("Password: "+password);
        System.out.println("Result: "+result);
    }
}
