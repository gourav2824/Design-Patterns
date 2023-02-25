package designpatterns.creational.abstractfactorypattern;

import designpatterns.creational.abstractfactorypattern.abstractfactory.VehicleFactory;

public class Factory {
    public static VehicleFactory createFactory(Brand brand) {
        return switch (brand) {
            case HYUNDAI -> new HyundaiFactory();
            case TOYOTA -> new ToyotaFactory();
        };
    }
}
