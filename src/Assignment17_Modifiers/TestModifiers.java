public class TestModifiers {

    public static void main(String[] args) {
        // create an instance of MyClass
        MyClass myClass = new MyClass();

        // access the public method (this should work fine)
        myClass.publicMethod();

        // attempt to access the private method this will cause a compile-time error
//         myClass.privateMethod();  // Error: privateMethod() has private access in MyClass
    }
}

class MyClass {

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
