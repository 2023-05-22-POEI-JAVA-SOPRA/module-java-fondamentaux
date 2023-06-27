package journee_6_23_juin_2023.cours.jeu_video2;

public class Voleur extends Personnage {
    private String outil;

    Voleur(String nom,String outil) {
        super(nom);
        this.outil=outil;
    }

    public String getOutil() {
        return outil;
    }

    public void setOutil(String outil) {
        this.outil = outil;
    }

    @Override
    public void rencontrer() {
        System.out.println("Bonjour, je suis un voleur");
    }
    
}
