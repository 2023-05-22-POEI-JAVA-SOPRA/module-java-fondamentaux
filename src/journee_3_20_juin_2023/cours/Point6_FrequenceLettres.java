package journee_3_20_juin_2023.cours;

import java.util.HashMap;

public class Point6_FrequenceLettres {
    public static void main(String[] args) {
        String name="Christian Lisangola";
        // c:1, h:1, r:1, i:3, s:2,.....
        String lowerCaseName=name.toLowerCase();
        System.out.println(lowerCaseName);
        // {
        //   c:2,
        // }
        // 1. Verifier si le caractere exist. S'il n'existe on incremente sa valeur, sinon cree la cle
        HashMap<String,Integer> occurences=new HashMap();
        System.out.println(occurences);
        for(int i=0;i<lowerCaseName.length();i++){
            String character= String.valueOf(lowerCaseName.charAt(i));
            if(occurences.containsKey(character)){
                int currentValue=occurences.get(character);
                occurences.replace(character,currentValue+1);
            }else {
                occurences.put(character,1);
            }
        }
        System.out.println(occurences);
    }
}