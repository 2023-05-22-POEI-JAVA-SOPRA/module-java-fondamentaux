package journee_3_20_juin_2023.cours;

import java.util.Scanner;

public class Point2_FonctionnementInterne {
    public static void main(String[] args) {
        // Pool des litteraux
        String nom="Chris";// [ 'C', 'h', 'r', 'i', 's' ] => nom = 223
        String nom2="Chris"; // => nom2 = 223
        String nom4="Chris"; // => nom4 = 223

        if(nom==nom2){
            System.out.println("Test 1 : C'est vrai");
        }else{
            System.out.println("Test 1 : C'est Faux");
        }

        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom3 : ");
        String nom3=input.nextLine();// [ 'C', 'h', 'r', 'i', 's' ] => nom3=456

//        if(nom.equals(nom3)){
//            System.out.println("Test 2 : C'est vrai");
//        }else{
//            System.out.println("Test 2 : C'est Faux");
//        }

        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("Test 2 : C'est vrai");
        }else{
            System.out.println("Test 2 : C'est Faux");
        }
    }
}
