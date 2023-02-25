package designpatterns.creational.factorypattern;

public class Bus implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.BUS;
    }

    @Override
    public String getDescription() {
        return "A Big Bus";
    }
}
