package designpatterns.structural.decoratorpattern;

public class Client {
    public static void main(String[] args) {
        Identity name = new Name();
        name = new CurlyBracesDecorator(name);
        name = new SquareBracesDecorator(name);

        name.writeData("Jerry");

        System.out.println(name.getData());
        System.out.println(name.readData());
    }
}
