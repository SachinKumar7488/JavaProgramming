import java.util.Scanner;

public class PersonHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the height
        System.out.print("Enter the height in centimeters: ");
        double height = scanner.nextDouble();

        // Categorize based on height
        String category;

        if (height < 150) {
            category = "Dwarf";
        } else if (height >= 150 && height <= 165) {
            category = "Average height";
        } else {
            category = "Tall";
        }

        // Display the result
        System.out.println("The person is " + category + ".");

        scanner.close();
    }
}
