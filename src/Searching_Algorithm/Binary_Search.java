package Searching_Algorithm;
import java.util.Scanner;

public class Binary_Search {
    //method for binary search
    public static int binarySearch(int [ ]array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;    //target found
            } else if (target < array[mid]) {
                right = mid - 1;    //search left half
            } else {
                left = mid + 1;    // search right half
            }
        }
        return -1;  //Target not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the siz if the array : ");
        int size = scanner.nextInt();

        // Input sorted array elements
         int [] array = new int [ size ];
        System . out . println (" Enter " + size + " sorted integers :");
         for (int i = 0; i < size ; i ++) {
             array [i] = scanner . nextInt () ;
            }

         // Input target element
        System.out.print("Enter the target element to search for : ");
         int target = scanner.nextInt();

         //Call binary search and display the result
        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array. ");
        }
        scanner.close();

    }
}
