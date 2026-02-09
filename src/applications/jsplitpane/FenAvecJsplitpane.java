
package applications.jsplitpane;
import javax.swing.*;
import java.awt.*;
public class FenAvecJsplitpane {
    public static void main(String args[]){
        JFrame frame = new JFrame("Fenetre avec JSplitPane");
        JPanel gauche = new JPanel();
        gauche.setBackground(Color.pink);
        gauche.add(new JLabel("Gauche"));
        gauche.setPreferredSize(new Dimension(200,300));
        JPanel droite = new JPanel();
        droite.setBackground(Color.cyan);
        droite.add(new JLabel("Droite"));
        JSplitPane split = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                gauche,
                droite
        );
        frame.add(split);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}

