//Question 3(A3)
public class CalculateProductNo {
        public static void main(String[] args) {
            int product = 1; // initialize product variable to 1

            int i = 1; // start from 1
            while (i <= 5) {
                product *= i; // multiply product by each number from 1 to 5
                i++;
            }

            System.out.println("Product of numbers from 1 to 5: " + product);
        }
    }
