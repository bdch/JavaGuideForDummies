package Solution.Exercises.School;

import java.util.List;

public class Student extends Person{

    private int studentId;
    private int averageGrade;

    private List<String> seminarsTaken;

    private boolean isEligibleToEnroll() {
        return averageGrade > 70;
    }

    private List<String> getSeminarsTaken(List<String> seminarsTaken) {
        return seminarsTaken;
    }
}
