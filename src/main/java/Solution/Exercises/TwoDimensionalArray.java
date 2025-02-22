package Solution.Exercises;

import java.lang.reflect.Array;

public class TwoDimensionalArray {

    public int sumOfTwoDimensionalArray(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public void fillTwoDimensionalArray(int[][] arr, int i, int j) {
       for (int row = 0; row < i; row++) {
           for (int col = 0; col < j; col++) {
               arr[row][col] = (int) (Math.random() * 100);
           }
       }
    }

    public static void main(String[] args) {

        int[][] arr = new int[4][5]; // 4 rows, 5 columns
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.fillTwoDimensionalArray(arr, 4, 5);
        System.out.println(twoDimensionalArray.sumOfTwoDimensionalArray(arr)); // 0-100 * 4 * 5


    }
}
