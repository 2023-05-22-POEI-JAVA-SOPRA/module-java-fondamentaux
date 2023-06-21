package journee_3_20_juin_2023.cours;

import java.util.Arrays;

public class Point1_TableauxATailleFixe {
    public static void main(String[] args) {
        double[] physicsGrade=new double[6];// [0.0 , 0.0  , 0.0  , 0.0  , 0.0  , 0.0 ]
        System.out.println("Avant modifications : "+Arrays.toString(physicsGrade));
        // 1. Pour chaque indexe, demander a l'utilisateur d'entrer une valeur a partir du clavier
        // 2. Les valeurs acceptees sont entre [0,20]
        physicsGrade[0]=12;
        physicsGrade[1]=18;
        physicsGrade[2]=15;
        physicsGrade[3]=17;
        physicsGrade[4]=9.5;
        physicsGrade[5]=2.3;
        System.out.println("Apres modifications : "+Arrays.toString(physicsGrade));

        double sum=0;
        int size=physicsGrade.length;
        for(int i=0;i<size;i++){
            // i=0;sum=sum + physicsGrade[i] => sum=0+12 = 12
            // i++ => i=1; sum = 12 + 18 = 30
            // i++ => i=2; sum = 30 + 15 = 45
            // i++ => i=3; sum = 45 + 17 = 62
            // i++ => i=4; sum = 62 + 9.5 = 71.5
            // i++ => i=5; sum = 71.5 + 2.3 = 73.8
            // i++ => i=6
            sum = sum + physicsGrade[i]; //sum +=physicsGrade[i];
        }
        //sum=73.8
        System.out.println("Somme : "+sum);
        double average=sum/size;
        System.out.printf("Moyenne : %.1f\n",average);
    }
}
