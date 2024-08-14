import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateNo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<Integer> uniqueNumbers = new HashSet<>();

            System.out.println("Enter a series of numbers (0 to terminate):");
            while (true) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (!uniqueNumbers.add(number)) { // check if number is already in the set
                    System.out.println("Duplicate number found: " + number);
                    break;
                }
            }

            System.out.println("No duplicates found.");
        }
    }
