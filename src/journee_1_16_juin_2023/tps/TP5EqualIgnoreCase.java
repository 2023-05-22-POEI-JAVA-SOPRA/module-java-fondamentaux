package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP5EqualIgnoreCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue = input.nextLine();

        if (langue.equalsIgnoreCase("english")) {
            System.out.println("Hello!!");
        } else if (langue.equalsIgnoreCase("french")) {
            System.out.println("Salut!!");
        } else if (langue.equalsIgnoreCase("spanish")) {
            System.out.println("Hola!!");
        } else if (langue.equalsIgnoreCase("german")) {
            System.out.println("Guten tag");
        } else {
            System.out.println("Langue non supportée");
        }
    }
}
