package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP8PositifNegatifPairImpairV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        byte nombre=input.nextByte();
        boolean estPair=nombre%2==0;//true false

        String parite=estPair?"pair":"impair";
//        String parite="";
//        if(estPair){
//            parite="pair";
//        }else{
//            parite="impair";
//        }
//

        if(nombre>0){
            System.out.printf("%d est posifif et %s",nombre,parite);
        }else if(nombre<0){
            System.out.printf("%d est négatif et %s",nombre,parite);
        }else{
            System.out.printf("0 et pair");
        }
    }
}
