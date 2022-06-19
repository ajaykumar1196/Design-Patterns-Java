package domain;

public class JsonExportVisitor implements Visitor {

    @Override
    public String visit(Button button) {
        System.out.println("Processing an XML element with uuid: " + button.getUuid());
        return "\"Button\":{\"type\":\"Button\",\"text\":\"Submit\"}";
    }

    @Override
    public String visit(Paragraph paragraph) {
        System.out.println("Processing a JSON element with uuid: " + paragraph.getUuid());
        return "\"Paragraph\":{\"type\":\"Paragraph\",\"text\":\"Storing and exchanging data\"}";
    }
}
