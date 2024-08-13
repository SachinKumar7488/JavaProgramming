import java.util.Scanner;

public class LargestOfThreeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();


        // Using nested if-else statements
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("1st Number = " + num1 + ", 2nd Number = " + num2 + ", 3rd Number = " + num3);
                System.out.println("The largest number is: " + largest);
    }
}
