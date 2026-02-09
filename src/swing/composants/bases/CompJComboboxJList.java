
package swing.composants.bases;
import javax.swing.*;
import java.awt.*;
public class CompJComboboxJList extends JFrame {
    //Com : Composants JComboBox et JList
    private JComboBox<String> comboPays;
    private JList<String> listLangue;
    private JTextArea affichage =
            new JTextArea("Affichage des choix",10,30);
    private JButton bouton = new JButton("Visualiser ");
    // Note: Constructeur de la classe
    public CompJComboboxJList(String titre){
        setTitle(titre);
        //Com : Création d'un tableau contenant les éléments
        String[] pays ={"Canada", "USA", "Mexique", "Madagascar"};
        //Com : Création de la comboPays avec le tableau pays comme choix
        comboPays = new JComboBox<>(pays);
        add(new JLabel("\nChoisissez votre pays de naissance :\n"));
        add(comboPays);
        //Com : Tableau de liste des éléments pour JList
        String[] langue =
           {"Anglais", "Espagnole", "Français", "Portugais", "Malagasy", "Mandarin"};
        //Com: Ajout de la liste d'éléments au JList, listLangue
        listLangue = new JList<>(langue);
        // Com : Nombre d'éléments visible de la liste
        listLangue.setVisibleRowCount(4);
        // Com : Type de selection - single ou multiple (0,1,2)
// Com MULTIPLE_INTERVAL_SELECTION=2, SINGLE_SELECTION=0, SINGLE_INTERVAL_SELECTION=1}
        listLangue.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // Note : JList est souvent placée dans un JScrollPane :
        JScrollPane scrollList = new JScrollPane(listLangue);
        add(new JLabel("\nChoisissez votre langue :\n"));
        add(scrollList);
        add(bouton);
        affichage.setBackground(Color.darkGray);
        affichage.setForeground(Color.white);;
        add(affichage);
        bouton.addActionListener(e -> affichage.setText(resultat()));
    }
    // Note : Méthode évoqué lors de l'appuie sur le bouton
    public String resultat(){
        String res = "Ci-après sont vos choix :\n\n";
        res += "* Pays de naissance :\n";
        res += "\t- " + comboPays.getSelectedItem().toString() + "\n";
        res += "\n* Langue parlé :\n";
        for (String lang : listLangue.getSelectedValuesList()) {
            res += "\t- " + lang + "\n";
        }
        return res;
    }
    public static void main(String[] args){
        CompJComboboxJList fen = new CompJComboboxJList("JComboBox et JList");
        fen.setSize(400, 350);
        fen.setDefaultCloseOperation(3);
        fen.setLocationRelativeTo(null);
        fen.setLayout(new FlowLayout());
        fen.setVisible(true);
    }
}
