//package Assignment1;
//
//public class AddTwoNumbers{
//    public static void main(String[]args) {
//        int a=1;
//        int b=2;
//        int sum=a+b;
//        //print the sum of a+b
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
