package tps;

public class TP1_PlusGrandEtPlusPetitElementTableauEtPosition {
    public static void main(String[] args) {
        int[] tableau = {12, 3, 5, 6, -3};

        afficherTableau(tableau);

        int positionPlusGrand = trouverPositionPlusGrand(tableau);
        int positionPlusPetit = trouverPositionPlusPetit(tableau);

        System.out.println("Plus grand : " + tableau[positionPlusGrand]);
        System.out.println("Plus petit : " + tableau[positionPlusPetit]);
    }

    public static void afficherTableau(int[] tableau) {
        System.out.print("Tb : [");

        for (int i = 0; i < tableau.length; i++) {
            if (i == 0) {
                System.out.print(tableau[i]);
            } else {
                System.out.print(", " + tableau[i]);
            }

            if (i == trouverPositionPlusGrand(tableau)) {
                System.out.print("(PG)");
            }

            if (i == trouverPositionPlusPetit(tableau)) {
                System.out.print("(PP)");
            }
        }

        System.out.println("]");
    }

    public static int trouverPositionPlusGrand(int[] tableau) {
        int position = 0;
        int plusGrand = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > plusGrand) {
                plusGrand = tableau[i];
                position = i;
            }
        }

        return position;
    }

    public static int trouverPositionPlusPetit(int[] tableau) {
        int position = 0;
        int plusPetit = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < plusPetit) {
                plusPetit = tableau[i];
                position = i;
            }
        }

        return position;
    }
}
