package exemples.polymorphisme;

class DynamiqueChien extends  DynamiqueAnimal{
    @Override
    void emettreSon() {
        System.out.println("Le chien aboie : Ouaf !");
    }
}
