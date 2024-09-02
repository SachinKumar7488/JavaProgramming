package Assignment11;

import java.util.Scanner;
public class Recursive_FibonacciSequence {

     public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                // Calculate the nth Fibonacci number using recursion
                int result = fibonacci(n);
                // Print the result
                System.out.println("The " + n + "th Fibonacci number is: " + result);
            }

            scanner.close();
        }
    }
