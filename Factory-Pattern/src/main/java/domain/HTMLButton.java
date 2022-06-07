package domain;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Click Me!!</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Someone clicked me!!. I am on web page.");
    }
}
