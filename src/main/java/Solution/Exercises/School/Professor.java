package Solution.Exercises.School;

import java.util.ArrayList;

public class Professor extends Person {

    private int salary;

    private void teach() {
        System.out.println("Teaching...");
    }

    private void subjects(ArrayList<String> subjects) {
        System.out.println("Subjects: " + subjects);
    }
}
