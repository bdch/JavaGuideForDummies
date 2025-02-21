package Solution.Levels;

public class Level_3 {

    public static void main(String[] args) {
        // Create an array
        int[] array = {1, 2, 3, 4, 5};
        // Create a variable called 'sum' and assign it
        int sum = 0;
        // Iterate through the array and calculate the sum of all the elements in the array
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        //This can also be done using the enhanced for loop
        // for (int i : array) {

        // Output 'true' if the sum of said calculated array is greater than 10, and 'false' if it is less than 10
        if (sum > 10) {
            System.out.println("true");
        }
        System.out.println("false");
    }
}
