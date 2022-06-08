package domain;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher {
    private List<Observer> observers;
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.observers = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public String getName() {
        return this.channelName;
    }
}
