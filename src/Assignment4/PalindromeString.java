import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Plaindrome String: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The String is a Palindrome. ");
        } else {
            System.out.println("The string is not a Palindrome. ");
        }
    }

        public static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll(" "," ");
        String reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse);


    }
}
