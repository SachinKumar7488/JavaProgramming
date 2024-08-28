package Assignment6;
import java.util.Scanner;
public class Print_Char_Except_Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if (ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }

    }
}
