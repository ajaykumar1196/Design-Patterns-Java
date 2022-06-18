import domain.User;
import service.ChatRoom;
import service.ChatRoomImpl;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();
        User user1 = new User(chatRoom, "Doe");
        User user2 = new User(chatRoom, "Dane");
        User user3 = new User(chatRoom, "Joe");
        User user4 = new User(chatRoom, "Jane");
        chatRoom.joinRoom(user1);
        chatRoom.joinRoom(user2);
        chatRoom.joinRoom(user3);
        chatRoom.joinRoom(user4);

        user1.send("Hi", user2.getId());
    }
}
