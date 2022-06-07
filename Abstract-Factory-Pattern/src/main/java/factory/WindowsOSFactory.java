package factory;

import domain.Button;
import domain.Checkbox;
import domain.WindowsOSButton;
import domain.WindowsOSCheckbox;

public class WindowsOSFactory implements OSFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckbox();
    }
}
