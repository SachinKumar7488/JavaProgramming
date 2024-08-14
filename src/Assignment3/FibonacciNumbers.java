
public class FibonacciNumbers {
        public static void main(String[] args) {
            int num1 = 0; // first Fibonacci number
            int num2 = 1; // second Fibonacci number
            int count = 0; // count of Fibonacci numbers

            System.out.println("First 10 Fibonacci numbers:"); // print header
            while (count < 10) {
                System.out.print(num1 + " "); // print the current Fibonacci number
                int nextFibonacci = num1 + num2; // calculate the next Fibonacci number
                num1 = num2; // update num1 to be the previous Fibonacci number
                num2 = nextFibonacci; // update num2 to be the new Fibonacci number
                count++; // increment the count
            }
            System.out.println();
        }
    }
