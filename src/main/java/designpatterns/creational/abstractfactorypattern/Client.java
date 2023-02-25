package designpatterns.creational.abstractfactorypattern;

import designpatterns.creational.abstractfactorypattern.abstractfactory.VehicleFactory;
import designpatterns.creational.abstractfactorypattern.bike.Bike;
import designpatterns.creational.abstractfactorypattern.car.Car;

import static designpatterns.creational.abstractfactorypattern.Brand.*;

public class Client {
    public static void main(String[] args) {
        final VehicleFactory hyundaiFactory = Factory.createFactory(HYUNDAI);
        final VehicleFactory toyotaFactory = Factory.createFactory(TOYOTA);

        final Car hyundaiCar = hyundaiFactory.createCar();
        final Bike hyundaiBike = hyundaiFactory.createBike();

        final Car toyotaCar = toyotaFactory.createCar();
        final Bike toyotaBike = toyotaFactory.createBike();

        System.out.println(hyundaiCar.getDescription());
        System.out.println(hyundaiBike.getDescription());
        System.out.println(toyotaCar.getDescription());
        System.out.println(toyotaBike.getDescription());
    }
}
