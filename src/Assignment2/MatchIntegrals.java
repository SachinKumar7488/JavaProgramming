import java.util.Scanner;

public class MatchIntegrals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the 1st integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the 2nd integer: ");
        int number2 = scanner.nextInt();

        // Check if the numbers are equal
        if (number1 == number2) {
            System.out.println("Number1 and Number2 are equal");
        } else {
            System.out.println("Number1 and Number2 are not equal");
        }

        scanner.close();
    }
}