package journee_2_16_juin_2023.cours;

import java.util.Scanner;

public class Point4_BoucleWhileCodePin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Veuillez definir un code Pin : ");//1234
        int codePin=input.nextInt();


        int codePinATester=0;

        // 1234!=1111
        while (codePinATester!=codePin){
            System.out.print("Entrez le code Pin pour deverouiller l'appareil : ");
            codePinATester=input.nextInt();
            if(codePinATester!=codePin){
                System.out.println("Code Pin incorrect, veuillez recommencer.");
            }
        }

//        do {
//            System.out.print("Entrez le code Pin pour deverouiller l'appareil : ");
//            codePinATester=input.nextInt();
//            if(codePinATester!=codePin){
//                System.out.println("Code Pin incorrect, veuillez recommencer.");
//            }
//        }while(codePinATester!=codePin);
    }
}
