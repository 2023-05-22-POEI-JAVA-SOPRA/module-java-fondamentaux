package journee_3_20_juin_2023.tps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TP5_OccurencesLettres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir un texte:");
        String text = input.nextLine();

        String formattedInput = text.toLowerCase().replaceAll("[^a-z]", "");

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : formattedInput.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%s : %d fois\n", entry.getKey(), entry.getValue());
        }
    }
}
