package factory;

import domain.Button;
import domain.Checkbox;

public interface OSFactory {
    Button createButton();
    Checkbox createCheckbox();
}
