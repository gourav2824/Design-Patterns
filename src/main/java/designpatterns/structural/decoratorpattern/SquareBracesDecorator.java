package designpatterns.structural.decoratorpattern;

public class SquareBracesDecorator extends IdentityDecorator {
    public SquareBracesDecorator(Identity wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(addSquareBraces(data));
    }

    @Override
    public String readData() {
        return removeSquareBraces(super.readData());
    }

    private String addSquareBraces(String data) {
        return "[" + data + "]";
    }

    private String removeSquareBraces(String data) {
        return data.substring(1, data.length() - 1);
    }
}
