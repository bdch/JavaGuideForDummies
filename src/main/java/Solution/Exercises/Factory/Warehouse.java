package Solution.Exercises.Factory;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Building {

    public static void perform() {
        System.out.println("I am a building and I am used to store products.");
    }

    public static List<Product> store(Product product, List<Product> products ) {
         products.add(product);
            return products;
    }
}
