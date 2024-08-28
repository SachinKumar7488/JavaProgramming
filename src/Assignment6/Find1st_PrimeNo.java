package Assignment6;

public class Find1st_PrimeNo {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for(int num = start; num <= end; num++){
            if(num <2){
                continue;
            }
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The first prime number in the range is : " +num);
                break;
            }
        }

    }
}
