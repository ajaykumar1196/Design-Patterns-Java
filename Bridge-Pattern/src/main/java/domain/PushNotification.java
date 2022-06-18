package domain;

public class PushNotification extends Notification {

    public PushNotification(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(Message message) {
        System.out.println("[Push Notification] Sending notification with content " + message.getContent() + " at " + message.getTimeCreated());
        notificationSender.sendNotification(message);
    }
}
