package designpatterns.creational.factorypattern;

import static designpatterns.creational.factorypattern.VehicleType.*;

public class Client {
    public static void main(String[] args) {
        final Vehicle car = VehicleFactory.getVehicle(CAR);
        final Vehicle bike = VehicleFactory.getVehicle(BIKE);
        final Vehicle bus = VehicleFactory.getVehicle(BUS);

        System.out.println(car.getType() + " -> " + car.getDescription());
        System.out.println(bike.getType() + " -> " + bike.getDescription());
        System.out.println(bus.getType() + " -> " + bus.getDescription());
    }
}
