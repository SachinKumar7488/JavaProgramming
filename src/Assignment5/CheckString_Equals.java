import java.util.Scanner;
public class CheckString_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string : ");
        String str2 = scanner.nextLine();

        boolean areEqual = str1.equals(str2);

        if (areEqual) {
            System.out.println("The string is equal.");
        } else {
            System.out.println("The string is not equal.");
        }
    }
}