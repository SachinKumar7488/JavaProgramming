import java.util.Scanner;
public class CalculateFactorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a positive integer:");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Error: Input must be a positive integer.");
                return;
            }

            int factorial = 1; // initialize factorial variable to 1

            int i = 1; // start from 1
            while (i <= number) {
                factorial *= i; // multiply factorial by each number down to 1
                i++;
            }

            System.out.println("Factorial of " + number + ": " + factorial);
        }
    }
