package Strings;

import java.util.Scanner;

public class String_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter the first string
        System.out.print("Enter the first String: ");
        String string1 = scanner.nextLine();

        // enter the 2nd string to compare both
        System.out.print("Enter the 2nd string: ");
        String string2 = scanner.nextLine();

        // comparing the two strings
        if (string1.equals(string2)) {
            System.out.println("Strings are identical");
        } else {
            System.out.println("Strings are not identical");
        }

        scanner.close();

    }
}
