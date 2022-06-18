package domain;

public class GoogleNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(Message message) {
        System.out.println("[Google] Sending notification with content " + message.getContent() + " at " + message.getTimeCreated());
    }
}
