import java.util.Scanner;

public class Concat_Multiple_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the firsrt word : ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter the second word : ");
        String secondWord = scanner.nextLine();

        System.out.print("Enter the third word : ");
        String thirdWord = scanner.nextLine();

        String sentence = firstWord + " " + secondWord + " " + thirdWord;

        System.out.println("Your sentence is: " + sentence);
    }
}