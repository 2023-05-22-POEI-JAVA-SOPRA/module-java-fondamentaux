package journee1_16_juin_2023.tps;

import java.time.Year;
import java.util.Scanner;

public class TP4AnneAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez votre âge : ");
        int age = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int annee = currentYear - age;

        System.out.printf("Votre année de naissance est : %d\n", annee);
    }
}
