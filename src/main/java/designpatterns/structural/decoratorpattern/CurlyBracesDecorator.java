package designpatterns.structural.decoratorpattern;

public class CurlyBracesDecorator extends IdentityDecorator {
    public CurlyBracesDecorator(Identity wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(addCurlyBraces(data));
    }

    @Override
    public String readData() {
        return removeCurlyBraces(super.readData());
    }

    private String addCurlyBraces(String data) {
        return "{" + data + "}";
    }

    private String removeCurlyBraces(String data) {
        return data.substring(1, data.length() - 1);
    }
}
