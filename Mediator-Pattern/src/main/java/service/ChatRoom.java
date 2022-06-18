package service;

import domain.User;

public interface ChatRoom {
    void send(String message, String toUserId);
    void joinRoom(User user);
}
