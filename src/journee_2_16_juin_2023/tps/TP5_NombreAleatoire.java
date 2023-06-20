package journee_2_16_juin_2023.tps;

import java.util.Random;
import java.util.Scanner;

public class TP5_NombreAleatoire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generateur = new Random();

        int nombreAleatoire = generateur.nextInt(100) + 1;
        int nombreUtilisateur = 0;
        int essais = 0;

        while (nombreUtilisateur != nombreAleatoire){
            System.out.print("Veuillez deviner le nombre : ");
            nombreUtilisateur = input.nextInt();
            essais++;

            if(nombreUtilisateur > nombreAleatoire){
                System.out.println("Trop haut");
            } else if (nombreUtilisateur < nombreAleatoire) {
                System.out.println("Trop bas");
            }
        }
        System.out.println("Félicitations! Vous avez trouvé le nombre après " + essais + " essais.");
    }
}
