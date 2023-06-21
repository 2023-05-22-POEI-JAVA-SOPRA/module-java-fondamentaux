package journee_2_19_juin_2023.cours;

import java.util.Scanner;

public class Point2_TableMultiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez le nombre dont souhaitez afficher la table de multiplication : ");
        int nombre=input.nextInt();
        // 2 a 13
        for(int i=2;i<=13;i++){
            int produit=nombre*i;
            System.out.printf("%d x %d = %d\n",nombre,i,produit);
        }
    }
}
