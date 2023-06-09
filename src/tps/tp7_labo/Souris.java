package tps.tp7_labo;

class Souris {

    public static final int ESPERANCE_VIE_DEFAUT = 36;
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    public Souris(int poidsSouris, String couleurSouris, int ageSouris, int evSouris){
        this.poids = poidsSouris;
        this.couleur = couleurSouris;
        this.age = ageSouris;
        this.esperanceVie = evSouris;
        this.clonee = false;
        System.out.print("Une nouvelle souris !\n");
    }

    public Souris(int poidsSouris, String couleurSouris, int ageSouris) {
        this(poidsSouris, couleurSouris, ageSouris, ESPERANCE_VIE_DEFAUT);
    }

    public Souris(int poidsSouris, String couleurSouris) {
        this(poidsSouris, couleurSouris, 0, ESPERANCE_VIE_DEFAUT);
    }

    public Souris(Souris souris) {
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = souris.age;
        this.esperanceVie = (int)(souris.esperanceVie * 0.8);
        this.clonee = true;
        System.out.print("Clonage d'une souris !\n");
    }

    public void evoluer() {
        while(this.age < this.esperanceVie) {
            this.vieillir();
        }
    }

    public void vieillir() {
        this.age += 1;
        if(this.clonee && !this.couleur.equals("verte") && this.age > this.esperanceVie/2) {
            this.couleur = "verte";
        }
    }

    @Override
    public String toString() {
        return "Une souris " +  this.couleur + (this.clonee ? ", clonee," : "") + " de " +  this.age + " mois et pesant " + this.poids +" grammes";
    }

}

