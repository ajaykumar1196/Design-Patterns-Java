package domain;

import java.util.UUID;

public class Paragraph implements Element {

    private String uuid;

    public Paragraph() {
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
