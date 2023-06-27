package tps.tp8_batiments;


class Main {
    public static void main(String[] args) {
        Batiment b1 = new Batiment("12, Rue du Paradis");
        Maison m1 = new Maison("34, Avenue de la Liberté", 5);

        System.out.println(b1);
        System.out.println(m1);
    }
}
