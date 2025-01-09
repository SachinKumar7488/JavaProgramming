package Strings;

import java.util.Scanner;

public class Character_Extraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        //using loop to iterate the problem
        for (int i = 0; i < inputString.length(); i += 2){
            System.out.print(inputString.charAt(i));
        }
    }
}
