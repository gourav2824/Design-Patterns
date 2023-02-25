package designpatterns.creational.factorypattern;

public class Bike implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }

    @Override
    public String getDescription() {
        return "A Fast Bike";
    }
}
