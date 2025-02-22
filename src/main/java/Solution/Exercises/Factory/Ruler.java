package Solution.Exercises.Factory;

public class Ruler extends Product {

    public Ruler(String name, int price) {
        super(name, price);
    }

    public void use() {
        System.out.println("I am a ruler and I am used to draw straight lines.");
    }
}
