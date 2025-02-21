package Chapter_1;

class Variables {

    // What is a variable?
    // A variable is a container that holds a value.
    // e.g. int x = 5;
    // Here the variable 'x' holds the value 5.
    // Using '=' is called the assignment operator.
    // The value on the right side of the assignment operator is assigned to the variable on the left side.
    // There is more:

    // This assigns a String to the variable 's'.
    // A String is a sequence of characters.
    // A String is enclosed in double quotes.
    String s = "bla bla";

    // This is a character variable.
    // A character is a single letter, digit, or special character, like 'a', '1', or '@'.
    // A character is enclosed in single quotes.
    Character c = 'a';

    // This is an integer variable.
    // An integer is a whole number.
    // An integer can be positive or negative.
    // An integer can be of different sizes.
    // It holds a 32-bit integer, aka numbers from -2^32 to 2^32 - 1.
    // Assigning a number outside this range will cause an error.
    int x = 5;

    // This is a double variable.
    // A double is a floating-point number.
    // A double can be positive or negative.
    // The range is from 2^64 to 2^64 - 1.
    // Going outside this range will also cause an error.
    double y = 5.5;

    // This is a float variable.
    // A float is a floating-point number.
    // The difference between a float and a double is the size.
    // The range of a float is from 2^32 to 2^32 - 1.
    float z = 5.5f;

    // This is a long variable.
    // It's like an integer but with a larger range.
    // Why use 'L' at the end?
    // It's to tell the compiler that this is a long number, but it's not necessary.
    // The range of a long is from -2^64 to 2^64 - 1.
    long l = 5L;

    // This is a boolean variable.
    // A boolean is a true or false value.
    boolean b = true;
    boolean b2 = false;

    // That's it for primitive data types. Go to the next chapter

}