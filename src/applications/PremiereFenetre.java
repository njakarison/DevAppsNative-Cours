
// NOTE : Nom du package de l'application
package applications;
// NOTE : importation du package swing
import javax.swing.*;
/* Com : Création de la classe PremiereFenetre qui hérite de la classe JFrame
    JFrame est un composant de la librairie swing : javax.swing.JFrame
 */
public class PremiereFenetre extends JFrame {
    // Com : largeur et hauteur à donner à la fenetre
    private Integer largFen = 800;
    private Integer hautFen = 600;
    // Com : constructeur de la classe
    public PremiereFenetre(){
        // Com : Titre de l'application
        super("Ma premiere fenetre");
        // Com : définir la taille de la fenetre
        this.setSize(largFen, hautFen);
        // Com : Placer la fenetre au milieu de l'écran
        this.setLocationRelativeTo(null);
        /* Note : Autre option
            import java.awt.* //Dimensions et Toolkit
            ...
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int w = (int) screenSize.getWidth();
            int w = (int) screenSize.getHeight();
            this.setBounds(w/2 - largFen/2, h/2 - hautFen/2, largFen, hautFen);
         */
        // Com : L'action par défaut de la fermeture de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Com : this.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE = 3
    }
    // Com : classe principale (maina) de l'application
    public static void main(String args[]){
        // Com : instanciation de l'objet fenetre de la classe PremiereFenetre
        PremiereFenetre fenetre = new PremiereFenetre();
        // Com : rendre la fentre visible
        fenetre.setVisible(true);
    }
}
