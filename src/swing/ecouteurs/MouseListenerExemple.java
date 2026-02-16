package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Note: Implémenter le JFrame par l'écouteur du souris MouseListener
public class MouseListenerExemple extends JFrame implements MouseListener {
    JLabel myLabel = new JLabel("Ceci est un label");
    public MouseListenerExemple(String titre){
        setTitle(titre);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        myLabel.setForeground(Color.BLUE);
        //Com: ajout de l'écouteur du souris implémenté au JFrame
        myLabel.addMouseListener(this);
        add(myLabel);
    }
    //Note: Implémentation des methodes de MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        //Com: instruction à exécuter lors du click sur le souris
        JOptionPane.showMessageDialog(null,"Le label a été cliqué");
    }
    @Override
    public void mousePressed(MouseEvent e) { }
    @Override
    public void mouseReleased(MouseEvent e) {
        JOptionPane.showMessageDialog(null,"Le souris a été relaché");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(null,"Le souris a été entrée ");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        JOptionPane.showMessageDialog(null,"Le souris a quitté le label ");
    }
    public static void main(String args[]){
        new MouseListenerExemple("Avec MouseListener").setVisible(true);
    }
}

