
package applications.joptionpane;
import javax.swing.*;
import java.awt.*;
public class FenAvecJoptionpane extends JFrame {
    private JButton msgSimple = new JButton("Message simple");
    private JButton msgErreur = new JButton("Message d'erreur");
    private JButton confirmation = new JButton("Confirmation");
    private JButton boiteSaisie = new JButton("Boite de saisie");
    private JPanel contenu = new JPanel();
    // Com : Constructeur de la fenetre (Partie exécutée lors de l'instanciation)
    public FenAvecJoptionpane(String titre, int wi, int he) {
        this.setTitle(titre);
        this.add(contenu);
        contenu.setBackground(Color.gray);
        // Com : Ajout des composants (bouton) au panel
        contenu.add(msgSimple);
        contenu.add(msgErreur);
        contenu.add(confirmation);
        contenu.add(boiteSaisie);
        this.setSize(wi, he);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        /* Com : Ajout d'écouteur de mouvement aux boutons
            Ceci évoque la methode actions(<Source action>, composant parent)
        */
        msgSimple.addActionListener(e -> actions(msgSimple,this));
        msgErreur.addActionListener(e -> actions(msgErreur,this));
        confirmation.addActionListener(e -> actions(confirmation,this));
        boiteSaisie.addActionListener(e -> actions(boiteSaisie,this));
    }
    // Note : methode action qui choisi le MessageDialog selon la source de l'action
    public void actions(Component source, Component parent) {
        // Com : si la source de l'évènement est le composant msgSimple :
        if (source == msgSimple) {
            JOptionPane.showMessageDialog(null, "Message simple\nOpération réussie");
        }
        // Com : si la source de l'évènement est le composant msgErreur :
        if (source == msgErreur) {
            JOptionPane.showMessageDialog(
                    parent, "Message d'erreur critique", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        // Com : si la source de l'évènement est le composant confirmation :
        if (source == confirmation) {
            int rep = JOptionPane.showConfirmDialog(null, "Voulez-vous continuer ?");
            if (rep == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(parent, "La réponse est OUI");
            }
            if (rep == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(parent, "La réponse est NON");
            }
            if (rep == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(parent, "La réponse est CANCEL");
            }
        }
        // Com : si la source de l'évènement est le composant boiteSaisie :
        if (source == boiteSaisie) {
            String nom = JOptionPane.showInputDialog("Quel est Votre nom ?");
            if(nom == null || nom.isBlank()){
                JOptionPane.showMessageDialog(parent, "Pas de nom saisi ");
            }else {
                JOptionPane.showMessageDialog(parent, "Votre nom est : " + nom);
            }
        }
    }
    // Note : Methode principale main()
    public static void main(String args[]) {
        FenAvecJoptionpane fen = new FenAvecJoptionpane("Fenetre avec JOptionPane", 600, 200);
        fen.setVisible(true);
    }
}
