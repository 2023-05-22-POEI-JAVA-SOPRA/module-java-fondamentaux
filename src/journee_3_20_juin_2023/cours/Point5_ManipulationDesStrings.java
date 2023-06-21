package journee_3_20_juin_2023.cours;

import java.util.Scanner;

public class Point5_ManipulationDesStrings {
    public static void main(String[] args) {
        String nom="Christian";
//        System.out.println(nom.charAt(0));
//        System.out.println(nom.charAt(1));

        for(int i=0;i<nom.length();i++){
            System.out.println(nom.charAt(i));
        }

        System.out.println(nom.toUpperCase());
        int nombreCaracteres=nom.length();
        System.out.println(nom.charAt(nombreCaracteres-1));

        Scanner input=new Scanner(System.in);
        System.out.print("Une letter : ");
        char lettre=input.next().charAt(0);// A
        System.out.println(lettre);
    }
}
