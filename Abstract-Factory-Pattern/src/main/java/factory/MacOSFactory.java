package factory;

import domain.Button;
import domain.Checkbox;
import domain.MacOSButton;
import domain.MacOSCheckbox;

public class MacOSFactory implements OSFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
