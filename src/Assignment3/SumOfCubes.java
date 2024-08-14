import java.util.Scanner;
public class SumOfCubes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a Number:");
            int limit = scanner.nextInt();

            int sum = 0; // initialize sum variable to 0

            int i = 2; // start from 2 (even number)
            while (i <= limit) {
                int cube = i * i * i; // calculate the cube of each even number
                sum += cube; // add the cube to the sum variable
                i += 2; // increment by 2 to get the next even number
            }

            System.out.println("Sum of cubes of even numbers up to " + limit + ": " + sum);
        }
    }
