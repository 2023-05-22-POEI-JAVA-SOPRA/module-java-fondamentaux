package journee_1_16_juin_2023;

import java.util.HashMap;
import java.util.Map;

public class TP8_RemoveDoublons {
    public static void main(String[] args) {
        String phrase = "Je suis dans la joie";
        String formatted = phrase.replaceAll("[^A-Za-z]", "").toLowerCase();
        HashMap<String, Integer> doublons = new HashMap<>();
        for (String lettre : formatted.split("")) {
            if (doublons.containsKey(lettre)) {
                doublons.replace(lettre, doublons.get(lettre) + 1);
            } else {
                doublons.put(lettre, 1);
            }

        }

        String chaineSansDoublons="";
        for(Map.Entry<String,Integer> entry:doublons.entrySet()){
            String key=entry.getKey();
            int value=entry.getValue();
            if(value>1){
                chaineSansDoublons +=key;
            }
        }

        System.out.printf("1.Chaine départ : %s\n",formatted);
        System.out.printf("2.Chaine sans doublons : %s\n",chaineSansDoublons);
    }
}
