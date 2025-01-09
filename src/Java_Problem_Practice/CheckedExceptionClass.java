//package Java_Problem_Practice;
//
//// Address.java
//class Address {
//    private String village;
//    private String postOffice;
//    private String policeStation;
//    private String district;
//    private String state;
//
//    public Address(String village, String postOffice, String policeStation, String district, String state) {
//        this.village = village;
//        this.postOffice = postOffice;
//        this.policeStation = policeStation;
//        this.district = district;
//        this.state = state;
//    }
//
//    public String toUpperCase() {
//        return String.format(
//                "Village: %s, Post Office: %s, Police Station: %s, District: %s, State: %s",
//                village.toUpperCase(), postOffice.toUpperCase(), policeStation.toUpperCase(), district.toUpperCase(), state.toUpperCase()
//        );
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//                "Village: %s, Post Office: %s, Police Station: %s, District: %s, State: %s",
//                village, postOffice, policeStation, district, state
//        );
//    }
//}
//
//// Custom exception class
//class NullAddressException extends Exception {
//    public NullAddressException(String message) {
//        super(message);
//    }
//}
//
//// Student.java
//class Student {
//    private String name;
//    private int rollNo;
//    private String batch;
//    private double marks;
//    private Address address;
//
//    public Student(String name, int rollNo, String batch, double marks, Address address) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.batch = batch;
//        this.marks = marks;
//        this.address = address;
//    }
//
//    public void displayDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Batch: " + batch);
//        System.out.println("Marks: " + marks);
//        if (address != null) {
//            System.out.println("Address: " + address);
//        } else {
//            System.out.println("Address: null");
//        }
//    }
//
//    public void displayAddressUppercase() throws NullAddressException {
//        if (address == null) {
//            throw new NullAddressException("Address is null! Cannot convert to uppercase.");
//        } else {
//            System.out.println(address.toUpperCase());
//        }
//    }
//}
//
//// Main.java
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create Address objects
//        Address address1 = new Address("Village1", "PO1", "PS1", "District1", "State1");
//        Address address2 = new Address("Village2", "PO2", "PS2", "District2", "State2");
//        Address address3 = new Address("Village3", "PO3", "PS3", "District3", "State3");
//        Address address4 = null; // Address is null to trigger exception
//        Address address5 = new Address("Village5", "PO5", "PS5", "District5", "State5");
//
//        // Create Student objects
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Alice", 101, "BatchA", 85.5, address1));
//        students.add(new Student("Bob", 102, "BatchA", 78.0, address2));
//        students.add(new Student("Charlie", 103, "BatchB", 92.0, address3));
//        students.add(new Student("Diana", 104, "BatchB", 88.5, address4));
//        students.add(new Student("Eve", 105, "BatchC", 90.0, address5));
//
//        // Display student details and handle exceptions
//        for (Student student : students) {
//            student.displayDetails();
//            try {
//                student.displayAddressUppercase();
//            } catch (NullAddressException e) {
//                System.out.println(e.getMessage());
//            }
//            System.out.println(); // Line break for clarity
//        }
//    }
//}




package com.training.ioPackage;

class CheckedExceptionClass {
    public static void main(String[] args) {

    }
}
class Student{

}

class Address {
    private String village;
    private String postOffice;
    private String policeStation;
}



// create a file and that file should be pdf and there list of student and their roll no print.

