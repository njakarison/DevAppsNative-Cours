package exemples.typedeclasse;

public record RecordPersonne(String nom, int age, String telephone){
    // On peut ajouter des méthodes personnalisées
    public void afficherInfos(){
        System.out.println(
                "Je suis "+nom+
                ", j'ai "+age+ " ans"+
                ", mon numero est le :"+telephone
        );
    }
}