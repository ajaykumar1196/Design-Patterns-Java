package domain;

public interface Visitor {
    String visit(Button button);
    String visit(Paragraph paragraph);
}
