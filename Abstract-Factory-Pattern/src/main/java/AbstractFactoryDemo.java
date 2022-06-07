import component.Dialog;
import factory.MacOSFactory;
import factory.WindowsOSFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Dialog dialog = null;
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new Dialog(new MacOSFactory());
        } else {
            dialog = new Dialog(new WindowsOSFactory());
        }
        dialog.render();
    }
}
