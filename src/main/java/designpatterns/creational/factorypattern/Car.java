package designpatterns.creational.factorypattern;

public class Car implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    @Override
    public String getDescription() {
        return "A Shiny Car";
    }
}
