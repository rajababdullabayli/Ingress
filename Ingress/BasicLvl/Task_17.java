import java.util.Scanner;
public class Task_17 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int numb=input.nextInt();
        int count=0;
        for (int i=2;i<=numb/2;i++){
            if (numb%i==0){
                count+=i;
            }
        }
        if (count==0){
            System.out.println("The number is a prime number: ");
        }
        else{
            System.out.println("The number is not a prime number: ");

        }
    }
}
