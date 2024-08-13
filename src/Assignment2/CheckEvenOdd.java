import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even integer");
        } else {
            System.out.println(number + " is an odd integer");
        }

        scanner.close();
    }
}
