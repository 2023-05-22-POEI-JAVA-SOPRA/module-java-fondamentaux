package journee_4_21_juin_2023.tps;

import java.util.ArrayList;
import java.util.Scanner;

public class TP2_ProgrammingLanguages {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> languages = getLanguagesFromUser();
        System.out.println("Avant la suppression: " + languages);
        removeLanguagesFromUser(languages);
        System.out.println("Après la suppression: " + languages);
    }

    private static ArrayList<String> getLanguagesFromUser() {
        ArrayList<String> languages = new ArrayList<>();
        System.out.println("Veuillez entrer des langages de programmation. Entrez 'stop' pour arrêter.");
        while (true) {
            String language = input.nextLine();
            if (language.equalsIgnoreCase("stop")) {
                break;
            }
            languages.add(language);
        }
        return languages;
    }

    private static void removeLanguagesFromUser(ArrayList<String> languages) {
        System.out.println("Veuillez entrer les langages à supprimer. Entrez 'stop' pour arrêter.");
        while (true) {
            String language = input.nextLine();
            if (language.equalsIgnoreCase("stop")) {
                break;
            }
            languages.remove(language);
        }
    }
}
