import java.util.Scanner;
public class JavaBoolean_NoIsGreaterThan_100 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            boolean isGreater = num > 100;

            if (isGreater) {
                System.out.println("The number is greater than 100.");
            } else {
                System.out.println("The number is not greater than 100.");
            }
        }
    }
