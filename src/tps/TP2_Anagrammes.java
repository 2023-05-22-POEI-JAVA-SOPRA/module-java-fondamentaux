package tps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TP2_Anagrammes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String string1, String string2) {
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : string1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (char c : string2.toCharArray()) {
            if (!charFrequency.containsKey(c)) {
                return false;
            }
            int frequency = charFrequency.get(c);
            if (frequency == 1) {
                charFrequency.remove(c);
            } else {
                charFrequency.put(c, frequency - 1);
            }
        }
        return charFrequency.isEmpty();
    }
}
