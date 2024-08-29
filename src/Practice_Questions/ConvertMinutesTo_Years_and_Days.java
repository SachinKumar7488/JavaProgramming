package Practice_Questions;

import java.util.Scanner;

public class ConvertMinutesTo_Years_and_Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Calculate the number of years and days
        int years = minutes / (60 * 24 * 365);  // 1 year = 60 minutes * 24 hours * 365 days
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);  // Remaining days

        // Display the result
        System.out.println(minutes + " minutes is approximately or almost " + years + " years and " + days + " days.");

        scanner.close();
    }
}
