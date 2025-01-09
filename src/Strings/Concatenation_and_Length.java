package Strings;

import java.util.Scanner;

public class Concatenation_and_Length {
    public static void main(String[] args) {
        //create a scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        //taking the first string from users
        System.out.print("write the first string: ");
        String string1 = scanner.nextLine();

        //taking the 2nd string from users
        System.out.print("write the 2nd string: ");
        String string2 = scanner.nextLine();

        //concatenate the strings
        String concatenatedString = string1 + string2;

        //now we'll calculate the length of the string
        int lengthOfConcatenatedString = concatenatedString.length();

        //display the final result
        System.out.println("Concatenated String: " + concatenatedString + ", Length: " + lengthOfConcatenatedString);

        scanner.close();

    }
}