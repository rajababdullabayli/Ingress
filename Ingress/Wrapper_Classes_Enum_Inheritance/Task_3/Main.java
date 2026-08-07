package Task_3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee count: ");
        Integer empCount = sc.nextInt();
        sc.nextLine();
        String[] arrayDeveloperName = new String[empCount];
        Integer[] arrayDeveloperAge = new Integer[empCount];
        Double[] arrayDeveloperSalary = new Double[empCount];
        String[] arrayManagerName = new String[empCount];
        Integer[] arrayManagerAge = new Integer[empCount];
        Double[] arrayManagerSalary = new Double[empCount];

        for (int i=0;i<empCount;i++){
            System.out.print("Enter the Developer Name: ");
            String nameDeveloper = sc.next();
            arrayManagerName[i] = nameDeveloper;
            System.out.print("Enter the Developer Age: ");
            Integer ageDeveloper = sc.nextInt();
            arrayDeveloperAge[i] = ageDeveloper;
            System.out.print("Enter the Developer Salary: ");
            Double salaryDeveloper = sc.nextDouble();
            arrayDeveloperSalary[i] = salaryDeveloper;
            System.out.print("Enter the Manager Name: ");
            String nameManager = sc.next();
            arrayManagerName[i] = nameManager;
            System.out.print("Enter the Manger Age: ");
            Integer ageManager = sc.nextInt();
            arrayDeveloperAge[i] = ageManager;
            System.out.print("Enter the Manager Salary: ");
            Double salaryManager = sc.nextDouble();
            arrayDeveloperSalary[i] = salaryManager;
        }
        for (int i=0;i<empCount;i++){
            Developer dev = new Developer();
            Manager mgr = new Manager();

            dev.setName(arrayDeveloperName[i]);
            dev.setAge(arrayDeveloperAge[i]);
            dev.setSalary(arrayDeveloperSalary[i]);
            mgr.setName(arrayDeveloperName[i]);
            mgr.setAge(arrayDeveloperAge[i]);
            mgr.setSalary(arrayDeveloperSalary[i]);

            dev.writeCode();
            mgr.manageTeam();
        }
    }
}
