public class SMSNotification implements Notification {
 
    @Override
    public void notifyUser(String text)
    {
        System.out.println("Sending an SMS notification to user " + text);
    }
}