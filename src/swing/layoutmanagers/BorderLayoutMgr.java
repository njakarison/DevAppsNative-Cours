
package swing.layoutmanagers;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutMgr extends JFrame {
    //Com: création du layout comme BorderLayout
    private BorderLayout layout = new BorderLayout();
    public BorderLayoutMgr(String titre){
        setTitle(titre);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        //Com: Application du layout à la fenetre
        setLayout(layout);
        setSize(450,300);
        //Com: Positionnement des composants dans le layout
        add(new JButton("Nord => Haut"), BorderLayout.NORTH);
        add(new JButton("Sud => Bas"), BorderLayout.SOUTH);
        add(new JButton("Ouest => Gauche"), BorderLayout.WEST);
        add(new JButton("Est => Droite"), BorderLayout.EAST);
        add(new JButton("Centre => Centre"), BorderLayout.CENTER);
    }
    public static void main(String args[]){
        (new BorderLayoutMgr("Border layout manager ")).setVisible(true);
    }
}

