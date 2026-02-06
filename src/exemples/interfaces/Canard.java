package exemples.interfaces;

class Canard implements Nageur, Voleur {
    String nom;
    public Canard(String nom){
        this.nom = nom;
    }
    @Override
    public void nager() {
        System.out.println(nom+" nage !");
    }
    @Override
    public void voler() {
        System.out.println(nom+" vole !");
    }
}
