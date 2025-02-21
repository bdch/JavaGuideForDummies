package Chapter_3;

class ClassAndObject {

    // What is a class?
    // A class is a blueprint for creating objects. It defines the properties and behaviors of objects.
    // E.g. a Car class can have properties like color, make, model, and behaviors like drive, stop, honk.

    // Here is an example of a Car class:
    class Car {

        // This is a constructor. It is a special method that is called when an object is created.
        public Car(String color, String make, String model) {
            this.color = color;
            this.make = make;
            this.model = model;
        }

        // When no constructor is defined, Java provides a default constructor.
        // E.g. Car() {}

        // It has properties like color, make, model.
        String color;
        String make;
        String model;

        // It has behaviors like drive, stop, honk.
        void drive() {
            System.out.println("The car is driving.");
        }

        void stop() {
            System.out.println("The car has stopped.");
        }

        void honk() {
            System.out.println("The car is honking.");
        }
    }
    public static void main(String[] args) {


    }
}