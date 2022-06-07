package service;

import domain.Button;
import domain.WindowsButton;

public class WindowsDialogService extends DialogService {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
