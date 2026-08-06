package Task_10;

public class TextFormatter {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void trimText(){
        System.out.println(firstName.trim());
        System.out.println(lastName.trim());
    }
    public void capitalize(){
        System.out.println(firstName.substring(0,1).toUpperCase()+firstName.substring(1)+ " " +lastName.substring(0,1).toUpperCase()+lastName.substring(1));
    }
    public void createEmail(){
        System.out.println(firstName+"."+lastName+"@gmail.com");
    }
    public void createUsername(){
        System.out.println(firstName+"_"+lastName);
    }
}
