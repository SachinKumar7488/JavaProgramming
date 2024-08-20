import java.util.Scanner;

public class MultiLine_Address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the street Name : ");
        String street = scanner.nextLine();

        System.out.print("Enter the city Name : ");
        String city = scanner.nextLine();

        System.out.print("Enter the zipcode : ");
        String zipcode = scanner.nextLine();

        String formattedAddress = street + "\n" + "\t" + city + "\n" + zipcode;

        System.out.println(formattedAddress);

    }
}
