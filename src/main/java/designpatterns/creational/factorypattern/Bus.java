package designpatterns.creational.factorypattern;

public class Bus implements Vehicle {
    private final VehicleType type;
    private final String description;

    public Bus() {
        type = VehicleType.BUS;
        description = "A Big Bus";
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
