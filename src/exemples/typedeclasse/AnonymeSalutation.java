package exemples.typedeclasse;

public class AnonymeSalutation {
    public static void main(String args[]){
        InterfaceSalutation message = new InterfaceSalutation() {
            @Override
            public void saluer(String nom) {
                System.out.println("Bonjour "+nom);
            }
        };
        message.saluer("Njakarison");
    }
}

