package Task_4;

public class Car extends Vehicle{
    private Integer doors;

    public Car(String brand, Integer year, Double price, VehicleType vehicleType, Integer doors) {
        super(brand, year, price, vehicleType);
        this.doors = doors;
    }

    public void showDetails(){
        System.out.println("This Car's door count: "+doors);
    }

}
