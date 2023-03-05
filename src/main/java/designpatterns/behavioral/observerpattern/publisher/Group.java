package designpatterns.behavioral.observerpattern.publisher;

import designpatterns.behavioral.observerpattern.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Group implements Publisher {
    private final List<Subscriber> subscribers;

    public Group() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.update(message));
    }
}
