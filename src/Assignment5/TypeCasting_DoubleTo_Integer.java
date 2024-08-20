import java.util.Scanner;

public class TypeCasting_DoubleTo_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the (double) Number : ");
        double doubleNum = scanner.nextDouble();

        int intNum = (int) doubleNum;

        System.out.println("The integer value is " +intNum);
    }
}