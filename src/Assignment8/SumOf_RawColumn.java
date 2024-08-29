package Assignment8;

import java.util.Scanner;

public class SumOf_RawColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[3][3];

        //Taking input for 3*3 matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Calculate and print the sum of each row and column
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        //Calculate and print the sum of each row and column
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
        scanner.close();
    }
}