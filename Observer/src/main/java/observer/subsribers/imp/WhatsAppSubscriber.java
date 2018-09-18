package observer.subsribers.imp;

import observer.subsribers.Subsriber;

public class WhatsAppSubscriber implements Subsriber {
    public void update(String message) {
        System.out.println("New WhatsApp message '" + message + "'");
    }
}
