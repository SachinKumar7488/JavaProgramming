package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

//vehicle class
class Vehicle{
    private String make;
    private String model;
    private int year;
    //constructor
    public Vehicle(String make, String model, int year){

        this.make=make;
        this.model=model;
        this.year=year;

    }
    //getter method to return the value of attribute
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    //using override method (it call the method of superclass in baseclass)
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}
//owner class
class Owner{
    private String name;
    private String address;
    private ArrayList<Vehicle>vehicles;
    //constructor
    public Owner(String name, String address){
        this.name=name;
        this.address=address;
        this.vehicles=new ArrayList<>();
    }
//method to add vehicle
public void addVehicle(Vehicle vehicle){
        if (vehicle != null){
            vehicles.add(vehicle);
            System.out.println("vehicles added successfully");
        }else {
            System.out.println("invalid vehicle details");
        }
    }
//method to remove vehicle from the list
    public void removeVehicle(int index) {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.remove(index);
            System.out.println("vehicle removed successfully");
        } else {
            System.out.println("invalid index");
        }
    }
//method to display vehicle owner details
    public void displayOwnerDetails(){
        System.out.println("owner name"+name);
        System.out.println("owner address"+address);
        if (vehicles.isEmpty()){
            System.out.println("no vehicles found");
        }else {
            System.out.println("vehicles owned");
            for (int i=0; i< vehicles.size(); i++){
                System.out.println((i+1)+"."+vehicles.get(i));
            }
        }
    }
}
//main class
public class VehicleAndOwner_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //enter the owner details
        System.out.println("Enter owner name: ");
        String name = scanner.nextLine();
        System.out.println("Enter owner address:  ");
        String address = scanner.nextLine();
        Owner owner = new Owner(name,address);

        boolean ContinueProgram=true;
        while (ContinueProgram){
            System.out.println("\n1.Add vehicle");
            System.out.println("2.Remove vehicle");
            System.out.println("3.Display owner details");
            System.out.println("4.exit");
            System.out.print("choose an option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // add vehicle
                    System.out.print("Enter vehicle make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter vehicle year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    if (make.isEmpty() || model.isEmpty() || year <= 0) {
                        System.out.println("incomplete vehicle details. please try again.");
                    } else {
                        Vehicle vehicle = new Vehicle(make, model, year);
                        owner.addVehicle(vehicle);
                    }
                    break;
                case 2:
                    // remove vehicle
                    owner.displayOwnerDetails();
                    System.out.print("enter the number of the vehicle to remove: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();
                    owner.removeVehicle(index);
                    break;
                case 3:
                    // display owner details
                    owner.displayOwnerDetails();
                    break;
                case 4:
                    // exit
                    ContinueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
