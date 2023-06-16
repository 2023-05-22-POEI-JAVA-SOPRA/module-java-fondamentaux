package journee1_16_juin_2023.cours;

import java.util.Scanner;

public class Point_8_StructuresConditionnelles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age=input.nextInt();
        boolean estMajeur=age>=18;
        if(estMajeur){
            System.out.println("Bravo!!!");
        }else{
            System.out.println("Degage!!!");
        }
    }
}
