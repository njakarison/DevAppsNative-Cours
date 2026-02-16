package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerExemple extends JFrame implements WindowListener {
    JLabel myLabel = new JLabel("Ceci est un label");
    public WindowListenerExemple(String titre){
        setTitle(titre);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        myLabel.setForeground(Color.BLUE);
        add(myLabel);
        addWindowListener(this);
        //Com: ou en utilisant WindowAdapter()
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"La fenetre fermera après");
            } });
    }
    //Note: Implémentation des methodes associées à WindowListener (interface)
    @Override
    public void windowOpened(WindowEvent e) {
        //
        JOptionPane.showMessageDialog(null,"La fenetre s'ouvrira");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        // Note : ceci est une option si addWindowListener(new WindowAdapter() {..}) n'est pas utilisé
        //  JOptionPane.showMessageDialog(null,"La fenetre va être fermer");
    }
    public void windowClosed(WindowEvent e) { }
    public void windowIconified(WindowEvent e) { }
    public void windowDeiconified(WindowEvent e) { }
    public void windowActivated(WindowEvent e) { }
    public void windowDeactivated(WindowEvent e) { }
    public static void main(String arg[]){
        JFrame fen = new WindowListenerExemple("Utilisation de WindowListner");
        fen.setVisible(true);
    }
}
