package Assignment13;
import java.util.Scanner;

class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price); // Use setter to validate price
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative. Setting price to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

public class CarAttributes_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create multiple car objects with user input
        System.out.print("Enter the number of cars: ");
        int numberOfCars = scanner.nextInt();
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("\nEnter details for Car " + (i + 1));

            System.out.print("Enter make: ");
            String make = scanner.next();

            System.out.print("Enter model: ");
            String model = scanner.next();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            cars[i] = new Car(make, model, year, price);
        }

        // Display all cars' details
        System.out.println("\nCar Information:");
        for (Car car : cars) {
            car.displayCarDetails();
        }

        // Modify a car's attributes (Test Case 1)
        System.out.println("Modifying details of first car...");
        System.out.print("Enter new year: ");
        cars[0].setYear(scanner.nextInt());

        System.out.print("Enter new price: ");
        cars[0].setPrice(scanner.nextDouble());

        cars[0].displayCarDetails();

        // Test Case 2: Setting a negative price
        System.out.println("Attempting to set a negative price for the first car...");
        cars[0].setPrice(-5000);
        cars[0].displayCarDetails();

        // Test Case 3: Display car without modification
        System.out.println("Displaying the second car without modification...");
        if (numberOfCars > 1) {
            cars[1].displayCarDetails();
        } else {
            System.out.println("Only one car was entered.");
        }

        scanner.close();
    }
}