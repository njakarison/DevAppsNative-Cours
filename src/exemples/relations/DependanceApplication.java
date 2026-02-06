package exemples.relations;

class DependanceApplication {
    public void executer() {
        DependanceFacture f = new DependanceFacture(150);
        DependanceImprimante imp = new DependanceImprimante();
        imp.imprimerFacture(f);
    }
}
