package Task_4;

public class Main {
    static void main(String[] args) {
        Car car = new Car("Bmw", 2002, 45000.0, VehicleType.CAR, 4);
        Motorcycle motorcycle = new Motorcycle("Bmw500", 2026, 18000.0, VehicleType.MOTORCYCLE, true);
        Truck truck = new Truck("Truck", 2020, 60000.0, VehicleType.TRUCK, 20.5);
        car.showDetails();
        motorcycle.showDetails();
        truck.showDetails();
    }
}
