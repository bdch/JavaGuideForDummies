package Chapter_2;

class ControlFlow {

    // Now, let's add some control flow to the program.
    // By control flow, we mean the ability to make decisions in the program.
    // Certain parts of the program will only run if certain conditions are met.
    // Let's look at the example below:

    public static void main(String[] args) {

        // Here we have two variables, x and y, both of type int.
        // The condition in the if statement checks if x is less than y.
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }

        // If-Statements can be chained together using else if like this:
        if (x < y) {
            System.out.println("x is less than y");
        } else if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is greater than y");
        }

        // Switch statements are another way to add control flow to your program.
        // They are used to select one of many code blocks to be executed.
        // The switch statement evaluates an expression, then compares the value of that expression to the values in each case.
        // Here is an example of a switch statement:
        // It checks the value of x and prints a message based on the value of x.
        switch (x) {
            case 10:
                System.out.println("x is 10");
                break; // The break statement is used to exit the switch statement immediately.
            case 20:
                System.out.println("x is 20");
                break;
            default:
                System.out.println("x is neither 10 nor 20");
        }
    }
}