package Assignment7;

import java.util.Scanner;

public class LargestNoInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of array : ");
        for(int i =0; i< size; i++){
            array[i] = scanner.nextInt();
        }
        int largest = 0;

        for(int j =0; j<5; j++) {
            if(array[j] > largest){
                largest = array[j];
            }

        }
        System.out.println("Largest number in the array is : " +largest);
    }
}
