package Chapter_3;

class AccessModifiers {

    // Access Modifiers.
    // Different access modifiers are used to restrict access to classes, methods, and variables.
    // Let's look at an example and add access modifiers to it.

    // 1. private: The code is only accessible within the same class.
    private int privateVar = 10;

    // 2. default: The code is only accessible within the same package. Also, accessible in subclasses.
    protected String foo = "foo";

    // 3. public: The code is accessible from any other class.
    public int publicVar = 20;

    // 4. default: The code is only accessible within the same package.
    int defaultVar = 30;

}


class Hi extends AccessModifiers{

    // int a = privateVar; // Compilation error: privateVar has private access in AccessModifiers
    String bar = foo; // No compilation error
    int b = publicVar; // No compilation error
    int c = defaultVar; // No compilation error
}