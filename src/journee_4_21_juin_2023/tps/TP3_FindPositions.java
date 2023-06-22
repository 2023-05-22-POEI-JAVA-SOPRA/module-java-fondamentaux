package journee_4_21_juin_2023.tps;

import java.util.ArrayList;
import java.util.List;

// Pour ce TP, vous devez lire attentivement les instructions ou j'ai utilise les ArrayList a gauche.
// Quand on va aborder la Programation Oriente Objet, on va les remplacer par
//  @Todo : List<String> result = findNumber(array, num) : ligne 20
//  @Todo : public static List<String> findNumber(int[][] array, int num) : ligne 25
//  @Todo : List<String> positions = new ArrayList<>() : ligne 26
public class TP3_FindPositions {
    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}
        };

        int num = 1;
        List<String> result = findNumber(array, num);

        System.out.println(num + " se retrouve " + result.size() + " fois dans les emplacements suivants : " + result.toString());
    }


    /**
     * Le runtime complexity est O(nxm)
     * Trouve et retourne les positions du nombre a rechercher dans le tableau 2D.
     * @param array Le tableau 2D a rechercher.
     * @param num Le nombre a trouver.
     * @return La liste des strings, ou chaque string represente la position du nombre en format "(x,y)".
     */
    public static List<String> findNumber(int[][] array, int num) {
        List<String> positions = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == num) {
                    positions.add("(" + i + "," + j + ")");
                }
            }
        }
        return positions;
    }
}
