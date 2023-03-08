package designpatterns.behavioral.templatemethodpattern.concreteclass;

import designpatterns.behavioral.templatemethodpattern.abstractclass.Algorithm;

public class Algorithm2 extends Algorithm {
    @Override
    public void step1() {
        System.out.println("Algorithm 2: Step 1");
    }

    @Override
    public void step3() {
        System.out.println("Algorithm 2: Step 3");
    }

    @Override
    public void step4() {
        System.out.println("Algorithm 2: Step 4");
    }
}
