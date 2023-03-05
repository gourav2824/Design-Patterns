package designpatterns.behavioral.observerpattern.publisher;

import designpatterns.behavioral.observerpattern.subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);
}
