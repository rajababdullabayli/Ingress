package Task_6;

public class Developer extends Employee {
    public Developer(String name, Integer age, Double salary, EmployeeType type) {
        super(name, age, salary, type);
    }

    @Override
    public void calculateBonus(){
        double bonus = salary*0.1;
        salary+=bonus;
        System.out.println("Developer Bonus: "+bonus);
        System.out.println("Developer Finish Salary: "+salary);
    }
}
