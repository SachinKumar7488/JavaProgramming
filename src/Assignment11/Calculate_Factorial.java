package Assignment11;

import java.util.Scanner;
public class Calculate_Factorial {
        public static int factorial(int n) {
            // Base case: factorial(0) = 1
            if (n == 0) {
                return 1;
            } else {
                // Recursive case: n * factorial(n - 1)
                return n * factorial(n - 1);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int result = factorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }

            scanner.close();
        }
    }
