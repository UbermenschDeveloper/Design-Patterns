package observer.subsribers.imp;

import observer.subsribers.Subsriber;

public class ViberSubscriber implements Subsriber {
    public void update(String message) {
        System.out.println("New Viber message '" + message + "'");
    }
}
