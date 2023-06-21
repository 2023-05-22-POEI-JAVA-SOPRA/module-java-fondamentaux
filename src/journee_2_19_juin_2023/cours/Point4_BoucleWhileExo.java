package journee_2_19_juin_2023.cours;

import java.util.Scanner;

public class Point4_BoucleWhileExo {
    public static void main(String[] args) {
        final int CODE_PIN_LENGTH = 4;
        final int MAX_ATTEMPTS = 5;
        Scanner input = new Scanner(System.in);

        int codePin = 0;

        do  {
            System.out.print("Veuillez définir un code PIN de " + CODE_PIN_LENGTH + " chiffres : ");
            if (input.hasNextInt()) {
                codePin = input.nextInt();
                if (Integer.toString(codePin).length() == CODE_PIN_LENGTH) {
                    break;
                }
            } else {
                input.next();
            }
            System.out.println("Erreur. Le code PIN doit être composé de " + CODE_PIN_LENGTH + " chiffres.");
        }while (true);

        int attempts = 0;
        boolean isUnlocked = false;
        do {
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            if (input.hasNextInt()) {
                int enteredPin = input.nextInt();
                attempts++;
                if (enteredPin == codePin) {
                    isUnlocked = true;
                    System.out.println("Appareil débloqué");
                    break;
                } else {
                    System.out.println("Code PIN incorrect. Veuillez ressayer.");
                }
            } else {
                input.next();
            }

            if (attempts >= MAX_ATTEMPTS) {
                System.out.printf("Vous avez saisi %d fois de mauvais code PIN, votre compte est bloqué.\n", attempts);
                break;
            } else if (attempts >= 2) {
                System.out.printf("Il vous reste %d tentative(s).\n", MAX_ATTEMPTS - attempts);
            }
        } while (true);

        if (!isUnlocked) {
            System.out.println("Appareil bloque.");
        }
    }
}


