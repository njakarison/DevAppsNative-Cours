
package swing.composants.bases;
import javax.swing.*;
import java.awt.*;
public class CompDeBase extends JFrame {
    //Note: Composant etiquette instance de JLabel
    JLabel etiquette = new JLabel("JLabel : Ceci est une etiquette");
    //Note: Composant zoneDeTexte instance de JTextField
    JTextField zoneDeTexte = new JTextField("JTextField : texte sur une ligne",30);
    //Note: Composant saisieCachee instance de JPasswordField
    JPasswordField saisieCachee = new JPasswordField(30);
    //Note: Composant texteMultiligne instance de JTextArea
    JTextArea texteMultiligne =
            new JTextArea("JTextArea : \nTextes sur plusieurs\nligne", 5, 30);
    //Note: Composant bouton instance de JButton
    JButton bouton = new JButton("Bouton cliquable");
    JTextArea affichage =
            new JTextArea(10,30);
    public CompDeBase(String titre){
        this.setTitle(titre);
        this.setDefaultCloseOperation(3);
        this.setSize(400, 450);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        //Note: Affichage du resultat de
        affichage.setEditable(false);
        affichage.setBackground(Color.darkGray);
        affichage.setForeground(Color.white);
        //Note: Ajout des composant au conteneur
        this.add(etiquette);
        this.add(zoneDeTexte);
        this.add(saisieCachee);
        this.add(texteMultiligne);
        this.add(bouton);
        this.add(affichage);
        //Note: ajouter l'ecouteur de mouvement au bouton
        bouton.addActionListener(e -> affichage.setText(action(bouton)));
    }
    private String action(Component source){
        String afficher = "Les cotenus sont :\n";
        if(source == bouton){
            afficher += "Etiquette :\n\t" + etiquette.getText() + "\n" ;
            afficher += "Zone de saisie :\n\t" + zoneDeTexte.getText() + "\n" ;
            afficher += "Pass :\n\tJPasswordField\n\t" + saisieCachee.getText() + "\n" ;
            afficher += "Zone de texte :\n\t" +texteMultiligne.getText() + "\n" ;
        }
        return  afficher;
    }
    public static void main(String arg[]){
        JFrame fen = new CompDeBase("Composants de base");
        fen.setVisible(true);
    }
}
