package journee_4_21_juin_2023.cours;

public class Point_4_Exo1 {
    // ana -> ana : palindome
    // ressasser -> ressasser : palindrme
    // papa -> apap -> pas un palindrome
    static boolean isPalindrome(String text){
        String formattedStr=text.replaceAll("[^A-Za-z]","").toLowerCase();
        String reversed=reverse(formattedStr);
        return formattedStr.equals(reversed);
    }

    static String reverse(String text){
        String reversed="";
        for(String letter:text.split("")){
            reversed=letter+reversed;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("An a"));
        System.out.println(isPalindrome("papa"));
        System.out.println(isPalindrome("ressasser"));
    }
}