// Bubble_Sort.java
public class Bubble_Sort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the swapped flag for each pass

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps occurred during this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test Bubble Sort
    public static void main(String[] args) {
        int[] arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
