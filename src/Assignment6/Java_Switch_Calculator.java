import java.util.Scanner;
public class Java_Switch_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+,-,*,/) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number : ");
        double num2 = scanner.nextDouble();

        double result;    //Initialize result.

        //using the switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;

                } else {
                    System.out.println("Error : Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error : Invalid operator");
                return;
        }
        System.out.printf("The result of %.2f %c %.2f is %.2f%n", num1, operator, num2, result);
        scanner.close();

    }
}