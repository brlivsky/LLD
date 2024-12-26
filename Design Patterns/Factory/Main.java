package Factory;

public class Main {
    public static void main(String[] args) {

        // The client does not directly use new to create instances of EmailNotification, SMSNotification, or 
        // PushNotification. Instead, it calls NotificationFactory.createNotification, which handles the instantiation.
        
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();

        notification = NotificationFactory.createNotification("EMAIL");
        notification.notifyUser();

        notification = NotificationFactory.createNotification("PUSH");
        notification.notifyUser();
    }
}
