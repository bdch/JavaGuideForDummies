package Chapter_2;

class Casting {

    // What is casting?

    // Casting is the process of converting a value from one data type to another.
    // E.g. converting an int to a double, or a double to an int.
    int x = 10;
    double y = 20.5;
    double z = x; // This is an example of implicit casting. The int value is automatically converted to a double.

    // Explicit casting is when you manually convert a value from one data type to another.
    // We do this when we want to convert a larger data type to a smaller data type.

    long a = 100;
    int b = (int) a; // This is an example of explicit casting. The long value is manually converted to an int.

    public static void main(String[] args) {

        int a = 10;
        double b = 20.5;
        float c = (float) (a + b); // This is an example of implicit casting. The int value is automatically converted to a float.

        // This can be also be applied to objects.
    }

}