package domain;

public class Laptop implements Gadget {
    private String brand;
    private String model;
    private Double price;

    public Laptop(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
