package Strings;

import java.util.Scanner;

public class Count_Specific_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the String
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        //enter the string for character to count
        System.out.print("Enter the character to count: ");
        char characterToCount = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == characterToCount) {
                count++;
            }
        }
        System.out.println("character '" + characterToCount + "' comes " + count + " times.");

        scanner.close();
    }
}
