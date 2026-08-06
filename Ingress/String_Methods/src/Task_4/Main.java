package Task_4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int empNumb = scanner.nextInt();
        scanner.nextLine();
        String[] arrayEmployeeName = new String[empNumb];
        double[] arrayEmployeeSalary = new double[empNumb];
        double[] arrayEmployeeBonusInterest = new double[empNumb];

        for (int i = 0; i < empNumb; i++) {
            System.out.println("Enter the Employee's name: ");
            String name = scanner.next();
            arrayEmployeeName[i] = name;
            System.out.println("Enter the Employee's salary: ");
            double salary = scanner.nextDouble();
            arrayEmployeeSalary[i] = salary;
            System.out.println("Enter the Employee's bonus interest: ");
            double bonusInterest = scanner.nextDouble();
            arrayEmployeeBonusInterest[i] = bonusInterest;
        }

        for (int i=0;i<empNumb;i++){
            Employee employee = new Employee();
            employee.setName(arrayEmployeeName[i]);
            employee.setSalary(arrayEmployeeSalary[i]);
            employee.setBonusInterest(arrayEmployeeBonusInterest[i]);
            double finalSalary = employee.calculateSalaryWithBonus(arrayEmployeeName[i],arrayEmployeeSalary[i],arrayEmployeeBonusInterest[i]);
            System.out.println("Name: "+arrayEmployeeName[i]);
            System.out.println("Final Salary: "+finalSalary);
        }
    }
}
