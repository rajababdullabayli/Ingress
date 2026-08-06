package Task_11;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Int-Number1: ");
        int numbInt1 = scanner.nextInt();
        System.out.print("Enter the Int-Number2: ");
        int numbInt2 = scanner.nextInt();
        System.out.print("Enter the Int-Number3: ");
        int numbInt3 = scanner.nextInt();

        System.out.print("Enter the Double-Number1: ");
        double numbDouble1 = scanner.nextDouble();
        System.out.print("Enter the Double-Number2: ");
        double numbDouble2 = scanner.nextDouble();

        System.out.print("Enter the Array's length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array's elements");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Overloading overloading = new Overloading();
        int sumFor2Int = overloading.getSum(numbInt1,numbInt2);
        int sumFor3Int = overloading.getSum(numbInt1,numbInt2,numbInt3);
        double sumFor2Double = overloading.getSum(numbDouble1,numbDouble2);
        int sumForArray = overloading.getSum(array);

        System.out.println("Sum for 2-Int: "+ sumFor2Int);
        System.out.println("Sum for 3-Int: "+ sumFor3Int);
        System.out.println("Sum for 2-Double: "+ sumFor2Double);
        System.out.println("Sum for Array: "+ sumForArray);
    }
}
