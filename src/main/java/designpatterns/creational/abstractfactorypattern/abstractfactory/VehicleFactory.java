package designpatterns.creational.abstractfactorypattern.abstractfactory;

import designpatterns.creational.abstractfactorypattern.bike.Bike;
import designpatterns.creational.abstractfactorypattern.car.Car;

// Abstract Factory: It knows about all (abstract) product types (Car and Bike)
public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
