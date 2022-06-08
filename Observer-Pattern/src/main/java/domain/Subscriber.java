package domain;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println("Hello " + this.name + "!! " + message.getMessage());
    }
}
