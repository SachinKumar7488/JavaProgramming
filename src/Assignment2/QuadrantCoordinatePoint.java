import java.util.Scanner;

public class QuadrantCoordinatePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the coordinate point (x, y)
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        // Determine the quadrant based on the signs of x and y
        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the Y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the X-axis.");
        } else {
            System.out.println("The coordinate point (" + x + "," + y + ") is at the Origin.");
        }

        scanner.close();
    }
}

