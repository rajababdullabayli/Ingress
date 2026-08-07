package Task_6;

public class Main {
    static void main(String[] args) {
        Developer developer = new Developer("Receb",18,3600.0,EmployeeType.DEVELOPER);
        Manager manager = new Manager("Receb",18,3600.0,EmployeeType.MANAGER);
        Tester tester = new Tester("Receb",18,3600.0,EmployeeType.TESTER);

        developer.calculateBonus();
        manager.calculateBonus();
        tester.calculateBonus();
    }
}
