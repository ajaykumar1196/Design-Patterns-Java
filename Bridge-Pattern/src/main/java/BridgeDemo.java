import domain.*;

import java.time.Instant;

public class BridgeDemo {
    public static void main(String[] args) {
        NotificationSender appleNotificationSender = new AppleNotificationSender();
        NotificationSender googleNotificationSender = new GoogleNotificationSender();

        Message message = new Message("Hi, welcome..", Instant.now());

        Notification googleTextNotification = new TextNotification(googleNotificationSender);
        googleTextNotification.send(message);

        Notification appleTextNotification = new TextNotification(appleNotificationSender);
        appleTextNotification.send(message);

        Notification googlePushNotification = new PushNotification(googleNotificationSender);
        googlePushNotification.send(message);

        Notification applePushNotification = new PushNotification(appleNotificationSender);
        applePushNotification.send(message);
    }
}
