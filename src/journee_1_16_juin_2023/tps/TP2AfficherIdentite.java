package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP2AfficherIdentite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Votre âge : ");
        int age = scanner.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d  ans.",prenom,nom,age);
    }
}
