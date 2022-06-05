public class Product {
    private Double price;
    private String name;
    private Boolean onDiscount;

    private Product(Double price, String name, Boolean onDiscount) {
        this.price = price;
        this.name = name;
        this.onDiscount = onDiscount;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Boolean getOnDiscount() {
        return onDiscount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", onDiscount=" + onDiscount +
                '}';
    }

    public static class Builder {
        private Double price;
        private String name;
        private Boolean onDiscount;

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOnDiscount(Boolean onDiscount) {
            this.onDiscount = onDiscount;
            return this;
        }

        public Product build() {
            return new Product(price, name, onDiscount);
        }
    }
}
