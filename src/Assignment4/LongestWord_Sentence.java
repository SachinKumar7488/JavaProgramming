import java.util.Scanner;

public class LongestWord_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sentence : ");
        String input = scanner.nextLine();

        String[] words = input.split( " ");
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is : " +longestWord);

    }
}





















//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String input = scanner.nextLine();
//
//        String[] words = input.split(" ");
//        String longestWord = words[0];
//
//        for (int i = 1; i < words.length; i++) {
//            if (words[i].length() > longestWord.length()) {
//                longestWord = words[i];
//            }
//        }
//
//        System.out.println("The longest word is: " + longestWord);
//    }
//}