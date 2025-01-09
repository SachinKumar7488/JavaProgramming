package Strings;

import java.util.Scanner;

public class Find_CharacterIN_String {
    public static void main(String[] args) {

        //scanner class
        Scanner scanner = new Scanner(System.in);
        //enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // enter a string for the character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // find the index of the first occurrence of the character
        int index = inputString.indexOf(searchChar);

        System.out.println("Index: " + index);

        scanner.close();
    }
}
