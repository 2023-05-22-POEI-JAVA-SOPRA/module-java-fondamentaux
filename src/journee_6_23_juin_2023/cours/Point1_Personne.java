package journee_6_23_juin_2023.cours;


// Constructeur par defaut par defaut
public class Point1_Personne {
    private String nom;
    private String prenom;
    private int age;
    private double poids;
    private boolean estMarie;

    // Surchage
    public Point1_Personne(String nom, String prenom, int age, double poids, boolean estMarie) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.poids = poids;
        this.estMarie = estMarie;
    }

    public Point1_Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public Point1_Personne(){
        this.age=10;
        this.poids=35;
        this.estMarie=false;
        this.nom="Eleve";
        this.prenom="Eleve";
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public double getPoids() {
        return poids;
    }

    public boolean isEstMarie() {
        return estMarie;
    }

    public void setNom(String nom){
        this.nom=nom;
    }
}
