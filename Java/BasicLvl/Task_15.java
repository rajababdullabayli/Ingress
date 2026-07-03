import java.util.Scanner;
public class Task_13 {    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int numb=input.nextInt();
        int sum=0;
        while(numb>0){
            sum+=numb%10;
            numb=numb/10;
        }
        System.out.println("Sum Of The Numbers :" + sum);
    }
}
