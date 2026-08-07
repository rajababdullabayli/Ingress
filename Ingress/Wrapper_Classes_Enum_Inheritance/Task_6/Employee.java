package Task_6;

public class Employee {
    private String name;
    private Integer age;
    protected Double salary;
    private EmployeeType type;

    public Employee(String name, Integer age, Double salary, EmployeeType type) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = type;
    }
    public void calculateBonus(){
        System.out.println("The operation is in progress");
    }
}
