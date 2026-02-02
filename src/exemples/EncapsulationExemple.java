package exemples;

public class EncapsulationExemple {
    // 1. private : Seul le compte gère son solde.
    private double solde;
    // 2. public : Interface exposée à tous
    // ** constructeur de la classe.
    public EncapsulationExemple(double soldeInitial) {
        this.solde = soldeInitial;
    }
    // 3. protected : Accessible par les classes enfants .
    protected double tauxInteret;
    // 2. package : Visible seulement par les classes de
    // gestion du même package.
    String codeInterne;
    // Setter : Modi
    public void setSolde(double montant) {
            this.solde += montant;
    }
    public double getSolde() {
        return solde;
    }
}



