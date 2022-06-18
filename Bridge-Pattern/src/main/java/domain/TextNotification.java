package domain;

public class TextNotification extends Notification {

    public TextNotification(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(Message message) {
        System.out.println("[Text Notification] Sending notification with content " + message.getContent() + " at " + message.getTimeCreated());
        notificationSender.sendNotification(message);
    }
}
