package Assignment12;
import java.util.Scanner;

public class BankAccount_Management {
    private String accountNumber;
    private String accountHolderName;
    private double bankBalance;

    //constructor
    public BankAccount_Management(String accountNumber, String accountHolderName, double bankBalance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.bankBalance=bankBalance;
    }
    //for depositing money
    public void deposit (double amount){
        if(amount>0){
            bankBalance += amount;
        }else{
            System.out.println("deposit amount must be in positive. ");
        }
    }
    //for withdrawing money
    public void withdraw (double amount){
        if (amount > 0){
            if (amount <= bankBalance){
                bankBalance -= amount;
            }else {
                System.out.println("insufficient balance.");
            }
        }else{
                System.out.println("withdraw amount must be ib positive.");
        }
    }
    //for checking balance
    public double checkBalance(){
        return bankBalance;
    }

    //for displaying bank account details
    public String toString(){
        return String.format("Account Number: %s\nAccount Holder Name: %s\nBank Balance: $%.2f",
               accountNumber, accountHolderName, bankBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //bank account object
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount_Management account = new BankAccount_Management(accountNumber, accountHolderName, initialBalance);

        boolean continueBanking = true;
        while (continueBanking) {
            System.out.println("\nChoose an option:");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. check Balance");
            System.out.println("4. exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: //deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successfully");
                    break;

                case 2: //withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3: //check Balance
                    System.out.println("Current balance: $" + account.checkBalance());
                    break;

                case 4: //exit
                    continueBanking = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        System.out.println("\nFinal account details:");    //displaying the final account details
        System.out.println(account);

        scanner.close();
    }
}