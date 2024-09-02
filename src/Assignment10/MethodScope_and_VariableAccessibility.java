package Assignment10;

 public class MethodScope_and_VariableAccessibility {

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        // int errorCheck = result; // This will cause a compile-time error
        return a + b;
    }

    public static void main(String[] args) {
        MethodScope_and_VariableAccessibility operations = new MethodScope_and_VariableAccessibility();

        int result = operations.sum(5, 7);
        System.out.println("Sum: " + result);

        // Calling the multiply method
        int product = operations.multiply(3, 4);
        System.out.println("Product: " + product);
    }
}
