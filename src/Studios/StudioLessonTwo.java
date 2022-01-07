package Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StudioLessonTwo {
    public static void main(String[] args) {
        getUserInput();
    }

    public static void getUserInput() {
        HashMap<Character, Integer> charList = new HashMap<>();
        char[] letters;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote. Press enter when you're done.");
        String userInput = input.nextLine();
        String userSort = userInput.replaceAll("[^A-Za-z]+", ""
        ).toLowerCase();
        input.close();
        letters = userSort.toCharArray();

        for (char letter : letters) {
            if (!charList.containsKey(letter)) {
                charList.put(letter, 1);
            } else {
                Integer value = charList.get(letter);
                value += 1;
                charList.put(letter, value);
            }
        }
    for (Map.Entry<Character, Integer> letter : charList.entrySet()) {
        System.out.println(letter.getKey() + ": " + letter.getValue());
        }

    }
};
