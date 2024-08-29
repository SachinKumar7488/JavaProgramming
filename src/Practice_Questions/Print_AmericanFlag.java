public class Print_AmericanFlag {
    public static void main(String[] args) {
        String starLine = "* * * * * * ==================================\n * * * * *  ==================================";
        String stripeLine = "==============================================";

        // Printing the top part with stars and stripes
        for (int i = 0; i < 9; i++) {
            System.out.println(starLine);
        }

        // Printing the bottom part with stripes only
        for (int i = 0; i < 6; i++) {
            System.out.println(stripeLine);
        }
    }
}
