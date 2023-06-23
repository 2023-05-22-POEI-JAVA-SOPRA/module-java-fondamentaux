package journee_6_23_juin_2023.tps;

public class TP1_Tirelire {
    private int montant;

    public TP1_Tirelire(int montant) {
        this.remplir(montant);
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

    public void remplir(int montant) throws IllegalArgumentException {
        if(montant<=0){
            throw new IllegalArgumentException("Seuls les montants positifs sont acceptes");
        }
        this.montant = montant;
    }

    public void vider() {
        montant = 0;
    }

    public void puiser(int montant) throws IllegalArgumentException{
        if(montant<=0){
            throw new IllegalArgumentException("Seuls les montants positifs sont acceptes");
        }
        this.montant -= montant;
        if (montant > this.montant) {
            vider();
        }
    }

    public int calculerSolde(int budget) throws IllegalArgumentException {
        if(budget<=0){
            throw new IllegalArgumentException("La valeur du budget soit etre positive");
        }
        return montant - budget;
    }
}