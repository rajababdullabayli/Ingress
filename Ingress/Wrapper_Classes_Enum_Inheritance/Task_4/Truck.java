package Task_4;

public class Truck extends Vehicle{
    private Double loadCapacity;

    public Truck(String brand, Integer year, Double price, VehicleType vehicleType, Double loadCapacity) {
        super(brand, year, price, vehicleType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void showDetails(){
        System.out.println("This Truck's load capacity : "+loadCapacity);
    }
}
