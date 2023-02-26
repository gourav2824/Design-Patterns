package designpatterns.structural.decoratorpattern;

public class SquareBracesDecorator extends IdentityDecorator {
    public SquareBracesDecorator(Identity wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        final String decoratedData = "[" + data + "]";
        super.writeData(decoratedData);
    }

    @Override
    public String readData() {
        final String decoratedData = super.readData();
        return decoratedData.substring(1, decoratedData.length() - 1);
    }
}
