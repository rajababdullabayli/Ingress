package Task1;

import java.util.Scanner;

public class MemoryDemo {
    int number;
    String name;
    String student;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Student's number");
        int number = input.nextInt();
        String[] arrayName = new String[number];
        int[] arrayAge = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter The Student's name:");
            String name = input.next();
            System.out.println("Enter The Student's  age:");
            int age = input.nextInt();
            arrayName[i] = name;
            arrayAge[i] = age;
        }
        for (int j = 0; j < number; j++) {
            Student student = new Student();
            student.setName(arrayName[j]);
            student.setAge(arrayAge[j]);
            student.printInfo();
        }
    }
}
