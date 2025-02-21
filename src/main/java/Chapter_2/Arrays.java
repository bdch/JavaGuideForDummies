package Chapter_2;

class Arrays {

    // An array is a collection of elements of the same type.
    // The elements in an array are stored in contiguous memory locations.
    // The elements in an array can be accessed using an index.
    // The index of the first element in an array is 0.
    // Let's look at an example of an array in Java.

    public static void main(String[] args) {

        // Declaring an array
        int[] numbers = new int[5]; // You are creating an array of integers with a length of 5
        // It can also be initialized like this:
        // int[] numbers = {1, 2, 3, 4, 5}; Here the values are already set
        // or
        // int[] numbers = new int[] {1, 2, 3, 4, 5};

        // Initializing an array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Accessing an element in an array
        System.out.println(numbers[0]); // Output: 1
        System.out.println(numbers[1]); // Output: 2
        System.out.println(numbers[2]); // Output: 3
        System.out.println(numbers[3]); // Output: 4
        System.out.println(numbers[4]); // Output: 5

        // It is very common to use a loop to iterate over an array.
        // Iterating over an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         // The first iteration goes like this:
        // i = 0, the value stored at position 0 is 1, numbers[0] = 1
        // The second iteration goes like this:
        // i = 1, the value stored at position 1 is 2, numbers[1] = 2
        // And so on...
    }

}