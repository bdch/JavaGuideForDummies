package Solution.Exercises.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RulerFactory extends Product implements Building {

    private static int amount;

    public RulerFactory(String name, int amount) {
        super(name, price);
    }

    public static Ruler createRuler() {
        return new Ruler("Ruler", 10);
    }

    public static void setAmount(int amount) {
        RulerFactory.amount = amount;
    }

    public static List<Ruler> getRuler(int amount) {
        return new ArrayList<>(Collections.nCopies(amount, new Ruler("Ruler", 10)));
    }

    public static int getAmount() {
        return amount;
    }
}
