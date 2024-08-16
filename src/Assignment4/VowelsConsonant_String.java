import java.util.Scanner;

public class VowelsConsonant_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");  //take input
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
       //Conditon for checking No. of vowels and consonants
        for (int i=0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                        ch == 'u'){
                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }

        }
        System.out.println("Number of vowels : " +vowelCount);
        System.out.println("Number of consonants : " +consonantCount);
    }
}










//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//
//        int vowelCount = 0;
//        int consonantCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (Character.isLetter(ch)) {
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//
//        System.out.println("Number of vowels: " + vowelCount);
//        System.out.println("Number of consonants: " + consonantCount);
//    }
//}