import java.util.Scanner;

public class LargerDataTypeto_Smaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the larger(long) integer value : ");
        long longNum = scanner.nextLong();

        byte byteNum = (byte) longNum;
        System.out.println("The byte value is : " +byteNum);
    }
}