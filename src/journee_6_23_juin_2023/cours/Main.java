package journee_6_23_juin_2023.cours;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var personne=new Point1_Personne("Chris","Lis");
        System.out.println(personne.getAge());
        System.out.println(personne.getNom());
        System.out.println(personne.getPrenom());
        System.out.println(personne.isEstMarie());
        System.out.println(personne.getPoids());

        personne.setNom("Zozor");
        System.out.println(personne.getNom());

        boolean[] numbers=new boolean[5];
        System.out.println(Arrays.toString(numbers));
    }
}
