package journee_6_23_juin_2023.cours.jeu_video;

import java.util.InputMismatchException;
import java.util.Scanner;


class A{
    public static int VIE=67;

    public static String trucs(){
        return "Trucs";
    }

    public String bonjour(){
        return "Bonjour";
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Vie : "+A.VIE);
        System.out.println(A.trucs());
//        A.bonjour();
    }
}
