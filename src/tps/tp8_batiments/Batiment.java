package tps.tp8_batiments;

class Batiment {
    private String adresse;

    public Batiment() {
        // Constructeur par défaut
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Bâtiment [adresse=" + adresse + "]";
    }
}