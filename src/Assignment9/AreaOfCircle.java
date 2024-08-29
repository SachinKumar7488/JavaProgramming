package Assignment9;

import java.util.Scanner;

public class AreaOfCircle {

    // to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Call the calculateArea method and store the result
        double area = calculateArea(radius);

        // Print the calculated area
        System.out.println("The area of the circle is: " + area);
    }
}

