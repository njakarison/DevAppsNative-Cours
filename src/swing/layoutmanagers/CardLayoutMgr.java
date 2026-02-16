package swing.layoutmanagers;
import javax.swing.*;
import java.awt.*;
//Note: exemple d'utilisation de CardLayoutMgr
public class CardLayoutMgr extends JFrame {
    //Com : Définition du layout comme CardLayout
    private CardLayout cardLayout = new CardLayout();
    public CardLayoutMgr(String titre, Dimension dim) {
        //Com: Panel principal utilisant le layout CardLayout
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(cardLayout);
        //Com: 2 JPanel (rouge/bleu) à ajouter dans le panel principal
        JPanel pageRouge =  new JPanel();
        pageRouge.setBackground(Color.red);
        JPanel pageBleu =  new JPanel();
        pageBleu.setBackground(Color.blue);
        //Com:
        JLabel labelBlue = new JLabel("Page Bleu");
        labelBlue.setForeground(Color.white);
        JLabel labelRouge = new JLabel("Page Rouge");
        labelRouge.setForeground(Color.white);
        //Com: Methodes de la fenetre JFrame
        setTitle(titre);
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        pageRouge.add(labelRouge);
        //Com: ajout des boutons et panels avec images
        JButton boutonRouge = new JButton("Afficher la page bleu");
        pageRouge.add(boutonRouge);
        pageRouge.add(new JLabel(image("/images/tux-logo.png",250,350)));
        pageBleu.add(labelBlue);
        JButton boutonBleu = new JButton("Afficher la page rouge");
        pageBleu.add(boutonBleu);
        pageBleu.add(new JLabel(image("/images/java-img.png",300,300)));
        //Com: Ajout d'écouteur de mouvement sur les boutons
        boutonRouge.addActionListener(e -> cardLayout.show(panelPrincipal, "pageBleu"));
        boutonBleu.addActionListener(e -> cardLayout.show(panelPrincipal, "pageRouge"));
        //Com: ajout des deux panels (rouge/bleu) dans le panel principal
        panelPrincipal.add(pageRouge, "pageRouge");
        panelPrincipal.add(pageBleu, "pageBleu");
        //Com: ajout du panel principal à la fenetre JFrame
        add(panelPrincipal);
    }
    //Note: methode redimensionnant une image pour l'insérer dans un JPanel
    private ImageIcon image(String link, int w, int h){
        Image img = new ImageIcon(getClass().getResource(link)).getImage();
        return new ImageIcon(img.getScaledInstance(w, h, Image.SCALE_SMOOTH));
    }
    public static void main(String[] args) {
        JFrame Fen =  new CardLayoutMgr("Card Layout Manager", new Dimension(300, 440));
        Fen.setVisible(true);
    }
}
