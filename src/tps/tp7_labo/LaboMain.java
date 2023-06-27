package tps.tp7_labo;

public class LaboMain {
        public static void main(String[] args) {
            Souris s1 = new Souris(50, "blanche", 2);
            Souris s2 = new Souris(45, "grise");
            Souris s3 = new Souris(s2);

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            s1.evoluer();
            s2.evoluer();
            s3.evoluer();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        }
    }

