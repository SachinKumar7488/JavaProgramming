package Assignment7;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of array : ");
        for(int i =0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        //Reversing the array
        for(int i = array.length -1; i >= 0; i--){
            System.out.println("Reverse of an array : " + array[i]);
        }
        scanner.close();
    }
}
