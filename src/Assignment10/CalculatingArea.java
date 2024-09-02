package Assignment10;
//Overloading for Calculating Areas

import java.util.Scanner;

public class CalculatingArea {
    //Calculate the area of a circle
    public static double CalculatingAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate the area of a rectangle
    public static double CalculatingAreaRectangle(double length, double width) {
        return length * width;
    }

    // Calculate the area of a triangle
    public static double CalculatingAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        double area = 0;

        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = CalculatingAreaCircle(radius);
        } else if (choice == 2) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            area = CalculatingAreaRectangle(length, width);
        } else if (choice == 3) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            area = CalculatingAreaTriangle(base, height);
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        System.out.println("The area is: " + area);
        scanner.close();
    }
}
