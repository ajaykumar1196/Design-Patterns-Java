import domain.*;

import java.util.Arrays;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor jsonExportVisitor = new JsonExportVisitor();
        List<Element> elements = Arrays.asList(new Button(), new Paragraph());
        StringBuilder jsonResponse = new StringBuilder();
        for(Element element : elements) {
            jsonResponse.append(element.accept(jsonExportVisitor)).append(",");
        }
        System.out.println("[Json Response] " + jsonResponse);

        Visitor xmlExportVisitor = new XmlExportVisitor();
        StringBuilder xmlResponse = new StringBuilder();
        xmlResponse.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<root>").append("\n");
        for(Element element : elements) {
            xmlResponse.append(element.accept(xmlExportVisitor)).append("\n");
        }
        xmlResponse.append("</root>");

        System.out.println("[Xml Response] " + xmlResponse);

    }
}
