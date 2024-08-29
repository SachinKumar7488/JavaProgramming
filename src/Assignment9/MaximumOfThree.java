package Assignment9;

import java.util.Scanner;

public class MaximumOfThree {

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();

        // Call the findMaximum method and store the result
        int maxNumber = findMaximum(num1, num2, num3);

        // Print the maximum number
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }
}
