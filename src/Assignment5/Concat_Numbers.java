import java.util.Scanner;

public class Concat_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second Number : ");
        String num2 = scanner.nextLine();

        String result = num1 + num2;

        System.out.println("The Concatenate Number is : " +result);
    }
}
