package journee_3_20_juin_2023.tps;

import java.util.Scanner;

public class TP6_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir un texte:");
        String text = input.nextLine();

        String reversedInput = "";
        for (int i = 0; i < text.length(); i++) {
            reversedInput = text.charAt(i)+reversedInput;
        }

        System.out.println("Résultat : " + reversedInput);
    }
}
