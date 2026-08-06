import java.util.Scanner;
public class Task_7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the number to find: ");
        int findNumb = input.nextInt();
        System.out.println("Enter the numbers");
        int k=0; //Not Foundu yazmaq üçüç istifadə etdim
        for(int i=0;i<size;i++) {
            array[i] = input.nextInt();
            if (array[i]==findNumb){
                System.out.println("Found");
                break;
            }
            else{
                k+=1;
            }
        }
        if (k==size){
            System.out.println("Not Found");
        }
    }
}
