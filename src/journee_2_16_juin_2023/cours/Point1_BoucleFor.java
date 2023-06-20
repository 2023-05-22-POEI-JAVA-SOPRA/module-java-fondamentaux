package journee_2_16_juin_2023.cours;

public class Point1_BoucleFor {
    public static void main(String[] args) {
        // 2 -> 3 : 1 pas, 3 -> 4 : 1 pas, ...
        // debut = 2; fin = 10
//        System.out.println("Le carre de 2 est "+Math.pow(2,2));
//        System.out.println("Le carre de 3 est "+Math.pow(3,2));
//        System.out.println("Le carre de 4 est "+Math.pow(4,2));
//        System.out.println("Le carre de 5 est "+Math.pow(5,2));
//        System.out.println("Le carre de 6 est "+Math.pow(6,2));
//        System.out.println("Le carre de 7 est "+Math.pow(7,2));
//        System.out.println("Le carre de 8 est "+Math.pow(8,2));
//        System.out.println("Le carre de 9 est "+Math.pow(9,2));
//        System.out.println("Le carre de 10 est "+Math.pow(10,2));

        // nombre = 2
        // nombre=nombre+1 <=> nombre +=1
        for(int nombre=2;nombre<=100;nombre+=1){
            double carre=Math.pow(nombre,2);
            System.out.printf("Le carre de %d est %.1f\n",nombre,carre);
        }
    }
}
