package domain;

public interface Publisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyUpdate(Message message);
}
