package Chapter_2;

class Methods {

    // What is a method?
    // A method is a block of code that performs a specific task.
    // It is used to achieve code reusability and modularity.
    // A method can be called multiple times to execute its code.
    // A standard method looks like this:


    // Here is an example of a method:
    // The signature of a method consists of the access modifier, return type, method name, and parameters.
     void doStuff() {
        // code to be executed
    }

    // Let's look at more examples of methods:
    // This method takes two parameters and returns the sum of the two numbers.
    // A method can have a return type, which is the data type of the value returned by the method.
    // It can also have parameters, which are the values passed to the method when it is called.
    public static int add(int a, int b) {
        return a + b;
    }

    // More examples
    int[] func(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        return new int[]{sum, diff};
    }

    boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}