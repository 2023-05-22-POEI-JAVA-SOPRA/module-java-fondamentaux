package tps;

public class TP4_AlternerCaracteres {
    public static void main(String[] args) {
        char[] tableau = {'a', 'b', 'c', 'd', 'e'};

        char[] resultat = alternerMajMin(tableau);

        // Affichage du tableau résultant
        for (char c : resultat) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static char[] alternerMajMin(char[] tableau) {
        char[] resultat = new char[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            if (i % 2 == 1) {
                resultat[i] = Character.toUpperCase(tableau[i]);
            } else {
                resultat[i] = Character.toLowerCase(tableau[i]);
            }
        }

        return resultat;
    }
}
