package tps.tp9_gestion_stock;

class Article {
    private int reference;
    private String nom;
    private double prixVente;
    private int quantiteStock;

    public Article(int reference, String nom, double prixVente, int quantiteStock) {
        this.reference = reference;
        this.nom = nom;
        this.prixVente = prixVente;
        this.quantiteStock = quantiteStock;
    }

    public int getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    @Override
    public String toString() {
        return "Article [reference=" + reference + ", nom=" + nom + ", prixVente=" + prixVente + ", quantiteStock="
                + quantiteStock + "]";
    }

    public void setNom(String nom) {
        this.nom=nom;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente=prixVente;
    }
}