package Task_3;

public class Manager extends Employee{
    public void manageTeam(){
        if(getName()!=null){
            System.out.println(getName() + "is managing the team");
        }
    }
}
