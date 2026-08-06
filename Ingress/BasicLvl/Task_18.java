import java.util.Scanner;
public class Task_18 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Secret Number: ");
        int secNumb=input.nextInt();
        System.out.println("Enter The Number: ");
        int usersNumb=input.nextInt();
        while (secNumb!=usersNumb){
            if (secNumb>usersNumb){
                System.out.println("This Number Is Small");
            }
            else if (secNumb<usersNumb) {
                System.out.println("This Number Is Big");
            }
            System.out.println("Please Re-Enter The Number:");
            usersNumb=input.nextInt();
        }
        System.out.println("You got the number right");
    }
}
