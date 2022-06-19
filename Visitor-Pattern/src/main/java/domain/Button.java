package domain;

import java.util.UUID;

public class Button implements Element {

    private String uuid;

    public Button() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
