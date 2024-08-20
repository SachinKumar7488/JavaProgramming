import java.util.Scanner;

public class ConcatFirst_Last_Name {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            //Printing Name by using + Operator
            String fullName = firstName + " " + lastName;

            //Printing Name using String Concat Method
            //String fullName = firstName.concat(" ").concat(lastName);

            System.out.println("Your full name is: " + fullName);
        }
    }
