package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

//contact class
class Contact{

private String name;
private String phoneNumber;
private String email;

//constructor
public Contact(String name, String phoneNumber, String email){
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.email=email;
    }
//getter method to return the value of attributes
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    //setter method (it takes parameter and assigned it to the attribute)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //method to display contact information
    public void displayContact(){
    System.out.println("Name : "+name);
    System.out.println("Phone Number :"+phoneNumber);
    System.out.println("Email : "+email);
    }
}
class ContactManager{
    private ArrayList<Contact> contactList;

    public ContactManager() {              //constructor
        contactList = new ArrayList<>();
    }
    //method for adding contact in the list

    public void addContact(Contact contact){
        contactList.add(contact);
    }
    //method to search for a contact by name
    public void searchContact(String Name){
        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(Name)) {
                contact.displayContact();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    //method to update contact details by name
    public void updateContact(String name, String newPhoneNumber, String newEmail){
        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                System.out.println("Contact updated:");
                contact.displayContact();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    //method to list all contacts
    public void listContacts(){
        if(contactList.isEmpty()){
            System.out.println("No contacts available.");
        }else {
            for(Contact contact:contactList){
                contact.displayContact();
                System.out.println("----------");

            }
        }
    }
}
//main clas
public class Contact_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("Contact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact by Name");
            System.out.println("3. Update Contact");
            System.out.println("4. List All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // add contact
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    manager.addContact(new Contact(name, phoneNumber, email));
                    System.out.println("Contact added successfully.");
                    break;

                case 2: // search contact by name
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    manager.searchContact(name);
                    break;

                case 3: // update contact
                    System.out.print("Enter name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    manager.updateContact(name, newPhoneNumber, newEmail);
                    break;

                case 4: // list all contacts
                    System.out.println("Listing all contacts:");
                    manager.listContacts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
