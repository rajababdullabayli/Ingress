package Task_4;

public class Motorcycle extends Vehicle {
    private Boolean hasBox;

    public Motorcycle(String brand, Integer year, Double price, VehicleType vehicleType, Boolean hasBox) {
        super(brand, year, price, vehicleType);
        this.hasBox = hasBox;
    }

    public void showDetails() {
        if (hasBox == true) {
            System.out.println("This Motorcycle's has box");
        }
        else {
            System.out.println("This Motorcycle's hasn't box");
        }
    }
}
