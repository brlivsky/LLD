package Factory;

public class NotificationFactory {

    // The createNotification method in NotificationFactory is declared as a static method:
    // It makes sense here because the factory method does not rely on any instance variables 
    // or state — it is purely functional, taking inputs and returning an object.
    
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Notification type cannot be null or empty");
        }

        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Notification type cannot be type " + type);
        }
    }
}
