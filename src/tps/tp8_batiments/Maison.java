package tps.tp8_batiments;


class Maison extends Batiment {
    private int nbPieces;

    public Maison() {
        // Constructeur par défaut
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbPieces=" + nbPieces + "]";
    }
}


