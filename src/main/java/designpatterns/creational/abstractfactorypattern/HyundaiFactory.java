package designpatterns.creational.abstractfactorypattern;

import designpatterns.creational.abstractfactorypattern.abstractfactory.VehicleFactory;
import designpatterns.creational.abstractfactorypattern.bike.Bike;
import designpatterns.creational.abstractfactorypattern.bike.HyundaiBike;
import designpatterns.creational.abstractfactorypattern.car.Car;
import designpatterns.creational.abstractfactorypattern.car.HyundaiCar;

public class HyundaiFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new HyundaiCar();
    }

    @Override
    public Bike createBike() {
        return new HyundaiBike();
    }
}
