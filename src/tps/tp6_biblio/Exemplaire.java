package tps.tp6_biblio;

class Exemplaire {
    private Oeuvre oeuvre;
    private String message;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        this.message = "Nouvel exemplaire -> ";
        this.afficher();
    }

    public Exemplaire(Exemplaire exemplaire) {
        this.oeuvre = exemplaire.getOeuvre();
        this.message = "Copie d'un exemplaire de -> ";
        this.afficher();
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public void afficher() {
        System.out.print(this.message + this.oeuvre.afficher() + "\n");
        this.message = "Un exemplaire de ";
    }
}