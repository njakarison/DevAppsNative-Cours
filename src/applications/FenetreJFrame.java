
package applications;

import javax.swing.*;

public class FenetreJFrame extends JFrame {
    // Constructeur de la classe
    public FenetreJFrame() {
        // Le titre de l'application
        super("Titre de l'application");
//        WindowListener l = new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        };
//        addWindowListener(l);
        setSize(600,480);
        setLocationRelativeTo(null);
    }
    public static void main(String [] args){
        FenetreJFrame fenetre = new FenetreJFrame();
        fenetre.setVisible(true);
    }
}


