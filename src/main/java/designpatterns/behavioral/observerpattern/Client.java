package designpatterns.behavioral.observerpattern;

import designpatterns.behavioral.observerpattern.publisher.Group;
import designpatterns.behavioral.observerpattern.publisher.Publisher;
import designpatterns.behavioral.observerpattern.subscriber.Subscriber;
import designpatterns.behavioral.observerpattern.subscriber.User;

public class Client {
    public static void main(String[] args) {
        final Publisher group = new Group();

        final Subscriber user1 = new User(1);
        final Subscriber user2 = new User(2);
        final Subscriber user3 = new User(3);

        group.subscribe(user1);
        group.subscribe(user2);
        group.subscribe(user3);

        group.notifySubscribers("First message");

        group.unsubscribe(user2);

        group.notifySubscribers("Second message");
    }
}
