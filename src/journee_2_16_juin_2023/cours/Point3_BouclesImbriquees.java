package journee_2_16_juin_2023.cours;

import java.util.Scanner;

public class Point3_BouclesImbriquees {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez les 2 nombres separes par un espace : ");
        int premierNombre=input.nextInt();
        int dernierNombre=input.nextInt();
        for(int i=premierNombre;i<=dernierNombre;i++){
            System.out.println("Table de "+i);
            System.out.println("==============");
            for(int j=2;j<=13;j++){
                int produit=i*j;
                System.out.printf("%d x %d = %d\n",i,j,produit);
            }
            System.out.println();
        }

    }
}
