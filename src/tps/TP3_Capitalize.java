package tps;

import java.util.Scanner;

public class TP3_Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String input = scanner.nextLine();

        String resultat = mettreEnMajuscule(input);
        System.out.println("Résultat : " + resultat);
    }

    public static String mettreEnMajuscule(String input) {
        StringBuilder sb = new StringBuilder();
        boolean debutMot = true;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (debutMot) {
                    sb.append(Character.toUpperCase(c));
                    debutMot = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else if (Character.isWhitespace(c)) {
                sb.append(c);
                debutMot = true;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

