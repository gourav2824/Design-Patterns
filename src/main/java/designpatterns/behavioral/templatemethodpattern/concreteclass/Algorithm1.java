package designpatterns.behavioral.templatemethodpattern.concreteclass;

import designpatterns.behavioral.templatemethodpattern.abstractclass.Algorithm;

public class Algorithm1 extends Algorithm {
    @Override
    public void step1() {
        System.out.println("Algorithm 1: Step 1");
    }

    @Override
    public void step3() {
        System.out.println("Algorithm 1: Step 3");
    }
}
