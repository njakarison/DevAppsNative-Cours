package swing.ecouteurs;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ChangeListenerExemple extends JFrame {
    private JSlider slider;
    private JTextArea affichage = new JTextArea(6,20);
    private JScrollPane scroll;
    public int i;
    public ChangeListenerExemple(String titre){
        setLayout(new FlowLayout());
        setTitle(titre);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        affichage.setForeground(Color.red);
        scroll = new JScrollPane(affichage);
        slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        i = 0;
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                i += 1;
                affichage.setText(affichage.getText()+ i +"- " + slider.getValue() +"\n");
            }
        });
        add(slider);
        add(scroll);
    }
    public static void main(String arg[]){
        JFrame fen = new ChangeListenerExemple("Utilisation de ChangeListener");
        fen.setVisible(true);
    }
}
