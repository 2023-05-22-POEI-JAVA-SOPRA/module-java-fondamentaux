package tps.tp6_biblio;

class Auteur {
    private String nom;
    private boolean prime;

    public Auteur(String nom, boolean prime) {
        this.nom = nom;
        this.prime = prime;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean estPrime() {
        return this.prime;
    }


}
