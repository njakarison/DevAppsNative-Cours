
package swing.layoutmanagers;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutMgr extends JFrame {
    private JPanel conteneur = new JPanel();
    //Com: Création du layout comme FlowLayout
    private FlowLayout layout =
            //Com: Alignement centre, espacement horiz, esp Vert
            new FlowLayout(FlowLayout.CENTER, 50, 50);
    public FlowLayoutMgr(String titre){
        setTitle(titre);
        setSize(600,300);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        //Com: Définition du layout du panel
        conteneur.setLayout(layout);
        /* Com: ajout des composant de gauche à droite
            et de haut en bas */
        conteneur.add(new JLabel("Nom :"));
        conteneur.add(new JTextField(10));
        conteneur.add(new JLabel("Prénom :"));
        conteneur.add(new JTextField(10));
        conteneur.add(new JButton("Valider"));
        conteneur.add(new JButton("Annuler"));
        conteneur.add(new JButton("Quitter"));
        add(conteneur);
    }
    public static void main(String args[]){
        (new FlowLayoutMgr("Flow layout manager")).setVisible(true);
    }
}

