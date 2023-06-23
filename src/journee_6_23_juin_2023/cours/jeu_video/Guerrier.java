package journee_6_23_juin_2023.cours.jeu_video;

public class Guerrier {
    // nom, dureDeVie, arme
    private String nom;// Ne dois pas etre vide ou contenir des chiffres
    private int dureeDeVie;
    private String arme;

    public static final int DUREE_DE_VIE_PAR_DEFAUT=300;

    private static int nombreGuerriers=0;


    public Guerrier(String nom,String arme){
//        this();
        this.setNom(nom);
        this.setArme(arme);
        dureeDeVie=DUREE_DE_VIE_PAR_DEFAUT;
        nombreGuerriers++;
    }

    public Guerrier(){
        dureeDeVie=DUREE_DE_VIE_PAR_DEFAUT;
        nombreGuerriers++;
    }

    public static int getNombreGuerriers(){
        return nombreGuerriers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom)throws IllegalArgumentException {
        if(nom.isEmpty() || nom.matches(".*\\d.*")){
            throw new IllegalArgumentException("Le nom ne peut pas etre vide ou contenu des chiffres");
        }
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) throws IllegalArgumentException {
        if(dureeDeVie<=0){
            throw new IllegalArgumentException("La duree doit toujours etre positive");
        }
        this.dureeDeVie = dureeDeVie;
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
}
