
package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerGetSource extends JFrame implements ActionListener{
    JButton bt1 = new JButton("Premier bouton");
    JButton bt2 = new JButton("Deuxième bouton");
    public ActionListenerGetSource(){
        setTitle("Action Listener with getSource");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        //Com: ajout de l'écouter implémenté par le JFrame(this) aux boutons
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        add(bt1);   add(bt2);
    }
    //Note: Implémentation de la méthode actionPerformed qui est exécuté lors du déclenchement d'un événement
    @Override
    public void actionPerformed(ActionEvent e) {
        //Com: getSource() pour récupérer l'objet source de l'action
        if(e.getSource() == bt1) {
            JOptionPane.showMessageDialog(null,"C'est le bouton 1");
        }
        if (e.getSource() == bt2) {
            JOptionPane.showMessageDialog(null, "Bouton 2 cette fois !");
        }
    }
    public static void main(String[] args) {
        new ActionListenerGetSource().setVisible(true);
    }
}

