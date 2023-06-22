package journee_5_22_juin_2023.cours;

public class Point2_POO_Probleme {
    static double calculSurface(double longueur,double largeur){
        return longueur*largeur;
    }
    static double calculPerimetre(double longueur,double largeur){
        return 2*(longueur+largeur);
    }

    public static void main(String[] args) {
        double longueur=500;
        double largeur=250;
        System.out.println("Surface : "+calculSurface(longueur,largeur));
        System.out.println("Perimetre : "+calculPerimetre(longueur,largeur));

        // -> Messages d'affichage : A mettre dans les methodes
        // -> Aucun lien entre les variables(longueur, largeur) et les methodes(surface,perimetre)
        // -> Declarer les variables une seule fois, pour ne pas les appeler a chaque quand on invoque les methodes
        //   surface et perimetre
    }
}
