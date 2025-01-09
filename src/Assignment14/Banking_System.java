package Assignment14;

public class Banking_System {
    // Static variables to track total accounts and balance
    private static int totalAccounts = 0;
    private static double totalBalance = 0.0;

    // Instance variables
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Banking_System(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;

        // Update static tracking variables
        totalAccounts++;
        totalBalance += initialBalance;
    }

    // Instance method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalBalance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Instance method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            totalBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }

    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to get total balance across all accounts
    public static double getTotalBalance() {
        return totalBalance;
    }

    // Main method to demonstrate the BankAccount class
    public static void main(String[] args) {
        // Create multiple bank accounts
        Banking_System account1 = new Banking_System ("1001", "Umesh Kumar", 1000.0);
        Banking_System  account2 = new Banking_System ("1002", "Sandeep Kumar", 1500.0);

        // Perform transactions
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Display individual account details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        // Use static methods to show total accounts and balance
        System.out.println("\nBank Summary:");
        System.out.println("Total Accounts: " + Banking_System .getTotalAccounts());
        System.out.println("Total Balance: $" + Banking_System .getTotalBalance());
    }
}