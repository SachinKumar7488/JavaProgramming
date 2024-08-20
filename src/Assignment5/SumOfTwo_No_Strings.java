import java.util.Scanner;

public class SumOfTwo_No_Strings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            String num1 = scanner.nextLine();

            System.out.print("Enter the second number: ");
            String num2 = scanner.nextLine();

            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

            System.out.println("The sum of the two numbers is: " + sum);
        }
    }
