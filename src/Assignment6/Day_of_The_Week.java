package Assignment6;
import java.util.Scanner;
public class Day_of_The_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number between 1-7 : ");
        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber){
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thrusday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid number. Please enter number between 1-7. ";
        }

        System.out.println("dayName :"  + dayName);
        scanner.close();
    }

}
















//import java.util.Scanner;
//
//public class DayOfTheWeek {
//    public static void main(String[] args) {
//        // Create a Scanner object for user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter an integer between 1 and 7
//        System.out.print("Enter a number between 1 and 7: ");
//        int dayNumber = scanner.nextInt();
//
//        // Initialize a variable to hold the day of the week
//        String dayName;
//
//        // Use a switch statement to determine the day of the week
//        switch (dayNumber) {
//            case 1:
//                dayName = "Monday";
//                break;
//            case 2:
//                dayName = "Tuesday";
//                break;
//            case 3:
//                dayName = "Wednesday";
//                break;
//            case 4:
//                dayName = "Thursday";
//                break;
//            case 5:
//                dayName = "Friday";
//                break;
//            case 6:
//                dayName = "Saturday";
//                break;
//            case 7:
//                dayName = "Sunday";
//                break;
//            default:
//                dayName = "Invalid day number. Please enter a number between 1 and 7.";
//                break;
//        }
//
//        // Print the day of the week or an error message
//        System.out.println(dayName);
//
//        // Close the scanner
//        scanner.close();
//    }
//}
