package Solution.Exercises.Factory;


import java.util.ArrayList;
import java.util.List;

public class HQ implements Building {

    public static void perform() {
        System.out.println("I am a building and I am used to live in.");
    }

  public int sell(List<Product> products, int amountToBeSold) throws Exception {
        if(amountToBeSold == 0) {
            throw new Exception("Amount to be sold cannot be 0.");
        }
      int price = 0;

        for (int i = 0; i < amountToBeSold; i++) {
            price = Product.price;
        }
        return price;
  }
    public static void main(String[] args) throws Exception {

        Pencil pencil;
        List<Product> products = new ArrayList<>();

       while(products.size() < 10) {
           pencil = PencilFactory.createPencil();
           Warehouse.store(pencil, products);
       }

        assert products.size() == 10;
        System.out.println("Pencils stored in the warehouse: " + products.size()); // Expected output: 10

        HQ hq = new HQ();
        hq.sell(products, 5);
        assert products.size() == 5;
        System.out.println("Pencils stored in the warehouse after selling 5 pencils: " + products.size()); // Expected output: 5
        int profit = hq.sell(products, 5);
        assert profit == 25;
        System.out.println("Profit after selling 5 pencils: " + profit); // Expected output: 25

    }
}
