package journee_2_16_juin_2023.tps;

import java.util.Scanner;

public class TP6_NombreParfait {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombre à tester : ");
        int nombreATester = input.nextInt();

        int sommeDesDiviseurs = 0;
        for (int i = 1; i < nombreATester; i++) {
            if(nombreATester % i == 0){
                sommeDesDiviseurs += i;
            }
        }

        if(nombreATester == sommeDesDiviseurs){
            System.out.printf("%d est un nombre parfait.", nombreATester);
        }else {
            System.out.printf("%d n'est pas un nombre parfait.", nombreATester);
        }
    }
}
