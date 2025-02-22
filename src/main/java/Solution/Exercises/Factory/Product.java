package Solution.Exercises.Factory;

public class Product {

    public static String name;
    public static int price;

    public Product(String name, int price) {
        Product.name = name;
        Product.price = price;
    }
}
