package journee_3_20_juin_2023.tps;

import java.util.Arrays;

public class TP2_SommeMultipleDeTrois {
    public static void main(String[] args) {
        int[] t1={2, 6, 8, 15,39,11 };
        int[] t2={21, 33, 12, 19,0 };
        int[] t3={17, 18, 46};

        int sommeMultiple3T1=0;
        for(int chiffre:t1){
            if(chiffre%3==0){
                sommeMultiple3T1 +=chiffre;
            }
        }

        int sommeMultiple3T2=0;
        for(int chiffre:t2){
            if(chiffre%3==0){
                sommeMultiple3T2 +=chiffre;
            }
        }


        int sommeMultiple3T3=0;
        for(int chiffre:t3){
            if(chiffre%3==0){
                sommeMultiple3T3 +=chiffre;
            }
        }

        int somme=sommeMultiple3T1+sommeMultiple3T2+sommeMultiple3T3;
        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        System.out.println(Arrays.toString(t2));
        System.out.println(somme);
    }
}
