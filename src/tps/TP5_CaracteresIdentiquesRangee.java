package tps;

public class TP5_CaracteresIdentiquesRangee {
    public static void main(String[] args) {
        String mot1 = "terrific";
        String mot2 = "chats";
        String mot3 = "chats !!";

        System.out.println(maMethode(mot1));  // true
        System.out.println(maMethode(mot2));  // false
        System.out.println(maMethode(mot3));  // true
    }

    public static boolean maMethode(String mot) {
        if (mot.length() < 2) {
            return false;
        }

        for (int i = 0; i < mot.length() - 1; i++) {
            if (mot.charAt(i) == mot.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }
}
