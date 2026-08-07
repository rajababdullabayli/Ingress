package Task_3;

public class Developer extends Employee{
    public void writeCode(){
        if(getName()!=null){
            System.out.println(getName() + "is writing code");
        }
    }
}
