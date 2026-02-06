package exemples.polymorphisme;

class DynamiqueVache extends DynamiqueAnimal{
    @Override
    void emettreSon() {
        System.out.println("La vache meugle : meuh !");
    }
}
