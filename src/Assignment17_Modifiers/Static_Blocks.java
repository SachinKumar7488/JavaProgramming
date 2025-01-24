package Assignment17_Modifiers;

class InitializationClass {
    static int value;

    // static block
    static {
        System.out.println("static blocks...........................");
        value = 42;
    }

    // static method to display the static variable
    static void displayValue() {
        System.out.println("value initialized in static block: " + value);
    }
}

public class Static_Blocks {
    public static void main(String[] args) {
//        System.out.println("main method starts");

        InitializationClass.displayValue();
    }
}
