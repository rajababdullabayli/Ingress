package Task_6.Animals;

public class Animal {
    public void publicMethod() {
        System.out.println("Public method is working");
    }

    protected void protectedMethod() {
        System.out.println("Protected method is not working");
    }

    private void privateMethod() {
        System.out.println("Private method is not working");
    }

    void defaultMethod() {
        System.out.println("Default  method is not working");
    }
}
