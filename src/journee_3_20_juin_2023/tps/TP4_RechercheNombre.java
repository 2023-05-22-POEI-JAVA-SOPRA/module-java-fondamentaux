package journee_3_20_juin_2023.tps;

import java.util.HashMap;
import java.util.Scanner;

public class TP4_RechercheNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Combien de nombres voulez-vous entrer ?");
        int arraySize = input.nextInt();//10

        int[] array = new int[arraySize];
        HashMap<Integer, Integer> numMap = new HashMap<>();


        for (int i = 0; i < arraySize; i++) {
            System.out.println("Entrez le nombre " + (i+1) + ":");
            array[i] = input.nextInt();
            numMap.put(array[i], numMap.getOrDefault(array[i], 0) + 1);
        }

        System.out.println("Entrer un nombre à rechercher:");
        int searchNum = input.nextInt();//3


        if (numMap.containsKey(searchNum)) {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau.\n", searchNum, numMap.get(searchNum));
        } else {
            System.out.printf("%d n'existe pas dans le tableau.\n", searchNum);
        }
    }
}
