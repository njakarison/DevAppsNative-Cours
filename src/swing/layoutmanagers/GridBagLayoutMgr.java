
package swing.layoutmanagers;
import javax.swing.*;
import java.awt.*;
public class GridBagLayoutMgr extends JFrame {
    JPanel panel = new JPanel();
    //Com: Définition du layout du frame comme GridBagLayout
    private GridBagLayout layout = new GridBagLayout();
    public GridBagLayoutMgr(String titre){
        setTitle(titre);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(400,250);
        //Com: Application du layout au panel
        panel.setLayout(layout);
        //Com: GridBagConstraints permet de définir pour chaque composant :
        // sa position, sa taille, son alignement, son comportement
        GridBagConstraints gbc = new GridBagConstraints();
        //Com: ajoute des marges autour de chaque composant :
        gbc.insets = new Insets(5, 5, 5, 5);
        //Com: Les champs de texte s’étendent horizontalement
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //Com: Positionnement - Chaque composant est placé comme dans une grille
        // gridx -> colonne, gridy -> ligne
        // (0,0)   (1,0)   (2,0)
        // (0,1)   (1,1)   (2,1)
        // ...      ...     ...
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Nom :"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        // Com: gbc.gridwidth = 2 => le composant occupe 2 colonnes
        gbc.gridwidth = 2;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        panel.add(new JLabel("Prénom :"), gbc);
        gbc.gridx = 1; gbc.gridy = 1; gbc.gridwidth = 2;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        panel.add(new JLabel("Email :"), gbc);
        gbc.gridx = 1; gbc.gridy = 2; gbc.gridwidth = 2;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 1;
        panel.add(new JLabel("Mot de passe :"), gbc);
        gbc.gridx = 1; gbc.gridy = 3; gbc.gridwidth = 2;
        panel.add(new JPasswordField(15), gbc);

        gbc.gridx = 1; gbc.gridy = 4; gbc.gridwidth = 1;
        panel.add(new JButton("Valider"), gbc);
        gbc.gridx = 2; gbc.gridy = 4;
        panel.add(new JButton("Annuler"), gbc);

        add(panel);
        //Com: Positionnement des composants dans le layout
    }
    public static void main(String args[]){
        (new GridBagLayoutMgr("Box layout manager ")).setVisible(true);
    }
}
