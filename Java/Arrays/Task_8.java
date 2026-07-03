import java.util.Scanner;
public class Task_8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the number to repeat: ");
        int repeatNumb = input.nextInt();
        int count=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++) {
            array[i] = input.nextInt();
            if (repeatNumb==array[i]){
                count+=1;
            }
        }
        System.out.println("This number has been repeated " + count +  " times");
    }
}
