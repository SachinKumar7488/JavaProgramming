import java.util.Scanner;

public class JavaMath_SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        Double Number = scanner.nextDouble();

        double squareRoot = Math.sqrt(Number);
        System.out.println("The square root of " + Number + " is " + squareRoot);
    }
}
