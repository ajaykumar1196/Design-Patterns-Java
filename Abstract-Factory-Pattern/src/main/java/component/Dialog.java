package component;

import domain.Button;
import domain.Checkbox;
import factory.OSFactory;

public class Dialog {

    private Button button;
    private Checkbox checkbox;

    public Dialog(OSFactory osFactory) {
        this.button = osFactory.createButton();
        this.checkbox = osFactory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

}
