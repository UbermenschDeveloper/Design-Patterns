package observer.subsribers.imp;

import observer.subsribers.Subsriber;

public class TelegramSubsriber implements Subsriber {
    public void update(String message) {
        System.out.println("New Telegram message is '" + message + "'");
    }
}
