package designpatterns.structural.decoratorpattern;

public class IdentityDecorator implements Identity {
    private final Identity wrappee;

    public IdentityDecorator(Identity wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

    @Override
    public String getData() {
        return wrappee.getData();
    }
}
