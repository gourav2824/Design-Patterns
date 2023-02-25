package designpatterns.creational.abstractfactorypattern;

import designpatterns.creational.abstractfactorypattern.abstractfactory.VehicleFactory;
import designpatterns.creational.abstractfactorypattern.bike.Bike;
import designpatterns.creational.abstractfactorypattern.bike.ToyotaBike;
import designpatterns.creational.abstractfactorypattern.car.Car;
import designpatterns.creational.abstractfactorypattern.car.ToyotaCar;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Bike createBike() {
        return new ToyotaBike();
    }
}
