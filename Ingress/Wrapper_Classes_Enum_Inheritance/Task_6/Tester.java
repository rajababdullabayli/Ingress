package Task_6;

public class Tester extends Employee{
    public Tester(String name, Integer age, Double salary, EmployeeType type) {
        super(name, age, salary, type);
    }

    @Override
    public void calculateBonus(){
        double bonus = salary*0.07;
        salary+=bonus;
        System.out.println("Tester Bonus: "+bonus);
        System.out.println("Tester Finish Salary: "+salary);
    }
}
