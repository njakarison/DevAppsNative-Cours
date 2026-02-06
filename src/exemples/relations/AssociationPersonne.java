package exemples.relations;

class AssociationPersonne {
    String nom;
    String telephone;
    AssociationAdresse adrComplet;
    void AssociationAdresse(String nom, String telephone, String[] pays){
        this.nom = nom;
        this.telephone = telephone;
        this.adrComplet.pays = pays[0];
        this.adrComplet.province = pays[1];
        this.adrComplet.ville = pays[2];
        this.adrComplet.rue = pays[3];
    }
}
