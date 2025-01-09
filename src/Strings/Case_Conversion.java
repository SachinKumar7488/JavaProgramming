package Strings;

import java.util.Scanner;

public class Case_Conversion {
    public static void main(String[] args) {
        //scanner object for read user input
        Scanner scanner = new Scanner(System.in);

        // enter a string
        System.out.print("Enter the string : ");
        String inputString = scanner.nextLine();

        // condition to convert characters from lowercase to uppercase
        for(char c : inputString.toCharArray()){
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));

            }else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
