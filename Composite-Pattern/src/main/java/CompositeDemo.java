import domain.*;

public class CompositeDemo {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple", "iPhone 13 Pro", 119000.00);
        Phone galaxyS22 = new Phone("Samsung", "S22 Ultra", 99000.00);
        GadgetDirectory phoneDirectory = new GadgetDirectory();
        phoneDirectory.addGadget(iPhone);
        phoneDirectory.addGadget(galaxyS22);

        Tablet iPad = new Tablet("Apple", "iPad", 49000.00);
        Tablet galaxyS22Tab = new Tablet("Samsung", "S22 Tab", 39000.00);
        GadgetDirectory tabletDirectory = new GadgetDirectory();
        tabletDirectory.addGadget(iPad);
        tabletDirectory.addGadget(galaxyS22Tab);

        Laptop macbook = new Laptop("Apple", "Macbook Pro", 119000.00);

        GadgetDirectory globalDirectory = new GadgetDirectory();
        globalDirectory.addGadget(phoneDirectory);
        globalDirectory.addGadget(tabletDirectory);
        globalDirectory.addGadget(macbook);

        globalDirectory.details();
    }
}
