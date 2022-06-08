import domain.Message;
import domain.Subscriber;
import domain.YoutubeChannel;

public class ObserverDemo {

    public static void main(String[] args)
    {
        YoutubeChannel youtubeChannel= new YoutubeChannel("Design Patterns");
        Subscriber subscriber1 = new Subscriber("Aman");
        Subscriber subscriber2 = new Subscriber("Abhishek");
        Subscriber subscriber3 = new Subscriber("Rahul");

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber3);

        Message message1 = new Message(youtubeChannel.getName() + " has published Observer pattern");
        youtubeChannel.notifyUpdate(message1);

        youtubeChannel.unsubscribe(subscriber3);
        youtubeChannel.subscribe(subscriber2);

        Message message2 = new Message(youtubeChannel.getName() + " has published Singleton pattern");
        youtubeChannel.notifyUpdate(message2);
    }
}
