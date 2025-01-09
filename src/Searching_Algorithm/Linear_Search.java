package Searching_Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found return its index
            }
        }
        return -1;  // target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers for the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // input target element
        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        // call linear search and display the result

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array. ");
        }

        scanner.close();
    }
}

