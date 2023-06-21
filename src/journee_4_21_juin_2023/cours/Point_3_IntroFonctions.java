package journee_4_21_juin_2023.cours;

public class Point_3_IntroFonctions {
    public static void main(String[] args) {
        double longueur=500;
        double largeur=250;
        afficherRectangle(longueur,largeur);
        System.out.println(salutation("Christian"));
        System.out.println(salutation("Maxence"));
    }

    // longueur et largeur sont des parametres
    // longueur = 1, largeur = 1 => 2 variables
    // return 2*(longueur+largeur) => 1

    //calculPerimetre(20000,4500) : v:2, ins : 1
    // calculPerimetre(2000000,100000) : v:2, ins : 1
    // memoire utilisee : constante
    // nombre d'operations : constant

    // Big O notation
    // Runtime complexity : O(1)
    // Space complexity :  O(1)
    static double calculPerimetre(double longueur,double largeur){
//        double perimetre=2*(longueur+largeur);
//        return perimetre;
        return 2*(longueur+largeur);
    }

    // calculPerimetre2(3000,400) : v:3, op : 2
    // Runtime complexity : O(2) -> O(1)
    // Space complexity : O(3) -> O(1)
    static double calculPerimetre2(double longueur,double largeur){
        double perimetre=2*(longueur+largeur);
        return perimetre;
    }

    static double calculSurface(double longueur,double largeur){
        return longueur*largeur;
    }

    static void afficherRectangle(double longueur,double largeur){
        double perimetre=calculPerimetre(longueur,largeur);//longueur et largeur sont des arguments
        double surface=calculSurface(longueur,longueur);
        System.out.println("Perimetre : "+perimetre);
        System.out.println("Surface : "+surface);
    }

    // Runtime : O(1)
    // Space : O(n)
    //  -> nom="Chris" =>[C,h,r,i,s] => [[C], [h], [r], [i], [s] ] -> O(5)
    // -> nom="Abrahimovic" => O(11)
    // -> nom="Julie" => O(5)
    // -> nom="Maxence" => O(7)
    static String salutation(String nom){
        return "Bonjour "+nom;// Bonjour Christian
    }
}
