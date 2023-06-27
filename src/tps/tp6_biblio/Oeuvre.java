package tps.tp6_biblio;

class Oeuvre
{
    private String titre;
    private String langue;
    private Auteur auteur;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this(titre, auteur, "francais");
    }

    public String getTitre() {
        return this.titre;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }

    public String getLangue() {
        return this.langue;
    }

    public String afficher() {
        return this.titre + ", " + this.auteur.getNom() + ", en " + this.langue;
    }
}