package Chapter_2;


class Loops {

    // Loops are used to execute a block of code repeatedly.
    // There are three types of loops in Java:


    // It uses an index i to iterate over a block of code.
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

    // It uses a condition to iterate over a block of code.
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("Hello world!");
            i++;
        }

    // It uses a condition to iterate over a block of code. Here the block of code is executed at least once.
        // do-while loop
        i = 0;
        do {
            System.out.println("Hello world!");
            i++;
        } while (i < 5);
    }

}