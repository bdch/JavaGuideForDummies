package Solution.Exercises;

public class ArraysExercise {

    //  Find the greatest and smallest number in an array

  public int findGreatest(int[] arr) {
    int greatest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > greatest) {
        greatest = arr[i];
      }
    }
    return greatest;
  }

  public int findSmallest(int[] arr) {
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    ArraysExercise ae = new ArraysExercise();
    System.out.println(ae.findGreatest(arr));

    System.out.println(ae.findSmallest(arr));
  }
}
