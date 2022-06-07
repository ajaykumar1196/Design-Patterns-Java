public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
