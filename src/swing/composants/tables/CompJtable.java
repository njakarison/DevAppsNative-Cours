
package swing.composants.tables;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class CompJtable extends JFrame {
    //Com: creation du Composant JTable
    private JTable tableJtable;
    //Com: Création du modèle de JTable
    private DefaultTableModel model;
    private JButton bouton = new JButton("Afficher infos");
    private JTextArea affichage =
            new JTextArea("\n    Affichage des infos",8,40);
    public CompJtable(String titre){
        setTitle(titre);
        //Com: Les données à enregistrer dans le tableau
        String[][] capitalPays = {
                {"1", "Canada", "Ottawa"},
                {"2", "Japon", "Tokyo"},
                {"3", "USA", "Washington D.C."},
                {"4", "France", "Paris"},
                {"5", "Madagascar", "Antananarivo"},
                {"6", "Argentine", "Buenos Aires"},
                {"7", "Chine", "Pekin"},
                {"8", "Allemagne", "Berlin"},
                {"9", "Éthiopie", "Addis-Abeba"}
        };
        //Com: Les entêtes correspondantes au tableau
        String[] entete = {"ID", "Pays", "Capital"};
        //Com: Création du modèle à partir des données et de l'entête
        model = new DefaultTableModel(capitalPays, entete);
        //Com: Création du Tableau utilisant le modèle
        tableJtable = new JTable(model);
        //Com: Hauteur des lignes du tableau
        tableJtable.setRowHeight(20);
        tableJtable.setBackground(Color.lightGray);
        //Com: Ajout du tableau dans un JscrollPane (avec ascenseur)
        JScrollPane tableAsc = new JScrollPane(tableJtable);
        //Com: Définition des dimension du JscrollPane
        tableAsc.setPreferredSize(new Dimension(400, 150));
        add(new JLabel("\nCeci est la liste des pays avec leurs capital :\n"));
        add(tableAsc);
        add(bouton);
        bouton.addActionListener(e -> affichage.setText(action(tableJtable)));
        affichage.setBackground(Color.darkGray);
        affichage.setForeground(Color.white);;
        add(affichage);
    }
    //Note: Action à exécuter lors de l'appuie sur le bouton
    private String action(JTable tab){
        String res = "\n    Voici les informations :\n";
        String[] nouveau = {"10","Italie","Rome"};
        int numLigne = tab.getSelectedRow();
        if (numLigne == -1) {
            JOptionPane.showMessageDialog(this,
                    "\n    Veuillez sélectionner une ligne");
            return "\n    Pas de données sélectionnées";
        }else{
            //Com: Ajouter des nouvelles données
            model.addRow(nouveau);
            res += "\t- Id : " + tab.getValueAt(numLigne,0) + "\n";
            res += "\t- Pays : " + tab.getValueAt(numLigne,1) + "\n";
            res += "\t- Capital : " + tab.getValueAt(numLigne,2) + "\n";
            return res;
        }
    }
    public static void main(String[] args) {
        JFrame fen = new CompJtable("Fenetre avec JTable");
        fen.setSize(500, 400);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setLayout(new FlowLayout());
        fen.setLocationRelativeTo(null);
        fen.setVisible(true);
    }
}


