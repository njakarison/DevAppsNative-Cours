
package applications.jscrollpane;
import javax.swing.*;
import java.awt.*;

public class FenAvecJscrollpane extends JFrame {
    private JScrollPane scrlPane;
    private JTextArea txtArea = new JTextArea(5,20);
    public FenAvecJscrollpane(String titre, Integer larg, Integer haut){
        txtArea.setBackground(Color.black);
        txtArea.setForeground(Color.white);
        scrlPane = new JScrollPane(txtArea);
        this.setTitle(titre);
        this.setSize(larg, haut);
        this.add(scrlPane);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        JFrame fenJscrPane = new FenAvecJscrollpane(
                "Fenetre avec JScrollPane",300, 240);
        fenJscrPane.setVisible(true);
    }
}
