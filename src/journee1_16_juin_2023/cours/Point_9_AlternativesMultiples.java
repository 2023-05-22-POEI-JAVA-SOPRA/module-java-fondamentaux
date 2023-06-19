package journee1_16_juin_2023.cours;

import java.util.Scanner;

public class Point_9_AlternativesMultiples {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue=input.nextLine();
        langue=langue.toLowerCase();// ENGLISH -> english

        if(langue.equals("english")){
            System.out.println("Hello!!");
        }else if(langue.equals("french")){
            System.out.println("Salut!!");
        } else if (langue.equals("spanish")) {
            System.out.println("Holla!!");
        } else if (langue.equals("german")) {
            System.out.println("Guten tag");
        }else {
            System.out.println("Langue non supportee");
        }
    }
}
