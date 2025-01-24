package Assignment17_Modifiers;

public class Final_with_Variables {

        public static void main(String[] args) {
            // Declare a final variable
            final int CONSTANT = 10;

            // Print the value of the final variable
            System.out.println("initial value of CONSTANT: " + CONSTANT);

            // this will cause a compile-time error
//             CONSTANT = 20;

            System.out.println("attempt to modify CONSTANT would cause an error.");
        }
    }

