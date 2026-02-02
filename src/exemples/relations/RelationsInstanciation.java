package exemples.relations;

public class RelationsInstanciation {
    static HeritageEnfantAnimal chien = new HeritageEnfantAnimal("Milou");
    public static void main(String args[]){
        // methode propre de la classe
        chien.aboyer();
        // methodes de la classe parent comme héritage
        chien.manger();
        chien.dormir();
    }
}