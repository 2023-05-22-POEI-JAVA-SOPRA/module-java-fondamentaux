package journee_3_20_juin_2023.tps;

import java.util.HashMap;
import java.util.Map;

public class TP3_NombreLePlusFrequentV1 {
    public static void main(String[] args) {
        int[] array = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : array) {
            if (numMap.containsKey(num)) {
                int count=numMap.get(num);
                numMap.put(num, count + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        int mostFrequentNum = array[0];
        int mostFrequentNumCount = numMap.get(array[0]);

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > mostFrequentNumCount) {
                mostFrequentNum = entry.getKey();
                mostFrequentNumCount = entry.getValue();
            }
        }

        System.out.printf("L'élément le plus fréquent est le %d et que sa fréquence d'apparition est %d.", mostFrequentNum, mostFrequentNumCount);
    }
}
