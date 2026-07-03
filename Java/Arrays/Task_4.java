import java.util.Scanner;
public class Task_4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int Odd=0;
        int Even=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            if (array[i]==0){
                continue;
            }
            else if (array[i]%2==0){
                Even+=1;
            }
            else{
                Odd+=1;
            }
        }
        System.out.println("Even: "+Even);
        System.out.println("Odd: "+Odd);
    }
}
