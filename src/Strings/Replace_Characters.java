package Strings;

import java.util.Scanner;

public class Replace_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Enter a string for the character to be replaced
        System.out.print("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);

        // enter the new character
        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        // replace all occurrences of the specified character
        String resultString = inputString.replace(charToReplace, newChar);

        System.out.println("Output: " + resultString);

        scanner.close();

    }
}
