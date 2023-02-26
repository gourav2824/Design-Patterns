package designpatterns.structural.decoratorpattern;

public class Name implements Identity {
    private String name;

    @Override
    public void writeData(String data) {
        name = data;
    }

    @Override
    public String readData() {
        return name;
    }

    @Override
    public String getData() {
        return name;
    }
}
