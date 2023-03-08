package designpatterns.behavioral.templatemethodpattern;

import designpatterns.behavioral.templatemethodpattern.abstractclass.Algorithm;
import designpatterns.behavioral.templatemethodpattern.concreteclass.Algorithm1;
import designpatterns.behavioral.templatemethodpattern.concreteclass.Algorithm2;

public class Client {
    public static void main(String[] args) {
        final Algorithm algorithm1 = new Algorithm1();
        algorithm1.execute();

        System.out.println();

        final Algorithm algorithm2 = new Algorithm2();
        algorithm2.execute();
    }
}
