package Task_1;

public class Student {
    private String name;
    private Integer age;
    private Double grade;
    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
        if (grade>90){
            System.out.println("Excellent");
        }
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void inActive(){
        if (active == true){
            System.out.println("Student Name: "+name);
            System.out.println("Student Grade: "+grade);
        }
    }

}
