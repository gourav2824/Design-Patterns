package designpatterns.creational.factorypattern;

public class Bike implements Vehicle {
    private final VehicleType type;
    private final String description;

    public Bike() {
        type = VehicleType.BIKE;
        description = "A Fast Bike";
    }

    @Override
    public VehicleType getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
