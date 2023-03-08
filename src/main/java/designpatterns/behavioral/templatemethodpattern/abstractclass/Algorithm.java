package designpatterns.behavioral.templatemethodpattern.abstractclass;

public abstract class Algorithm {
    // Template method
    public void execute() {
        step1();
        step2();
        step3();
        step4();
    }

    public abstract void step1();

    public void step2() {
        System.out.println("Abstract Algorithm: Step 2");
    }

    public abstract void step3();

    public void step4() {
        System.out.println("Abstract Algorithm: Step 4");
    }
}
