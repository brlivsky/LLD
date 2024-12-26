package Factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Senfing an Email Notification");
    }
}