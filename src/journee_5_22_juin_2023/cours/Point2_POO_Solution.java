package journee_5_22_juin_2023.cours;

import java.util.ArrayList;
import java.util.Scanner;

public class Point2_POO_Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Rectangle rectangle;
        rectangle= new Rectangle();
        System.out.println("rectangle : "+rectangle);
        rectangle.longueur=500;
        rectangle.largeur=250;
        System.out.println(rectangle.calculSurface());
        System.out.println(rectangle.calculPerimetre());

        Rectangle rectangle2=rectangle;
        System.out.println("rectangle2 : "+rectangle2);

        Rectangle rectangle3=new Rectangle();
        System.out.println("rectangle3 : "+rectangle3);
        rectangle3.longueur=700;
        rectangle3.largeur=320;
        System.out.println(rectangle3.calculSurface());
        System.out.println(rectangle3.calculPerimetre());


        Formulaire inscriptionCricriJunior=new Formulaire();
        inscriptionCricriJunior.age=5;
        inscriptionCricriJunior.nom="Lisangola";
        inscriptionCricriJunior.prenom="Cricri";
        inscriptionCricriJunior.pays="Belgique";

        Formulaire inscriptionAmineLePetit=new Formulaire();
        inscriptionAmineLePetit.age=4;
        inscriptionAmineLePetit.nom="Skali";
        inscriptionAmineLePetit.prenom="Amine Small";
        inscriptionAmineLePetit.pays="France";

        Formulaire inscriptionThomasLeGrand=new Formulaire();
        inscriptionThomasLeGrand.age=-6;
        inscriptionThomasLeGrand.nom="Thomas";
        inscriptionThomasLeGrand.prenom="Anne";
        inscriptionThomasLeGrand.pays="France";


        Avion boeing737Max=new Avion("Boeing","737 Max",200,2003);
        System.out.println(boeing737Max.getMake());
        System.out.println(boeing737Max.getModel());
        System.out.println(boeing737Max.getNumberOfSeats());
        System.out.println(boeing737Max.getYearOfMake());

        boeing737Max.setModel("739 Air");

    }
}


// 1 -> [null]-rectangle
// 2 ->
//     // 2.1 -> new Rectangle():0x433
//     // 2.2 -> [0x433]-rectangle
// 3. -> [0x433]-rectangle2
// 4. -> [0x4674]-rectangle2