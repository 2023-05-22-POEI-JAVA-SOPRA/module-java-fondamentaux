package journee_1_16_juin_2023.cours;

import java.util.Scanner;

public class Point_7_KeyboardInputAdvanced {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.print("Votre nom complet: ");
//        String nom=input.next();
//        String prenom=input.next();
//        String postnom=input.next();
//        System.out.println("Nom : "+nom);
//        System.out.println("Prenom : "+prenom);
//        System.out.println("Postnom : "+postnom);
        System.out.print("Votre age et celui de votre pere : ");
        int age=input.nextInt();
        int ageDeMonPere=input.nextInt();
        System.out.println("Age : "+age);
        System.out.println("Age de mon pere : "+ageDeMonPere);

//        System.out.print("Votre age  : ");
//        String ageStr=input.next();
//        int age=Integer.parseInt(ageStr);
//        System.out.println("Age : "+age);
    }
}
