package service;

import domain.Button;
import domain.HTMLButton;

public class HTMLDialogService extends DialogService {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
