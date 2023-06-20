package journee_2_16_juin_2023.tps;

import java.util.Scanner;

public class TP1_TableMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir le nombre pour lequel vous voulez afficher la table de multiplication : ");
        int nombre = input.nextInt();

        System.out.print("Veuillez saisir les limites inférieure et supérieure séparées par un espace (ex : 3 6) : ");
        int limiteInferieure = input.nextInt();
        int limiteSuperieure = input.nextInt();

        for(int i = limiteInferieure; i <= limiteSuperieure; i++){
            int resultat = nombre * i;
            System.out.printf("%d x %d = %d\n", nombre, i, resultat);
        }
    }
}
