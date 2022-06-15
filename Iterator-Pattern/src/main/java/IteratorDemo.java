import domain.Gadget;
import domain.GadgetCollection;
import domain.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        GadgetCollection gadgetCollection = new GadgetCollection();
        gadgetCollection.add(new Gadget("iPhone"));
        gadgetCollection.add(new Gadget("MacBook"));
        Iterator gadgetIterator = gadgetCollection.createIterator();

        while (gadgetIterator.hasNext()) {
            Gadget gadget = (Gadget) gadgetIterator.next();
            System.out.println(gadget.getName());
        }
        System.out.println(gadgetIterator.next());
    }
}
