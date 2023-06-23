package journee_6_23_juin_2023.cours.jeu_video2;


import java.util.ArrayList;

// DRY
public class JeuVideoMain {
    public static void main(String[] args) {
        try{
            var guerrier=new Guerrier("Hercules","AK-47");
            System.out.println(guerrier);
            guerrier.rencontrer();


            var magicien=new Magicien("Harry Poter","Magic magic");
            System.out.println(magicien);
            magicien.rencontrer();

        }catch (IllegalArgumentException e){
            System.err.println("Erreur => "+e.getMessage());
        }
    }
}

// Le noms ne doivent pas comporter des chiffres
// La duree de vie doit toujours etre positive
// L'arme puisse avoir au moins 3 caractere
// Ajouter une duree de vie par defaut(valeur partage)