package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP9Arithmetique {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Premier nombre: ");
        int nombre1=input.nextInt();

        System.out.print("Deuxième nombre: ");
        int nombre2=input.nextInt();

        System.out.println("*********************************************");
        System.out.println("** Veuillez choisir l'opération à exécuter **");
        System.out.println("*********************************************\n");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Votre choix : ");
        int choix=input.nextInt();
        int resultat=0;
        switch (choix) {
            case 1 -> {
                resultat = nombre1 + nombre2;
                System.out.printf("%d + %d = %d", nombre1, nombre2, resultat);
            }
            case 2 -> {
                resultat = nombre1 - nombre2;
                System.out.printf("%d - %d = %d", nombre1, nombre2, resultat);
            }
            case 3 -> {
                resultat = nombre1 * nombre2;
                System.out.printf("%d x %d = %d", nombre1, nombre2, resultat);
            }
            case 4 -> {
                resultat = nombre1 / nombre2;
                System.out.printf("%d / %d = %d", nombre1, nombre2, resultat);
            }
            default -> System.out.println("Vous n'avez pas entre un choix valide");
        }
    }
}
