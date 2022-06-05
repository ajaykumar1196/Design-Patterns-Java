public class BuilderDemo {
    public static void main(String[] args) {
        Product.Builder builder = new Product.Builder();
        builder.setName("iPhone").setPrice(59999.0).setOnDiscount(true);
        Product iPhone = builder.build();
        System.out.println(iPhone);
    }
}
