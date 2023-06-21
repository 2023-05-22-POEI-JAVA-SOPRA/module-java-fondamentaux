package journee_1_16_juin_2023.tps;

import java.util.Scanner;

public class TP10Equation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("a : ");
        double a=input.nextDouble();//1

        System.out.print("b : ");
        double b=input.nextDouble();//4;

        System.out.print("c : ");
        double c=input.nextDouble();//1;
        double x1;
        double x2;
        double delta=Math.pow(b,2)-4*a*c;

        if(a==0){
            System.err.println("Le coefficient de x\u00B2 vaut 0. Ce n'est donc pas une" +
                    " équation du 2nd degré");
            System.exit(1);
        }

        System.out.printf("Equation de la forme %.1fx\u00B2 + %.1fx + %.1f = 0 \n\n",a,b
                ,c);

        if(delta>=0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            if(delta==0){
                System.out.println("L'équation admet une seule racine où x1 = x2");
            }
            System.out.printf("x1 = %.2f , x2 = %.2f",x1,x2);
        }else{
            System.out.println("L'équation n'admet aucune racine réelle.");
        }
    }
}
