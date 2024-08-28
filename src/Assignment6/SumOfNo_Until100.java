package Assignment6;

import java.util.Scanner;

public class SumOfNo_Until100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();

            sum += number;

            if(sum >= 100){
                break;
            }
        }
        System.out.println("The sum has reached or exceeded 100: " + sum);
    }
}
