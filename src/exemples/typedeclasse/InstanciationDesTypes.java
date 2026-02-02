package exemples.typedeclasse;

public class InstanciationDesTypes {
    static StandardVoiture nissan = new StandardVoiture();
    static AbstractAnimal chien = new AbstractAnimal() {
        @Override
        public void faireDuBruit() {
            System.out.println("Les chiens aboivent");
        }
        @Override
        public void seDeplacer() {
            System.out.println("Les chiens marchent");
        }
    };
    FinalSecuriteMaxi FinalSecmax = new FinalSecuriteMaxi();
    static InnerVoitureMoteur MaVoitureMotorisee = new InnerVoitureMoteur();

    public static void main(String args[]){
        nissan.immatriculation = "WMA 4J9";
        nissan.rouler();
        chien.faireDuBruit();
        chien.seDeplacer();
        MaVoitureMotorisee.rouler();
        ClasseStatique.Configuration config = new ClasseStatique.Configuration();
        config.afficherReseau();
        RecordPersonne me = new RecordPersonne("Njakarison",98, "438 470-1234");
        me.afficherInfos();

        GeneriqueCleValues<String, String> nom = new GeneriqueCleValues<>("Nom", "Njakarison");
        GeneriqueCleValues<String, Integer> age = new GeneriqueCleValues<>("Age", 98);
        System.out.println(
                nom.getCle() + " : "+ nom.getValues()+"\n"
                +age.getCle() + " : "+ age.getValues()
        );
        nom.afficher("Ceci est une chaine, et le suivant un nombre");
        nom.afficher(12);
    }

}
