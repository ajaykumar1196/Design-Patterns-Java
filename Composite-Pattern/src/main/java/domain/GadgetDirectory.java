package domain;

import java.util.ArrayList;
import java.util.List;

public class GadgetDirectory implements Gadget {

    private List<Gadget> gadgets;

    public GadgetDirectory() {
        gadgets = new ArrayList<>();

    }

    public void addGadget(Gadget gadget) {
        gadgets.add(gadget);
    }

    @Override
    public void details() {
        for (Gadget gadget : gadgets) {
            gadget.details();
        }
    }
}
