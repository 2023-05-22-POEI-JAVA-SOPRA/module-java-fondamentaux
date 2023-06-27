package journee_6_23_juin_2023.tps.tp3_vehicule;

public class Main {
    public static void main(String[] args) {
        // Test de la classe Voiture
        Voiture voiture = new Voiture(2022, 25000);
        voiture.demarrer();
        voiture.accelerer();
        System.out.println(voiture);

        // Test de la classe Camion
        Camion camion = new Camion(2021, 50000);
        camion.demarrer();
        camion.accelerer();
        System.out.println(camion);
    }
}
