package domain;

import service.ChatRoom;

import java.util.UUID;

public class User {

    private ChatRoom chatRoom;

    private String name;
    private String id;

    public User(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void send(String message, String toUser) {
        System.out.println(this.getName() + " :: Sending Message : " + message + " to " + toUser);
        chatRoom.send(message, toUser);
    }

    public void receive(String message) {
        System.out.println(this.getName() + " :: Receive Message : " + message);
    }
}
