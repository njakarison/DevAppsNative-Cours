package applications.jtabbedpane;
import javax.swing.*;
public class FenAvecJtabbedpane extends JFrame {
    private JTabbedPane tabs = new JTabbedPane();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    public FenAvecJtabbedpane(){
        p1.add(new JLabel("Contenu Onglet 1"));
        p2.add(new JButton("Bouton Onglet 2"));
        JTextArea txt = new JTextArea(3,10);
        txt.setText("Ceci est le texte par defaut");
        p3.add(txt);
        tabs.add("Label", p1);
        tabs.add("Bouton", p2);
        tabs.add("Textes", p3);
        this.setTitle("Fenetre avec JTabbedPne");
        this.setSize(480, 300);
        this.add(tabs);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        (new FenAvecJtabbedpane()).setVisible(true);
    }
}


