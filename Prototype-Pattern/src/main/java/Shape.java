public class Shape implements Cloneable {
    public String color;

    public Shape(Shape shape) {
        this.color = shape.color;
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public Shape clone() {
        return new Shape(this);
    }
}
