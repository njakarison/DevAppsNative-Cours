package exemples.relations;

class CompositionVoiture {
    private CompositionMoteur moteur;
    public CompositionVoiture(Float cylindre, Integer puissance){
        moteur = new CompositionMoteur();
        moteur.cylindre = cylindre;
        moteur.puissance = puissance;
    }
}
