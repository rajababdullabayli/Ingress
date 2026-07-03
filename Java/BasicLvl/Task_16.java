import java.util.Scanner;
public class Task_14 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int numb=input.nextInt();
        int opposite=0;
        int k=0;
        while (numb>0){
            opposite=(opposite+numb%10)*10;
            k=k+1;
            numb=numb/10;
        }
        opposite=opposite/10;
        System.out.println("Opposite of number: " + opposite);
    }
}
