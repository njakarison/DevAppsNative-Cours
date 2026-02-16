package swing.ecouteurs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ItemListenerExemple extends JFrame {
    private JCheckBox box1, box2, box3;
    private JTextArea affichage = new JTextArea(8,20);
    private JScrollPane scroll;
    public ItemListenerExemple(String titre){
        box1 = new JCheckBox("Choix 1");
        box2 = new JCheckBox("Choix 2");
        box3 = new JCheckBox("Choix 3");
        setLayout(new FlowLayout());
        setTitle(titre);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        affichage.setForeground(Color.BLUE);
        scroll = new JScrollPane(affichage);
        add(box1); add(box2); add(box3);
        box1.addItemListener(new ItemListener() {@Override
            public void itemStateChanged(ItemEvent e) {
                if(box1.isSelected()){ affichage.setText(affichage.getText()+"- Choix 1 vient d'être selectionné\n");}
            }
        });
        box2.addItemListener(new ItemListener() {@Override
            public void itemStateChanged(ItemEvent e) {
                if(box2.isSelected()){ affichage.setText(affichage.getText()+"- Choix 2 vient d'être selectionné\n"); }
            }
        });
        box3.addItemListener(new ItemListener() {@Override
            public void itemStateChanged(ItemEvent e) {
                if(box3.isSelected()){ affichage.setText(affichage.getText()+"- Choix 3 vient d'être selectionné\n"); }
            }
        });
        add(scroll);
    }
    public static void main(String args[]){
        JFrame fen = new ItemListenerExemple("Utilisation de ItemListener");
        fen.setVisible(true);
    }
}
