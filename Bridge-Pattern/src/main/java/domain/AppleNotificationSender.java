package domain;

public class AppleNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(Message message) {
        System.out.println("[Apple] Sending notification with content " + message.getContent() + " at " + message.getTimeCreated());
    }
}
