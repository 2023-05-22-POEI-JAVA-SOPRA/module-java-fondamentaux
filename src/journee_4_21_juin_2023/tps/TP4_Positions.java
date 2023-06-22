package journee_4_21_juin_2023.tps;

public class TP4_Positions {

    public static void main(String[] args) {
        String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] result = deplacePersonne(directions);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    /**
     * Déplace une personne selon les directions données et retourne la position finale.
     *  Runtime complexity : O(n)
     * @param directions Un tableau de directions. Chaque direction peut être "haut", "bas", "gauche", ou "droite".
     * @return Un tableau de deux entiers représentant la position finale de la personne sur la grille.
     */
    public static int[] deplacePersonne(String[] directions) {
        int[] position = {0, 0}; // position[0] représente x et position[1] représente y
        for (String direction : directions) {
            switch (direction) {
                case "haut":
                    position[1]++;
                    break;
                case "bas":
                    position[1]--;
                    break;
                case "gauche":
                    position[0]--;
                    break;
                case "droite":
                    position[0]++;
                    break;
            }
        }
        return position;
    }
}
