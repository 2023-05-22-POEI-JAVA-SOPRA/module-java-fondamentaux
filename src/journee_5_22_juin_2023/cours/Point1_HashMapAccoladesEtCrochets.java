package journee_5_22_juin_2023.cours;

import java.util.HashMap;
import java.util.Scanner;

public class Point1_HashMapAccoladesEtCrochets {
    public static void main(String[] args) {
        String[] noms;
        noms=new String[9];

        int[] nombres=new int[5];

        int[] ages={23,25,30,56,89,230};// 6

        String[] langages;
        langages=new String[]{"Java","C++","Python"};

        System.out.println(somme(new int[]{3,4,5,6}));


        var input=new Scanner(System.in);
        var nom="Lisangola";
        var prenom="Christian";
        var age=31;
        var estMajeur=false;
        var numbers=new int[5];
        var letters=new char[]{'a','b','c'};
        var map=new HashMap<String,Integer>();
    }

    static int somme(int[] nombres){
        int somme=0;
        for(int nombre:nombres){
            somme +=nombre;
        }
        return somme;
    }
}
