package Assignment8;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize the 3*3 matrix
        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];
//        int[][][] matrix2 = new int[3][3][3];
//        int[][][] matrix3 = new int[3][3][3];
//        int[][][] resultMatrix = new int[3][3][3];

//Taking input from 3*3 matrix
        System.out.println("Enter the element for first 3*3 matrix : ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Computing the transpose of matrix
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                transpose[i][j] = matrix[i][j];
            }
        }

        //Displaying the transpose of matrix
        System.out.println("Transpose of the matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}