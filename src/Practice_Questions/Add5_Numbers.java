package Practice_Questions;

import java.util.Scanner;

public class Add5_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        // Add 5 to the input number
        int result = number + 5;

        // Printing the result
        System.out.println("Result after adding 5: " + result);

        scanner.close();
    }
}
