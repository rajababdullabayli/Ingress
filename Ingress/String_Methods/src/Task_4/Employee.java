package Task_4;

public class Employee {
    private String name;
    private double salary;
    private double bonusInterest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonusInterest() {
        return bonusInterest;
    }

    public void setBonusInterest(double bonusInterest) {
        this.bonusInterest = bonusInterest;
    }

    public double calculateSalaryWithBonus(String name, double  salary, double bonusInterest){
        double bonus = salary*bonusInterest/100;
        double finalSalary = salary + bonus;
        System.out.println("Name: "+name);
        return finalSalary;
    }
}
