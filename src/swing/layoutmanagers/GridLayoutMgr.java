
package swing.layoutmanagers;
import javax.swing.*;
import java.awt.*;
public class GridLayoutMgr extends JFrame {
    //Com: Définition du layout comme GridLayout
    private GridLayout layout = new GridLayout(4,3);
    JPanel panel = new JPanel();
    public GridLayoutMgr(String titre){
        setTitle(titre);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(400,250);
        //Com: Application du layout au panel
        panel.setLayout(layout);
        add(panel);
        //Com: Positionnement des composants dans le layout
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        panel.add(new JButton("11"));
    }
    public static void main(String args[]){
        (new GridLayoutMgr("Grid layout manager ")).setVisible(true);
    }
}


