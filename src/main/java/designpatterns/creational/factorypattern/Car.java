package designpatterns.creational.factorypattern;

public class Car implements Vehicle {
    private final VehicleType type;
    private final String description;

    public Car() {
        type = VehicleType.CAR;
        description = "A Shiny Car";
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
