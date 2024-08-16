import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        //Condition for Hashmap to store key
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // display the frequency of each character
        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}