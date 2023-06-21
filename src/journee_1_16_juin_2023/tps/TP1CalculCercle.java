package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP1CalculCercle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir la valeur du diamètre :");
        double diametre = input.nextDouble();

        double rayon = diametre / 2;
        double surface = Math.PI * Math.pow(rayon,2);

        System.out.printf("Surface : %.2f",surface);
    }
}
