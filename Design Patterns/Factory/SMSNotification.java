package Factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Senfing an SMS Notification");
    }
}
