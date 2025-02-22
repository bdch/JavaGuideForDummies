package Solution.Exercises;

public class LookForCommonCharacter {

    public static boolean containsChar(String str, char c) {
        return str.contains(String.valueOf(c));
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        char c = 'o';
        System.out.println(containsChar(str, c));
    }


}
