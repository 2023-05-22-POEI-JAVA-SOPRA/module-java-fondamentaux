package journee_6_23_juin_2023.cours.jeu_video2;

public class Guerrier extends Personnage{

    private String arme;

    public Guerrier(String nom,String arme){
        super(nom);
        this.setArme(arme);
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) throws IllegalArgumentException {
        if(arme.length()<3){
            throw new IllegalArgumentException("L'arme doit avoir au moins 3 caracteres");
        }
        this.arme = arme;
    }

    public void rencontrer(){
        System.out.println("Bonjour, je suis un guerrier");
    }

    public String toString() {
        return String.format("Nom : %s\nArme : %s",this.getNom(),this.arme);
    }
}

// Object
