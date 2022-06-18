package domain;

import java.time.Instant;

public class Message {
    private String content;
    private Instant timeCreated;

    public Message(String content, Instant timeCreated) {
        this.content = content;
        this.timeCreated = timeCreated;
    }

    public String getContent() {
        return content;
    }

    public Instant getTimeCreated() {
        return timeCreated;
    }
}
