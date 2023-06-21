package journee_3_20_juin_2023.tps;

import java.util.HashMap;
import java.util.Map;

public class TP3_NombreLePlusFrequentV2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};

        HashMap<Integer, Integer> numMap = new HashMap<>();// {}
        for (int num : numbers){
            numMap.get(2);
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }



        int mostFrequentNum = numbers[0];
        int maxFrequency = numMap.get(mostFrequentNum);
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()){
            if (entry.getValue() > maxFrequency) {
                mostFrequentNum = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.printf("L'élément le plus fréquent est le %d et sa fréquence d'apparition est %d.\n", mostFrequentNum, maxFrequency);
    }
}
