package journee_4_21_juin_2023.tps;

public class TP1_IsPrefix {
    public static void main(String[] args) {
        System.out.println(isPrefix("banner", "bang")); // false
        System.out.println(isPrefix("hugging", "hug")); // true
    }
    public static boolean isPrefix(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("None of the parameters can be null");
        }
        return str1.toLowerCase().startsWith(str2.toLowerCase());//|| str2.startsWith(str1);
    }
}
