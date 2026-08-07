package Task_4;

public class Vehicle {
    private String brand;
    private Integer year;
    private Double price;
    private VehicleType vehicleType;

    public Vehicle(String brand, Integer year, Double price, VehicleType vehicleType) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    public void showDetails() {
        System.out.println("Type: " + vehicleType);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
