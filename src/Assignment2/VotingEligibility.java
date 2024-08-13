import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("Congratulation! You are eligible for casting your vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
        }

        scanner.close();
    }
}