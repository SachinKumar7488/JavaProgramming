package Assignment15;

class Rectangle_Dimensions {
    private double length;
    private double width;

    //default constructor
    public Rectangle_Dimensions() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //parameterized constructor
    public Rectangle_Dimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //method to calculate area
    public double calculateArea() {
        return length * width;  // formula to calculate area
    }

    //method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);   //formula to calculate perimeter
    }

    //method to display rectangle details
    public void displayDetails() {
        System.out.println("Length: " + length); //printing the length of the rectangle
        System.out.println("Width: " + width); //printing the width of the rectangle
        System.out.println("Area: " + calculateArea()); //printing the area of the rectangle
        System.out.println("Perimeter: " + calculatePerimeter()); //printing the perimeter of the rectangle
    }
}

// Main.java
 class Main {
    public static void main(String[] args) {
        //rectangle using the default constructor
        Rectangle_Dimensions defaultRectangle = new Rectangle_Dimensions();
        System.out.println("Default Rectangle:");  // printing the default rectangle
        defaultRectangle.displayDetails();

        System.out.println();

        //rectangle using the parameterized constructor
        Rectangle_Dimensions parameterizedRectangle = new Rectangle_Dimensions(17, 2);
        System.out.println("Parameterized Rectangle:");  // printing the parameterized rectangle
        parameterizedRectangle.displayDetails();
    }
}

