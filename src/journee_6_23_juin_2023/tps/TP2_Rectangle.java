package journee_6_23_juin_2023.tps;

public class TP2_Rectangle {
    private double longueur;
    private double largeur;

    public TP2_Rectangle(double longueur, double largeur) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double longueur) throws IllegalArgumentException {
        if(longueur<=0){
            throw new IllegalArgumentException("La longueur doit etre positive");
        }
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) throws IllegalArgumentException{
        if(largeur<=0){
            throw new IllegalArgumentException("La largeur doit etre positive");
        }
        this.largeur = largeur;
    }
}
