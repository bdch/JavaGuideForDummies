package Chapter_1;

class Operators {

    // What is an operator?
    // An operator is a symbol that performs an operation on one or more operands.
    // E.g. 5 + 5. Here '+' is the operator and 5 and 5 are the operands.
    // Let's look at some operators:

    // This is the addition operator.
    // It adds two numbers using the '+' symbol.
    int x = 5 + 5;

    // Java has standard arithmetic operators like: +, -, *, /, and %.

    // The '%' operator is the modulus operator.
    // It returns the remainder of a division operation.
    // E.g. 5 % 2 = 1. Because 5 divided by 2 is 2 with a remainder of 1.
    // When using this, you are asking yourself the question: How many time does 2 fit into 5?
    // The answer is 2. But that makes 4. So what's left? 1.
    int y = 5 % 2; // This will return 1.
    int g = 12 % 3; // This will return 0.

    // Now let's look at the increment and decrement operators.
    // The increment operator is used to increase/decrease the value of a variable by 1.
    // It can be defined like this: ++variable or variable++. The difference is when the increment happens.
    // One is before the variable and the other is after.

    int number = 5;
    int c = number + 1; //  This would return 6.

    // This can be also written as:
    int d = ++number; // This would return 6.

    // Similarly, the decrement operator is used to decrease the value of a variable by 1.
    int number2 = 5;
    int e = number2 - 1; // This would return 4.

    //or

    int f = --number2; // This would return 4.



 }