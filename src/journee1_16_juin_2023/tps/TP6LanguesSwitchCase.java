package journee1_16_juin_2023.tps;

import java.util.Scanner;

public class TP6LanguesSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue = input.nextLine();

        switch (langue.toLowerCase()) {
            case "english":
                System.out.println("Hello!!");
                break;
            case "french":
                System.out.println("Salut!!");
                break;
            case "spanish":
                System.out.println("Hola!!");
                break;
            case "german":
                System.out.println("Guten tag");
                break;
            default:
                System.out.println("Langue non supportée");
                break;
        }
    }
}
