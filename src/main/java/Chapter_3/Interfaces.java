package Chapter_3;


// This is an interface
// It only contains method signatures with NO implementation

public interface Interfaces {

    void method1();

    String method2();

    boolean method3();

    // Since Java 8, interfaces can have default methods
    // This is a method with a default implementation
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

}

// Here we implement the interface
class A implements Interfaces {

    // Using the @Override annotation to make sure we are overriding the method
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public String method2() {
        return "Method 2";
    }

    @Override
    public boolean method3() {
        return true;
    }

    public static void main(String[] args) {
        A a = new A();
        a.method1();
        System.out.println(a.method2());
        System.out.println(a.method3());
        a.defaultMethod();
    }
}
