package swing.ecouteurs;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class SelectionJTable extends JFrame {
    private JTable table;
    private JLabel labelResultat;
    DefaultTableModel model;
    public SelectionJTable() {
        setTitle("Sélection dans JTable");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Com:  Création du modèle de données
        String[] colonnes = {"ID", "Nom", "Prénom", "Filière"};
        // Com: exemple - Données venant de la base de données
        Object[][] donnees = {
                {1, "Dupont", "Jean", "Informatique"},
                {2, "Martin", "Sophie", "Mathématiques"},
                {3, "Durand", "Paul", "Physique"},
                {4, "Bernard", "Claire", "Chimie"}
        };

        model = new DefaultTableModel(donnees, colonnes);
        //Com: Alimenter la table (JTable) avec les données
        table = new JTable(model);
        //Com:  Permet la sélection d'une seule ligne
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Com: Ajout de la table dans un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        labelResultat = new JLabel("Aucune ligne sélectionnée");
        add(labelResultat, BorderLayout.SOUTH);
        JButton bouton = new JButton("Afficher sélection");
        add(bouton, BorderLayout.NORTH);
        //Com : selection d'une ligne dans la liste
        ListSelectionModel liste = table.getSelectionModel();
        //Com : ajouter un ecouteur à l'élément de la liste sélectionné
        liste.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int idLigne = table.getSelectedRow();
                String res = "Sélection :\n";
                if(idLigne != -1){
                    for(int i=0; i<= table.getRowCount()-1; i++){
                        res += table.getValueAt(idLigne, i) +"\n";
                    }
                    JOptionPane.showMessageDialog( null, res
                    );
                }
            }
        });
        //Com: Écouteur de sélection de ligne
        table.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                            int ligne = table.getSelectedRow();
                            if (ligne != -1) {
                                Object id = table.getValueAt(ligne, 0);
                                Object nom = table.getValueAt(ligne, 1);
                                Object prenom = table.getValueAt(ligne, 2);
                                Object filiere = table.getValueAt(ligne, 3);
                                labelResultat.setText(
                                        "Sélection : " + id + " - "
                                                + nom + " " + prenom
                                                + " (" + filiere + ")"
                                );
                            }
                    }
                }
        );

        // Com: Écouteur du bouton
        bouton.addActionListener(e -> {
//            int size = model.getRowCount() + 1;
//            model.addRow(new Object[]{String.valueOf(size),"Boribory","Lavalava","Eto"});
            int ligne = table.getSelectedRow();
            if (ligne == -1) {
                JOptionPane.showMessageDialog(this,
                        "Veuillez sélectionner une ligne !");
            } else {
                String nom = table.getValueAt(ligne, 1).toString();
                JOptionPane.showMessageDialog(this,
                        "Étudiant sélectionné : " + nom);
            }
        });
    }

    public static void main(String[] args) {
        new SelectionJTable().setVisible(true);
    }
}
