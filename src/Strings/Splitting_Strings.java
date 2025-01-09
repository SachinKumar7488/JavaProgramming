package Strings;

import java.util.*;

public class Splitting_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter the string with comma: ");
        String input = scanner.nextLine();

//         split the string into an array based on commas
        String[] result = input.split(",");

        // Start the output with the opening bracket
        String output = "[";

        // Loop through the array and add quotes around each word
        for (int i = 0; i < result.length; i++) {
            output += "\"" + result[i] + "\""; // Add quotes around each element

            if (i < result.length - 1) {
                output += ", "; // Add a comma and space between elements
            }
        }

        // Close the output with the closing bracket
        output += "]";

        // Print the result
        System.out.println(output);

        // Close the scanner to avoid resource leak
        scanner.close();


//        String[] result = inputString.split(",");
//        System.out.println(Arrays.toString(result));
    }
}
