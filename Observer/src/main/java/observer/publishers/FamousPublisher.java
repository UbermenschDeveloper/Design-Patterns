package observer.publishers;

import observer.subsribers.Subsriber;

import java.util.ArrayList;

public class FamousPublisher {
    private ArrayList<Subsriber> subscribers = new ArrayList<Subsriber>();

    public void subscribe(Subsriber subsriber) {
        if (!this.subscribers.contains(subsriber)) {
            this.subscribers.add(subsriber);
        }
    }

    public void unsubscibe(Subsriber subsriber) {
        if (this.subscribers.contains(subsriber)) {
            this.subscribers.remove(subsriber);
        }
    }

    public void publish(final String message) {
        for(Subsriber subsriber: subscribers) {
            subsriber.update(message);
        }
    }
}
