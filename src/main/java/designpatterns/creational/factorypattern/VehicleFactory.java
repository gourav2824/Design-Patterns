package designpatterns.creational.factorypattern;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case BUS -> new Bus();
        };
    }
}
