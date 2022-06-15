package domain;

import java.util.List;

public class GadgetIterator implements Iterator {
    private List<Gadget> gadgets;
    private int position;

    public GadgetIterator(List<Gadget> gadgets) {
        this.gadgets = gadgets;
    }

    @Override
    public boolean hasNext() {
        return position < gadgets.size();
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            return null;
        }
        return gadgets.get(position++);
    }
}
