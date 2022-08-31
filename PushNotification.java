public class PushNotification implements Notification {
 
    @Override
    public void notifyUser(String text)
    {
        System.out.println("Sending a push notification to user "+ text);
    }
}