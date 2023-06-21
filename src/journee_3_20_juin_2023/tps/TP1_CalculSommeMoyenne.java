package journee_3_20_juin_2023.tps;

import java.util.Arrays;
import java.util.Scanner;

public class TP1_CalculSommeMoyenne {
    public static void main(String[] args) {
        double[] physicsGrade=new double[6];// [0.0 , 0.0  , 0.0  , 0.0  , 0.0  , 0.0 ]
        System.out.println("Avant modifications : "+ Arrays.toString(physicsGrade));
        // 1. Pour chaque indexe, demander a l'utilisateur d'entrer une valeur a partir du clavier
        // 2. Les valeurs acceptees sont entre [0,20]
        int size=physicsGrade.length;

        Scanner input=new Scanner(System.in);
        for(int i=0;i<size;i++){
            do{
                System.out.printf("Grade[%d] : ",i);
                double grade=input.nextDouble();
                if(grade>=0 && grade<=20){
                    physicsGrade[i]=grade;
                    break;
                }
                System.out.println("Les notes doivent etre entre 0 et 20");
            }while (true);
        }
        System.out.println("Apres modifications : "+Arrays.toString(physicsGrade));
        double sum=0;
        for(int i=0;i<size;i++){
            sum = sum + physicsGrade[i];
        }
        System.out.println("Somme : "+sum);
        double average=sum/size;
        System.out.printf("Moyenne : %.1f\n",average);
    }
}
