package journee1_16_juin_2023.tps;

import java.util.Scanner;

public class TP7SwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue = input.nextLine().toLowerCase();

        switch (langue) {
            case "english" -> System.out.println("Hello!!");
            case "french" -> System.out.println("Salut!!");
            case "spanish" -> System.out.println("Hola!!");
            case "german" -> System.out.println("Guten tag");
            default -> System.out.println("Langue non supportée");
        }
    }
}
