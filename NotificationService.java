public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        Notification notification2 = notificationFactory.createNotification("EMAIL");
        notification2.notifyUser();

        Notification notification3 = notificationFactory.createNotification("PUSH");
        notification3.notifyUser();
    }
}