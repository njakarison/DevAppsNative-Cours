package awt;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutMan extends JFrame {

    public FlowLayoutMan() {

        setTitle("Plusieurs FlowLayout");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel haut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        haut.add(new JButton("Fichier"));
        haut.add(new JButton("Edition"));
        haut.add(new JButton("Affichage"));

        JPanel centre = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centre.add(new JLabel("Recherche :"));
        centre.add(new JTextField(15));

        JPanel bas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bas.add(new JButton("OK"));
        bas.add(new JButton("Annuler"));

        add(haut, BorderLayout.NORTH);
        add(centre, BorderLayout.CENTER);
        add(bas, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new FlowLayoutMan().setVisible(true);
    }
}