package Chapter_3;

class Inheritance {

    // We hava a class called Person
    class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void doJob() {
            System.out.println("I'm working");
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + name);
        }
    }

    // Here we have a class called Student that extends Person
    // That means that Student inherits all the properties and methods of Person
    // Every class can only extend one superclass
    class Student extends Person {

        String studentId;

        public Student(String name, int age, String studentId) {
            super(name, age);
            this.studentId = studentId;
        }

        // When we inherit a method from a superclass, we can override it
        @Override
        public void doJob() {
            System.out.println("I'm studying");
        }

        // We can also call the superclass method using the super keyword
        public void sayHello() {
            super.sayHello();
        }

        // We can also add new methods to the subclass
        public void sayStudentId() {
            System.out.println("My student ID is " + studentId);
        }
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        Person person = inheritance.new Person("John", 30);
        Student student = inheritance.new Student("Alice", 20, "1234");

        person.doJob(); // Output: I'm working
        person.sayHello(); // Output: Hello, my name is John

        student.doJob(); // Output: I'm studying
        student.sayHello(); // Output: Hello, my name is Alice
        student.sayStudentId(); // Output: My student ID is 1234

    }
}