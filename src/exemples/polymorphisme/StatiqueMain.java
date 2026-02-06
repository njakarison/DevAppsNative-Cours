package exemples.polymorphisme;

public class StatiqueMain {
    static StatiqueSomme somme = new StatiqueSomme();
    public static void main(String args[]){
        System.out.println(somme.addition(10, 13));
        System.out.println(somme.addition(10, 13, 23));
        System.out.println(somme.addition(3.55f, 45.3f));
    }
}
