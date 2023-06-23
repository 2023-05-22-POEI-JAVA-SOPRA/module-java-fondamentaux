package journee_5_22_juin_2023.tps;

public class TP2_Tirelire {
    private int montant;

    public TP2_Tirelire(int montant) {
        this.montant = montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return montant > 0 ? String.format("Vous avez %d €", montant) : "Vous êtes sans le sou";
    }

    public int getMontant() {
        return montant;
    }

    public void secouer() {
        if (montant > 0) {
            System.out.println("Bing bing!!");
            return;
        }
        System.out.println("Vous êtes sans le sou.");
    }

    public void remplir(int montant) {
        this.montant = montant;
    }

    public void vider() {
        montant = 0;
    }

    public void puiser(int montant) {
        this.montant -= montant;
        if (montant > this.montant) {
            vider();
        }
    }

    public int calculerSolde(int budget) {
        return montant - budget;
    }
}