//Question 1(A3)
public class PrintNo {
    public static void main(String[] args) {
        int counter = 0;

        // Print numbers from 0 to 10
        System.out.println("Numbers from 0 to 10:");
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // Print numbers from 10 to 0
        System.out.println("Numbers from 10 to 0:");
        counter = 10; // reset counter to 10
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }
    }
}