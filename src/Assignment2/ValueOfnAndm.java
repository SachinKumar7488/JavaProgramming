import java.util.Scanner;

public class ValueOfnAndm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of m
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        // Determine the value of n based on m
        int n;

        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        // Display the result
        System.out.println("The value of n = " + n);

        scanner.close();
    }
}