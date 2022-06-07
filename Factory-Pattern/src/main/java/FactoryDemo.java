import service.DialogService;
import service.HTMLDialogService;
import service.WindowsDialogService;

public class FactoryDemo {
    public static void main(String[] args) {
        DialogService dialog = null;
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialogService();
        } else {
            dialog = new HTMLDialogService();
        }

        dialog.render();
    }
}
