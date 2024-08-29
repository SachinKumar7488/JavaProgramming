import java.util.Scanner;

public class CountNo_Without7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= limit; i++) {
            String number = Integer.toString(i);
            // Check if the number does not contain the digit '7'
            if (!number.contains("7")) {
                count++;
            }
        }

        System.out.println("Count of numbers without digit '7' from 1 to " + limit + " is: " + count);

        scanner.close();
    }
}
