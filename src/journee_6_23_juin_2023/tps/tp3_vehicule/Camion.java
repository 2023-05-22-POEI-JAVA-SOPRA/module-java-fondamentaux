package journee_6_23_juin_2023.tps.tp3_vehicule;

class Camion extends Vehicule {
    public Camion(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion démarre.");
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accélère.");
    }
}
