package journee_2_16_juin_2023.tps;

import java.util.Scanner;

public class TP2_CalculFactorielle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre pour lequel vous voulez calculer la factorielle : ");

        int nombre = input.nextInt();
        long factorielle = 1;

        String detailCalcul = "";

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;

            if (i > 1) {
                detailCalcul += " x " + i;
            } else {
                detailCalcul += i;
            }
        }

        System.out.printf("Factorielle de %d : %s = %d\n", nombre, detailCalcul, factorielle);
    }
}

