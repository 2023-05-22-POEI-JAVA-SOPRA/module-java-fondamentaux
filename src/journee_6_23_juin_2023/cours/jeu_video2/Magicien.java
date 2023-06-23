package journee_6_23_juin_2023.cours.jeu_video2;

public class Magicien extends Personnage {
    private String baguetteMagique;

    public Magicien(String nom,String baguetteMagique){
        super(nom);
        this.setBaguetteMagique(baguetteMagique);
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) throws IllegalArgumentException {
        if(baguetteMagique.length()<3){
            throw new IllegalArgumentException("La baguette doit avoir au moins 3 caracteres");
        }
        this.baguetteMagique = baguetteMagique;
    }

    public String toString() {
        return String.format("Nom : %s\nBaguette : %s",this.getNom(),this.baguetteMagique);
    }
}
