package Solution.Exercises.Factory;

public class Pencil extends Product {

    public Pencil(String name, int price) {
        super(name, price);
    }

    public void use() {
        System.out.println("I am a pencil and I am used to write.");
    }
}
