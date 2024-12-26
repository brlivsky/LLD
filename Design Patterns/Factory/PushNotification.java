package Factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Senfing an Push Notification");
    }
}