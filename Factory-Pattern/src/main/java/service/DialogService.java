package service;

import domain.Button;

public abstract class DialogService {

    public void render() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();

}
