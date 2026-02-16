
package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerExemple extends JFrame implements KeyListener {
    JTextArea textes = new JTextArea("Texte initial", 7, 22);
    JLabel etiquette = new JLabel("Etiquette ");
    public KeyListenerExemple(String titre){
        setTitle(titre);
        setSize(300, 200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        textes.setEditable(false);
        etiquette.setForeground(Color.RED);
        add(etiquette);
        JScrollPane scrl = new JScrollPane(textes);
        add(scrl);
        textes.addKeyListener(this);
        etiquette.addKeyListener(this);
    }
    @Override //Note: Ajouter au textarea le caratère de la touche
    public void keyTyped(KeyEvent e) {
        textes.setText(textes.getText()+ e.getKeyChar());
    }
    @Override //Note: afficher sur l'étiquette la touche pressée
    public void keyPressed(KeyEvent e) {
        etiquette.setText("Touche : " + e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String arg[]){
        JFrame fen = new KeyListenerExemple("Exemple utilisant un KeyListener");
        fen.setVisible(true);
    }
}
