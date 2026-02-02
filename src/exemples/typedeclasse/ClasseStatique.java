package exemples.typedeclasse;

public class ClasseStatique {
    private static String nomReseau = "Cegepgim";
    private int port;
    // Classe Interne Statique
    public static class Configuration {
        public void afficherReseau() {
            // Accès autorisé au membre static du parent
            System.out.println("Réseau : " + nomReseau);
            // ERREUR : System.out.println(port);
            // Impossible car 'port' n'est pas statique.
        }
    }
}


