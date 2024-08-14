import java.util.Scanner;
public class SumOfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // initialize sum to 0

        System.out.println("Enter a Number (0 to terminate):");
        int input = scanner.nextInt();

        while (input != 0) {
            if (input > 0) { // add only positive integers to the sum
                sum += input;
            }
            input = scanner.nextInt();
        }

        System.out.println("Sum of positive integers: " + sum);
    }
}