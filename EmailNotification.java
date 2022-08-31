public class EmailNotification implements Notification {
 
    @Override
    public void notifyUser(String text)
    {
        System.out.println("Sending an e-mail notification to user "+ text);
    }
}