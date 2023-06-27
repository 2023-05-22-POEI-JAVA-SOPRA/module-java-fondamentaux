package journee_6_23_juin_2023.tps.tp3_vehicule;

abstract class Vehicule {
    private static int count = 0;
    private String matricule;
    private int anneeModele;
    private double prix;

    public Vehicule(int anneeModele, double prix) {
        count++;
        this.matricule = "V" + count;
        this.anneeModele = anneeModele;
        this.prix = prix;
    }

    public abstract void demarrer();

    public abstract void accelerer();

    @Override
    public String toString() {
        return "Matricule: " + matricule + ", Année du modèle: " + anneeModele + ", Prix: " + prix;
    }
}