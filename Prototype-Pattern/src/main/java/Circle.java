public class Circle extends Shape {
    public int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}
