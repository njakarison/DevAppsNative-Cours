package swing.layoutmanagers;
import javax.swing.*;
public class SpringLayoutMgr extends JFrame {
    private SpringLayout layout = new SpringLayout();
    public SpringLayoutMgr() {
        setTitle("Exemple SpringLayout");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(layout);
        JLabel lNom = new JLabel("Nom :");
        JTextField nom = new JTextField(15);
        JLabel lPrenom = new JLabel("Prénom :");
        JTextField prenom = new JTextField(15);
        JButton bouton = new JButton("Valider");
        panel.add(lNom);    panel.add(nom);
        panel.add(lPrenom); panel.add(prenom);  panel.add(bouton);
        //Com: Position du JLabel lNom
        layout.putConstraint(SpringLayout.WEST, lNom,20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lNom,20, SpringLayout.NORTH, panel);
        //Com: Position JTextField nom
        layout.putConstraint(SpringLayout.WEST, nom,20, SpringLayout.EAST, lNom);
        layout.putConstraint(SpringLayout.NORTH, nom,-5, SpringLayout.NORTH, lNom);
        //Com: Position du JLabel lPrenom
        layout.putConstraint(SpringLayout.WEST, lPrenom,20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lPrenom,20, SpringLayout.SOUTH, lNom);
        //Com: Position JTextField prenom
        layout.putConstraint(SpringLayout.WEST, prenom,20, SpringLayout.EAST, lNom);
        layout.putConstraint(SpringLayout.NORTH, prenom,-5, SpringLayout.NORTH, lPrenom);
        //Com: Position JButton bouton
        layout.putConstraint(SpringLayout.SOUTH, bouton,-20, SpringLayout.SOUTH, panel);
        layout.putConstraint(SpringLayout.EAST, bouton,-20, SpringLayout.EAST, panel);
        bouton.addActionListener(e -> System.exit(0));
        add(panel);
    }
    public static void main(String[] args) {
        new SpringLayoutMgr().setVisible(true);
    }
}