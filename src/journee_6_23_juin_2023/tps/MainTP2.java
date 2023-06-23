package journee_6_23_juin_2023.tps;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTP2 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        try {
            System.out.print("Longueur : ");
            double longueur=input.nextDouble();//"5.papa"
            System.out.println("Largeur : ");
            double largeur=input.nextDouble();
            var rectangle=new TP2_Rectangle(longueur,largeur);
            System.out.println("Longueur : "+rectangle.getLongueur());
            System.out.println("Largeur : "+rectangle.getLargeur());

        }catch (IllegalArgumentException e){
            System.out.println("Erreur -> "+e);
        }catch (InputMismatchException e){
            System.out.println("Erreur de saisie : "+e);
        }
    }
}
