package Chapter_2;

import java.util.Scanner; // import the Scanner class

class  UserInput {

    // In order to take input from the user, we first need to import the Scanner class.
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        
        // Read user input
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}