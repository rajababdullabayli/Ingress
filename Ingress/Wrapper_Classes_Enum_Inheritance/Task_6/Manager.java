package Task_6;

public class Manager extends Employee {
    public Manager(String name, Integer age, Double salary, EmployeeType type) {
        super(name, age, salary, type);
    }

    @Override
    public void calculateBonus(){
        double bonus = salary*0.15;
        salary+=bonus;
        System.out.println("Manager Bonus: "+bonus);
        System.out.println("Manager Finish Salary: "+salary);
    }
}
