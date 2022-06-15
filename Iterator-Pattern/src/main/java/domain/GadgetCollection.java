package domain;

import java.util.ArrayList;
import java.util.List;

public class GadgetCollection implements Collection {
    List<Gadget> gadgets;

    public GadgetCollection() {
        this.gadgets = new ArrayList<>();
    }

    public void add(Gadget gadget) {
        gadgets.add(gadget);
    }

    @Override
    public Iterator createIterator() {
        return new GadgetIterator(gadgets);
    }
}
