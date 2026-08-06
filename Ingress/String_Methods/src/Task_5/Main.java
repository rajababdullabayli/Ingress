package Task_5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email's count");
        int emailCount = scanner.nextInt();
        scanner.nextLine();
        String [] arrayEmail = new String[emailCount];

        for (int i=0;i<emailCount;i++){
            System.out.println("Enter the email");
            String email = scanner.next();
            arrayEmail[i] = email;
        }
        for (int i=0;i<emailCount;i++){
            Email email = new Email();
            email.setEmail(arrayEmail[i]);
            String userName = email.getUsername(arrayEmail[i]);
            String domain = email.getDomain(arrayEmail[i]);
            boolean result = email.isGmail(arrayEmail[i]);
            System.out.println("Username: "+userName);
            System.out.println("Domain: "+domain);
            System.out.println("Gmail?: "+result);
        }
    }
}
