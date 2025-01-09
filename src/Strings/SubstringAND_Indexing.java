package Strings;

import java.util.Scanner;

public class SubstringAND_Indexing {
    public static void main(String[] args) {
        //scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        //enter a string
        System.out.print("enter the string: ");
        String inputString = scanner.nextLine();

        //enter the starting string
        System.out.print("Enter the starting index (n): ");
        int startIndex = scanner.nextInt();

        String substring = inputString.substring(startIndex);

        // Display the result
        System.out.println("Extracted Substring: " + substring);

        scanner.close();

    }
}