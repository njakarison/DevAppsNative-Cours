
package swing.composants.menus;
import javax.swing.*;
import java.awt.*;
public class CompMenus extends JFrame {
    //Note: Création du composant barre de menu (JMenuBar)
    private JMenuBar barreDeMenu = new JMenuBar();
    //Note: Création des menus Fichier, Edition et Aide (JMenu)
    private JMenu menuFichier = new JMenu("Fichier");
    private JMenu menuEdition = new JMenu("Édition");
    private JMenu menuAide = new JMenu("Aide");
    //Note: Création des sous-menus (JMenuItem)
    private JMenuItem ficNouveau = new JMenuItem("Nouveau");
    private JMenuItem fivOuvrir = new JMenuItem("Ouvrir");
    private JMenuItem fivEnregistrer = new JMenuItem("Enregistrer");
    private JMenuItem ficQuitter = new JMenuItem("Quitter");
    private JMenuItem edtCopier = new JMenuItem("Copier");
    private JMenuItem edtCouper = new JMenuItem("Couper");
    private JMenuItem edtColler = new JMenuItem("Coller");
    private JMenuItem aideAide= new JMenuItem("Aide");
    private JMenuItem aideApropos= new JMenuItem("Apropos");
    public CompMenus(String titre){
        setTitle(titre);
        //Com : Ajout des sous-menus aux menus parents
        menuFichier.add(ficNouveau);
        menuFichier.add(fivOuvrir);
        menuFichier.add(fivEnregistrer);
        //Com : Ajout de séparateur de menu
        menuFichier.addSeparator();
        menuFichier.add(ficQuitter);
        menuEdition.add(edtCopier);
        menuEdition.add(edtCouper);
        menuEdition.add(edtColler);
        //Com : Désactivation de certains sous-menus
        edtCopier.setEnabled(false);
        edtCouper.setEnabled(false);
        menuAide.add(aideAide);
        menuAide.addSeparator();
        menuAide.add(aideApropos);
        //Com : Ajout des menus au barre de menu
        barreDeMenu.add(menuFichier);
        barreDeMenu.add(menuEdition);
        barreDeMenu.add(menuAide);
        //Com : Association du barre de menu au JFrame
        setJMenuBar(barreDeMenu);
        //Com : Ajout d'ecouteur de mouvement aux éléments
        ficQuitter.addActionListener(e -> actionsMenu(ficQuitter));
        aideApropos.addActionListener(e -> actionsMenu(aideApropos));
    }

    private void actionsMenu(JMenuItem source){
        if (source == ficQuitter){System.exit(0);}
        if (source == aideApropos){
            JOptionPane.showMessageDialog(
                    null,
                    "Utilisation des composants menus" +
                            "\nPar: Njakarison M. (2026)");
        }
    }
    public static void main(String[] args) {
        JFrame fen = new CompMenus("Fenetre avec menus");
        fen.setSize(600, 480);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setLayout(new FlowLayout());
        fen.setLocationRelativeTo(null);
        fen.setVisible(true);
    }
}
