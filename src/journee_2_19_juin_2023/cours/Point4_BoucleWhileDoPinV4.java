package journee_2_19_juin_2023.cours;

import java.util.Scanner;

public class Point4_BoucleWhileDoPinV4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez definir un code Pin : ");
        int codePin = input.nextInt();


        int codePinATester;
        do {
            System.out.print("Entrez le code Pin pour deverouiller l'appareil : ");
            codePinATester = input.nextInt();
            if (codePinATester == codePin) {
                break;
            }
            System.out.println("Code Pin incorrect, veuillez recommencer.");
        } while (true);
    }
}

// 1. Limiter le nombre de tentatives a 5. Apres 5 tentative incorrect, l'appareil doit etre bloque
// 2. Le code PIN ne doit toujours avoir 4 chiffres
// 3. En cas de code pin correct, afficher un message de welcome
