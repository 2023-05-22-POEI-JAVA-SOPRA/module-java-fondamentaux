package tps.tp6_biblio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Bibliotheque {
    private String nom;
    private ArrayList<Exemplaire> exemplaires = new ArrayList();;

    public Bibliotheque(String nom) {
        this.nom = nom;
        System.out.print("La bibliothèque " + this.nom + " est ouverte !\n");
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbExemplaires(){
        return this.exemplaires.size();
    }

    public void stocker(Oeuvre o) {
        Exemplaire exemplaire = new Exemplaire(o);
        this.exemplaires.add(exemplaire);
    }

    public void stocker(Oeuvre o, int n) {
        for (int i = 0; i < n; i++) {
            Exemplaire exemplaire = new Exemplaire(o);
            this.exemplaires.add(exemplaire);
        }
    }

    public ArrayList<Exemplaire> listerExemplaires() {
        return this.exemplaires;
    }

    public ArrayList<Exemplaire> listerExemplaires(String langue) {
        ArrayList<Exemplaire> exemplairesParLangue = new ArrayList();
        for(Exemplaire exemplaire : this.exemplaires) {
            if(exemplaire.getOeuvre().getLangue() == langue) {
                exemplairesParLangue.add(exemplaire);
            }
        }
        return exemplairesParLangue;
    }

    public int compterExemplaires(Oeuvre oeuvre) {
        int nExemplaires = 0;
        for (Exemplaire exemplaire : this.exemplaires) {
            nExemplaires += exemplaire.getOeuvre() == oeuvre ? 1 : 0;
        }
        return nExemplaires;
    }

    public void afficherAuteur(boolean value) {
        Set<String> nomsAuteurs = new HashSet<>();
        for (Exemplaire exemplaire : this.exemplaires) {
            Auteur auteur = exemplaire.getOeuvre().getAuteur();
            if ((value && auteur.estPrime()) || (!value && !auteur.estPrime())) {
               nomsAuteurs.add(auteur.getNom());
            }
        }

        for (String nomAuteur : nomsAuteurs) {
            System.out.println(nomAuteur);
        }

    }

    public void afficherAuteur() {
        this.afficherAuteur(true);
    }
}
