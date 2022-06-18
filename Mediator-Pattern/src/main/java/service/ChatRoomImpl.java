package service;

import domain.User;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomImpl implements ChatRoom {

    private final Map<String, User> room = new HashMap<>();

    @Override
    public void send(String message, String toUserId) {
        room.get(toUserId).receive(message);
    }

    @Override
    public void joinRoom(User user) {
        room.put(user.getId(), user);
    }
}
