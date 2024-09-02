package Assignment11;

import java.util.Scanner;
public class Recursive_SumOfDigits {

     public static int sumOfDigits(int n) {
            if (n == 0) {
                return 0;
            } else {
                // Recursive case: sum the last digit (n % 10) and the sum of digits of the rest of the number (n / 10)
                return (n % 10) + sumOfDigits(n / 10);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                number = Math.abs(number);
            }

            int result = sumOfDigits(number);

            // Print the result
            System.out.println("The sum of the digits of " + number + " is: " + result);

            scanner.close();
        }
    }
