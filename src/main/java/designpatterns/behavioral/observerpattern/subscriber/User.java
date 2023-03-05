package designpatterns.behavioral.observerpattern.subscriber;

public class User implements Subscriber {
    private final int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    public void update(String message) {
        System.out.println("User " + id + " received the message : " + message);
    }
}
