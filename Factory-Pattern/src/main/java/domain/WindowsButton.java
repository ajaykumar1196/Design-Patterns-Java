package domain;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("<win-button>Click Me!!</win-button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Someone clicked me!!. I am on windows.");
    }
}
