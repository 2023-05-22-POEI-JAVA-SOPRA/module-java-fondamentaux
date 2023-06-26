package journee_1_16_juin_2023.cours;

public class Point_5_Affichage {
    public static void main(String[] args) {
        int age=44;
        String firstName="Christian";
        String lastName="Lisangola";
        double weight=34.65;

        System.out.println("Je m'appelle "+firstName+" "+lastName+", j'ai "+age+" ans et je pèse "+weight+" Kg");
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %f Kg.\n",firstName,lastName,age,weight);
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %.1f Kg.\n",firstName,lastName,age,weight);
    }
}
