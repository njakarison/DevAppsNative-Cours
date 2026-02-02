
package exemples;

public class Voiture {
    String immatriculation;
    Float poids;
    Integer kilometrage;
    String numSerie;
    void demarrer() { System.out.println("La voiture démarre");}
    void rouler() { System.out.println("La voiture roule");}
    void arreter() { System.out.println("La voiture s'arrête");}
    void afficherInfo(){
        System.out.println("" +
                " Numéro de Série : "+ numSerie +
                " Numéro : "+ immatriculation +
                " Poid : " + poids +
                " Kilométrage : " + kilometrage
        );
    }
    public static void main(String args[]){
        // Instanciation de la classe
        Voiture mazda3 = new Voiture();
        mazda3.immatriculation = "WMA H3X";
        mazda3.poids = 1500f;
        mazda3.kilometrage = 33000;
        mazda3.numSerie = "AN235234542BS8998";
        mazda3.demarrer();
        mazda3.rouler();
        mazda3.arreter();
        mazda3.afficherInfo();
    }
}
