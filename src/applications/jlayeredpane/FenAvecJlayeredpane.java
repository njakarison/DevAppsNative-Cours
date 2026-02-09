package applications.jlayeredpane;
import javax.swing.*;
import java.awt.*;
public class FenAvecJlayeredpane extends JFrame{
    // Com : JLayeredPane pour la superposition des autres composants
    private JLayeredPane layers = new JLayeredPane();
    private JLabel fond = new JLabel("Label en arrière-plan");
    private JButton dessus = new JButton("Bouton au-dessus");
    public FenAvecJlayeredpane(String titre){
        this.setTitle(titre);
        fond.setBounds(50, 50, 150, 50);
        fond.setForeground(Color.blue);
        dessus.setBounds(80, 75, 140, 50);
        layers.add(fond, Integer.valueOf(1));
        layers.add(dessus, Integer.valueOf(2));
        this.add(layers);
        this.setSize(300, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        (new FenAvecJlayeredpane(
                "Fenetre avec JLayeredPane")
        ).setVisible(true);
    }
}


