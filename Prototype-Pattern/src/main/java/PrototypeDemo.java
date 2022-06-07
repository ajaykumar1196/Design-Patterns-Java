public class PrototypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 10, 10);
        Rectangle rectangleClone = rectangle.clone();
    }
}
