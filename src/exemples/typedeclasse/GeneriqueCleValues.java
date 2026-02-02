package exemples.typedeclasse;

public class GeneriqueCleValues <K, V> {

    private K cle;
    private V valeur;

    public GeneriqueCleValues(K cle, V valeur) {
        this.cle = cle;
        this.valeur = valeur;
    }
    public K getCle() { return cle; }
    public V getValues() {return valeur; }
    // Utilisation dans
    public <T> void afficher(T val){
        System.out.println(val);
    }
}
