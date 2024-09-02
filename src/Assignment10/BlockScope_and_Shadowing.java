package Assignment10;

public class BlockScope_and_Shadowing {

    public void calculate() {
        int x = 10;
        System.out.println("Value of x before the loop: " + x);

        // Loop block
        for (int i = 0; i < 3; i++) {
            int y = 20;
            System.out.println("Value of y inside the loop: " + y);
        }
        System.out.println("Value of x after the loop: " + x);
    }

    public static void main(String[] args) {
        BlockScope_and_Shadowing example = new  BlockScope_and_Shadowing();
        example.calculate();
    }
}
