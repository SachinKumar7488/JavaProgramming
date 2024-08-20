import java.util.Random;
public class Random_Number {

        public static void main(String[] args) {
            Random random = new Random();

            int randomNumber = random.nextInt(100);

            System.out.println("Random number between 1 and 100: " + randomNumber);
        }
    }
