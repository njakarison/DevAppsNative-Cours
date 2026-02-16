
package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerExemple extends JFrame {
    public ActionListenerExemple() {
        setTitle("Exemple ActionListener");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JButton bouton1 = new JButton("Cliquez ici");
        JButton bouton2 = new JButton("version simple");
        //Com: Ajout l'écouteur de mouvement au bouton
        bouton1.addActionListener(new ActionListener() {
            //Com: exécutée lors du déclenchement de l'événement
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Bouton 1 cliqué !");
            }
        });
        //Com: Utilisation avec Java 8+, Version moderne et plus simple :
        bouton2.addActionListener(e ->JOptionPane.showMessageDialog(null,
                        "Bouton 2 cliqué !")
        );
        add(bouton1);
        add(bouton2);
    }
    public static void main(String[] args) {
        new ActionListenerExemple().setVisible(true);
    }
}
