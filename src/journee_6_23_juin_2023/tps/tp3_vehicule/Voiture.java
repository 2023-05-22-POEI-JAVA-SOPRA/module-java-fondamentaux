package journee_6_23_juin_2023.tps.tp3_vehicule;

class Voiture extends Vehicule {
    public Voiture(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accélère.");
    }
}