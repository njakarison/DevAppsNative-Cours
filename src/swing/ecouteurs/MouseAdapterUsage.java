
package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseAdapterUsage extends JFrame {
    JLabel myLabel = new JLabel("Ceci est un label");
    public MouseAdapterUsage(String titre){
        setTitle(titre);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        myLabel.setForeground(Color.BLUE);
        //Com: ajout de l'écouteur du souris utilisant MouseAdapter()
        // pour ne pas implémenter toute les methodes de MouseListener
        myLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Le label a été cliqué");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Le souris a quitté le label ");
            }
        });
        /* Note: Sans MouseAdapter => l'implémentation est obligatoires
            myLabel.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseEntered(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
            });
          */
        add(myLabel);
    }
    public static void main(String args[]){
        new MouseAdapterUsage("Avec MouseListener").setVisible(true);
    }
}
