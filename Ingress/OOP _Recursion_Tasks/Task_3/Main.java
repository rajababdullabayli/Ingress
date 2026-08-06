package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the Employee's number");
        int number = input.nextInt();
        String employeename;
        int employeeId;
        String[] array = new String[number];
        int[] arrayId = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the Employee's Name");
            employeename = input.next();
            array[i] = employeename;
            arrayId[i] = i + 1;
        }
        for (int j = 0; j < number; j++) {
            Employee employee = new Employee();
            employee.setName(array[j]);
            employee.setId(arrayId[j]);
            employee.getInfo();
        }

    }
}
