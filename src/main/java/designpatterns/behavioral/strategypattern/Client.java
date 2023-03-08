package designpatterns.behavioral.strategypattern;

import designpatterns.behavioral.strategypattern.context.Context;
import designpatterns.behavioral.strategypattern.strategy.AddStrategy;
import designpatterns.behavioral.strategypattern.strategy.MultiplyStrategy;
import designpatterns.behavioral.strategypattern.strategy.Strategy;
import designpatterns.behavioral.strategypattern.strategy.SubtractStrategy;

public class Client {
    public static void main(String[] args) {
        final int a = 2, b = 5;
        final Context context = new Context();

        Strategy strategy = new AddStrategy();
        context.setStrategy(strategy);
        System.out.println(context.executeStrategy(a, b));

        strategy = new SubtractStrategy();
        context.setStrategy(strategy);
        System.out.println(context.executeStrategy(a, b));

        strategy = new MultiplyStrategy();
        context.setStrategy(strategy);
        System.out.println(context.executeStrategy(a, b));
    }
}
