package observer;

import observer.publishers.FamousPublisher;
import observer.subsribers.Subsriber;
import observer.subsribers.imp.TelegramSubsriber;
import observer.subsribers.imp.ViberSubscriber;
import observer.subsribers.imp.WhatsAppSubscriber;

public class Application {
    public static void main(String[] args) {
        Subsriber viberBoy = new ViberSubscriber();
        Subsriber telegramBoy = new TelegramSubsriber();
        Subsriber whatsAppBoy = new WhatsAppSubscriber();

        FamousPublisher famousPublisher = new FamousPublisher();

        famousPublisher.subscribe(viberBoy);
        famousPublisher.subscribe(telegramBoy);
        famousPublisher.subscribe(whatsAppBoy);

        famousPublisher.publish("Netflix and chill");

        famousPublisher.unsubscibe(viberBoy);

        famousPublisher.publish("Viber sucks");
    }
}
