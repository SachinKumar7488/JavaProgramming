package Strings;

import java.util.Scanner;

public class Trimming_WhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();

        //trimming whitespace
        System.out.print(sentence.trim());
    }
}
