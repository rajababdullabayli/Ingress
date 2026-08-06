import java.util.Scanner;
public class Task_11 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int numb=input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(numb + "*" + i + "=" + (numb*i));
        }
    }
}

