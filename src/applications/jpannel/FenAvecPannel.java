
package applications.jpannel;
import javax.swing.*;
import java.awt.*;
public class FenAvecPannel extends JFrame {
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    public FenAvecPannel(String title, Integer larg, Integer haut){
        this.setTitle(title);
        this.setSize(larg, haut);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3); // Com : JFrame.EXIT_ON_CLOSE = 3
        panel.setBackground(Color.gray);
        panel1.setBackground(Color.red);
        panel1.setPreferredSize(new Dimension(larg-10,haut/2-22));
        panel.add(panel1);
        panel2.setBackground(Color.blue);
        panel2.setPreferredSize(new Dimension(larg-10,haut/2-22));
        panel.add(panel2);
        this.add(panel);
    }
    public static void main(String args[]){
        JFrame fenetre = new FenAvecPannel("Titre", 600, 480);
        fenetre.setVisible(true);
    }
}

