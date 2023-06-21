package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP8PositifNegatifPairImpairV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = input.nextInt();

        if (nombre > 0) {
            System.out.print("Le nombre est positif et ");
        } else if (nombre < 0) {
            System.out.print("Le nombre est négatif et ");
        } else {
            System.out.println("Le nombre est zéro (et il est pair)");
            return;
        }

        if (nombre % 2 == 0) {
            System.out.println("pair");
        } else {
            System.out.println("impair");
        }
    }
}
