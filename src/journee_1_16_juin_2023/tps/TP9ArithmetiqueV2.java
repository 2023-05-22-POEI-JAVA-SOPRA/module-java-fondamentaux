package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP9ArithmetiqueV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Premier nombre: ");
        int nombre1=input.nextInt();

        System.out.print("Deuxième nombre: ");
        int nombre2=input.nextInt();

        System.out.println("*********************************************");
        System.out.println("** Veuillez choisir l'opération à exécuter **");
        System.out.println("*********************************************\n");
        System.out.println("1 ou + pour Addition");
        System.out.println("2 ou - pour Soustraction");
        System.out.println("3 ou * pour Multiplication");
        System.out.println("4 ou / pour Division");

        System.out.print("Votre choix : ");
        String choix = input.next();
        int resultat = 0;

        switch (choix) {
            case "1", "+" -> {
                resultat = nombre1 + nombre2;
                System.out.printf("%d + %d = %d", nombre1, nombre2, resultat);
            }
            case "2", "-" -> {
                resultat = nombre1 - nombre2;
                System.out.printf("%d - %d = %d", nombre1, nombre2, resultat);
            }
            case "3", "*" -> {
                resultat = nombre1 * nombre2;
                System.out.printf("%d x %d = %d", nombre1, nombre2, resultat);
            }
            case "4", "/" -> {
                if (nombre2 != 0) {
                    double divisionResultat = (double) nombre1 / nombre2;
                    System.out.printf("%d / %d = %.2f", nombre1, nombre2, divisionResultat);
                } else {
                    System.out.println("Division par zéro non définie");
                }
            }
            default -> System.out.println("Vous n'avez pas entré un choix valide");
        }
    }
}

