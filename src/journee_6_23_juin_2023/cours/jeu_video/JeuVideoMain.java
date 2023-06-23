package journee_6_23_juin_2023.cours.jeu_video;

public class JeuVideoMain {
    public static void main(String[] args) {
        try{
            var guerrier=new Guerrier("Hercules","AK-47");

            System.out.println("Nom : "+guerrier.getNom());
            System.out.println("Arme : "+guerrier.getArme());
            System.out.println("Duree de vie : "+guerrier.getDureeDeVie());
            System.out.println("Duree de vie par defaut 1: "+Guerrier.DUREE_DE_VIE_PAR_DEFAUT);
            System.out.println("Nombre des guerriers : "+Guerrier.getNombreGuerriers());

            var guerrier2=new Guerrier("Hulk","M16");

            System.out.println("Nom : "+guerrier2.getNom());
            System.out.println("Arme : "+guerrier2.getArme());
            System.out.println("Duree de vie : "+guerrier2.getDureeDeVie());
            System.out.println("Duree de vie par defaut 2: "+Guerrier.DUREE_DE_VIE_PAR_DEFAUT);
            System.out.println("Nombre des guerriers : "+Guerrier.getNombreGuerriers());

            var g=new Guerrier();
            System.out.println("Nombre guerriers : "+Guerrier.getNombreGuerriers());

        }catch (IllegalArgumentException e){
            System.err.println("Erreur => "+e.getMessage());
        }
    }
}

// Le noms ne doivent pas comporter des chiffres
// La duree de vie doit toujours etre positive
// L'arme puisse avoir au moins 3 caractere
// Ajouter une duree de vie par defaut(valeur partage)