

package swing.layoutmanagers;
import javax.swing.*;
public class BoxLayoutMgr extends JFrame {
    JPanel panel = new JPanel();
    //Com: Définition du layout du frame comme BoxLayout
    private BoxLayout layout;
    public BoxLayoutMgr(String titre){
        setTitle(titre);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(400,250);
        //Com: Application du layout au panel
        // X_AXIS = 0, Y_AXIS = 1, PAGE_AXIS=3, LINE_AXIS=2
        // layout = new BoxLayout(panel,BoxLayout.X_AXIS);
        layout = new BoxLayout(panel,BoxLayout.X_AXIS);
        panel.setLayout(layout);
        add(panel);
        //Com: Positionnement des composants dans le layout
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
    }
    public static void main(String args[]){
        (new BoxLayoutMgr("Box layout manager ")).setVisible(true);
    }
}

