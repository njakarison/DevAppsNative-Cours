package exemples.typedeclasse;

public class InnerVoitureMoteur {
    public void rouler(){
        System.out.println("Ma voiture motorisée Roule");
    }
    class Moteur {
        void demarrer() {
            System.out.println("Vroum !");
        }
    }
}

