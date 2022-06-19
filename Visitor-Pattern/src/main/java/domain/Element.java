package domain;

public interface Element {
    String accept(Visitor visitor);
}
