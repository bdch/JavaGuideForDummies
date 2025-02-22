package Solution.Exercises.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PencilFactory extends Product implements Building {

    private static int amount;

    public PencilFactory(String name, int amount) {
        super(name, price);
    }

    public static void setAmount(int amount) {
        PencilFactory.amount = amount;
    }

    public static List<Pencil> getPencil(int amount) {
        return new ArrayList<>(Collections.nCopies(amount, new Pencil("Pencil", 5)));
    }

    public static int getAmount() {
        return amount;
    }

    public static Pencil createPencil() {
        return new Pencil("Pencil", 5);
    }
}
