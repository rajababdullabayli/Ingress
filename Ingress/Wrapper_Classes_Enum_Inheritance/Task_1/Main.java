package Task_1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student count: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();
        String[] arrayName = new String[studentCount];
        Integer[] arrayAge = new Integer[studentCount];
        Double[] arrayGrade = new Double[studentCount];
        Boolean[] arrayActive = new Boolean[studentCount];

        for(int i=0;i<studentCount;i++){
            System.out.print("Enter the student name: ");
            String name = scanner.next();
            arrayName[i] = name;
            System.out.print("Enter the student age: ");
            Integer age = scanner.nextInt();
            arrayAge[i] = age;
            System.out.print("Enter the student grade: ");
            Double grade = scanner.nextDouble();
            arrayGrade[i] = grade;
            System.out.print("Enter the student active: ");
            Boolean active = scanner.nextBoolean();
            arrayActive[i] = active;
        }

        for (int i=0;i<studentCount;i++){
            Student student = new Student();
            student.setName(arrayName[i]);
            student.setAge(arrayAge[i]);
            student.setGrade(arrayGrade[i]);
            student.setActive(arrayActive[i]);
            student.inActive();
        }
    }
}
