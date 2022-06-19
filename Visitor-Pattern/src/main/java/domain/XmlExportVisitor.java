package domain;

public class XmlExportVisitor implements Visitor {

    @Override
    public String visit(Button button) {
        System.out.println("Processing an XML element with uuid: " + button.getUuid());
        return "  <Button>\n" +
                "    <type>Button</type>\n" +
                "    <text>Submit</text>\n" +
                "  </Button>";
    }

    @Override
    public String visit(Paragraph paragraph) {
        System.out.println("Processing a JSON element with uuid: " + paragraph.getUuid());
        return "  <Paragraph>\n" +
                "    <type>Paragraph</type>\n" +
                "    <text>Storing and exchanging data</text>\n" +
                "  </Paragraph>";
    }
}
