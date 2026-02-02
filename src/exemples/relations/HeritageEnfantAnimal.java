package exemples.relations;

class HeritageEnfantAnimal extends HeritageParentAnimal {
    public HeritageEnfantAnimal(String nom){
        this.nom = nom;
    }
    void aboyer(){
        System.out.println("Wouf !");
    }
}
