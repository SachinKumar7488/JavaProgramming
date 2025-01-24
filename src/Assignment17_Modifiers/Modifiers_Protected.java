package Assignment17_Modifiers;

// superclass with a protected method
class Parent {
    // protected method
    protected void display() {
        System.out.println("this is a protected method in the parent class.");
    }
}
// subclass in the same package
class Child extends Parent {
    // method in the Child class to call the protected method
    public void callDisplay() {
        display(); // accessing the protected method from the Parent class
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.callDisplay();
    }
}

