package designpatterns.structural.decoratorpattern;

public class Client {
    public static void main(String[] args) {
        Identity name = new Name();
        name = new CurlyBracesDecorator(name);
        name = new SquareBracesDecorator(name);

        name.writeData("Jerry");

        System.out.println(name.getData());
        System.out.println(name.readData());

        final Identity anotherName = new SquareBracesDecorator(new CurlyBracesDecorator(new Name()));

        anotherName.writeData("Tom");

        System.out.println(anotherName.getData());
        System.out.println(anotherName.readData());
    }
}
